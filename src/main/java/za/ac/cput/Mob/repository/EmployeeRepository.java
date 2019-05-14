package za.ac.cput.Mob.repository;
import za.ac.cput.Mob.domain.Employee;

import java.util.HashSet;
import java.util.Set;
public interface EmployeeRepository extends IRepository<Employee, String> {
    Set<Employee> getAll();
}