package za.ac.cput.Mob.controller.mobRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.Employee;
import za.ac.cput.Mob.service.EmployeeService;

import java.util.Set;
@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    @Qualifier("EmployeeServiceImp")
    private EmployeeService service;
    @GetMapping("/read/all")
    @ResponseBody
    public Set<Employee> getAll() {
        return service.getAll();
    }
    @PostMapping("/create")
    @ResponseBody
    public Employee create(Employee type) {
        return service.create(type);
    }
    @PostMapping("/update")
    @ResponseBody
    public Employee update(Employee type) {
        return service.update(type);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(String s) {
        service.delete(s);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public Employee read(String s) {
        return service.read(s);
    }
}
