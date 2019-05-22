package za.ac.cput.Mob.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.Mob.domain.Customer;
import za.ac.cput.Mob.repository.CustomerRepository;
import za.ac.cput.Mob.repository.Impl.CustomerRepositoryImp;
import za.ac.cput.Mob.service.CustomerService;

import java.util.HashSet;
import java.util.Set;
@Service("CustomerServiceImpl")
public class CustomerServiceImp implements CustomerService {

    @Autowired
    @Qualifier("InMemory")
    private static CustomerServiceImp service = null;

    private CustomerRepository repository;

    private CustomerServiceImp(){
        this.repository = CustomerRepositoryImp.getRepository();
    }
    public static CustomerServiceImp getService(){
        if (service==null) service = new CustomerServiceImp();
        return service;
    }

    @Override
    public Set<Customer> getAll() {
        return repository.getAll();
    }

    @Override
    public Customer create(Customer customer) {
        return repository.create(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return repository.update(customer);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Customer read(String s) {
        return repository.read(s);
    }
}
