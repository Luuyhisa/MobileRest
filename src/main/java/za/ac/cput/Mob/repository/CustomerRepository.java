package za.ac.cput.Mob.repository;
import za.ac.cput.Mob.domain.Customer;

import java.util.HashSet;
import java.util.Set;
public interface CustomerRepository extends IRepository<Customer, String>{
    Set<Customer> getAll();
}
