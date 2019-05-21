package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.Customer;

import java.util.Set;

public interface CustomerService extends IService<Customer,String> {
    Set<Customer> getAll();

}
