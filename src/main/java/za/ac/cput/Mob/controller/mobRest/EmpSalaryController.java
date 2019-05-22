package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.EmpSalary;
import za.ac.cput.Mob.service.EmpSalaryService;

import java.util.Set;

@RestController
@RequestMapping("/EmpSalary")
public class EmpSalaryController {
    @Autowired
    @Qualifier("EmpSalaryServiceImp")
    private EmpSalaryService service;

    @GetMapping("/read/all")
    @ResponseBody
    public Set<EmpSalary> getAll() {
        return service.getAll();
    }
    @PostMapping("/create")
    @ResponseBody
    public EmpSalary create(EmpSalary type) {
        return service.create(type);
    }
    @PostMapping("/update")
    @ResponseBody
    public EmpSalary update(EmpSalary type) {
        return service.update(type);
    }
    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(String s) {
        service.delete(s);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public EmpSalary read(String s) {
        return service.read(s);
    }
}
