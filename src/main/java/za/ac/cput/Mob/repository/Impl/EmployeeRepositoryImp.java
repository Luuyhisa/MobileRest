package za.ac.cput.Mob.repository.Impl;

import za.ac.cput.Mob.domain.Employee;
import za.ac.cput.Mob.repository.EmployeeRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepositoryImp implements EmployeeRepository {
    private static EmployeeRepositoryImp repository = null;
    private Set<Employee> employee;

    private EmployeeRepositoryImp() {
        this.employee = new HashSet<>();
    }

    public static EmployeeRepository getRepository(){
        if(repository == null) repository = new EmployeeRepositoryImp();
        return repository;
    }
    public Employee create(Employee employee){
        this.employee.add(employee);
        return employee;
    }
    public Employee read(String employeeId){
        //find the student in the set and return it if it exist
        return null;
    }
    public Employee update(Employee employee) {
        // find the student, update it and return the updated student
        return null;
    }
    public void delete(String employeeId) {
        //find the student and delete it if it exists
    }
    public Set<Employee> getAll(){
        return this.employee;
    }
}
