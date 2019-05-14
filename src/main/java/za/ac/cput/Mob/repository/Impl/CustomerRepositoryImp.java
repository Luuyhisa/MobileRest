package za.ac.cput.Mob.repository.Impl;
import za.ac.cput.Mob.domain.Customer;
import za.ac.cput.Mob.repository.CustomerRepository;
import java.util.HashSet;
import java.util.Set;
public class CustomerRepositoryImp implements CustomerRepository {



    private static CustomerRepositoryImp repository = null;
    private Set<Customer> customer;

    private CustomerRepositoryImp() {
        this.customer = new HashSet<>();
    }

    public static CustomerRepository getRepository(){
        if(repository == null) repository = new CustomerRepositoryImp();
        return repository;
    }

    public Customer create(Customer customer){
        this.customer.add(customer);
        return customer;
    }

    public Customer read(String customerId){
        //find the student in the set and return it if it exist
        return null;
    }

    public Customer update(Customer customer) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String customerId) {
        //find the student and delete it if it exists

    }

    public Set<Customer> getAll(){
        return this.customer;
    }

}
