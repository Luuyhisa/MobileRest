package za.ac.cput.Mob.repository.Impl;
import org.springframework.stereotype.Repository;
import za.ac.cput.Mob.domain.Customer;
import za.ac.cput.Mob.repository.CustomerRepository;

import java.util.*;

@Repository("InMemory")
public class CustomerRepositoryImp
        implements CustomerRepository {



    private static CustomerRepositoryImp repository = null;
    private Map<String, Customer> customer;

    private CustomerRepositoryImp() {
        this.customer = new HashMap<>();
    }

    public static CustomerRepository getRepository(){
        if(repository == null) repository = new CustomerRepositoryImp();
        return repository;
    }

    public Customer create(Customer customer){
        this.customer.put(customer.getCustID(),customer);
        return customer;
    }

    public Customer read(String customerId){
        //find the student in the set and return it if it exist

        return this.customer.get(customerId);
    }

    public Customer update(Customer customer) {
        // find the student, update it and return the updated student
       this.customer.replace(customer.getCustID(),customer);

        return this.customer.get(customer.getCustID());
    }

    public void delete(String customerId) {
        //find the student and delete it if it exists
        this.customer.remove(customerId);
    }

    public Set<Customer> getAll(){

        Collection<Customer> customers = this.customer.values();
        Set<Customer> set = new HashSet<>();
        set.addAll(customers);
        return set;


    }

}
