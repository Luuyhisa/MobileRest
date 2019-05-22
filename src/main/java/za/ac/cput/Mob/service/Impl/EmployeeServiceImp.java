package za.ac.cput.Mob.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.Mob.domain.Employee;
import za.ac.cput.Mob.repository.EmployeeRepository;
import za.ac.cput.Mob.repository.Impl.EmployeeRepositoryImp;
import za.ac.cput.Mob.service.EmployeeService;

import java.util.HashSet;
import java.util.Set;
@Service("EmployeeServiceImp")
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    @Qualifier("InMemory")
    private static EmployeeServiceImp service = null;
    private EmployeeRepository repository;

    private EmployeeServiceImp(){
        this.repository = EmployeeRepositoryImp.getRepository();

    }

    public static EmployeeServiceImp getService(){
        if (service==null) service = new EmployeeServiceImp();
        return service;
    }

    @Override
    public Set<Employee> getAll() {
        return repository.getAll();
    }

    @Override
    public Employee create(Employee employee) {
        return repository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return repository.update(employee);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Employee read(String s) {
        return repository.read(s);
    }
}
