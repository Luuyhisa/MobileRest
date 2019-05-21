package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.Employee;

import java.util.Set;

public interface EmployeeService extends IService<Employee,String>{
    Set<Employee> getAll();
}
