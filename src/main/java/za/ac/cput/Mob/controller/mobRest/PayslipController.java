package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.Payslip;
import za.ac.cput.Mob.service.PayslipService;

import java.util.Set;

@RestController
@RequestMapping("/Payslip")
public class PayslipController {
    @Autowired
    @Qualifier("PayslipServiceImp")
    private PayslipService service;
    @GetMapping("/read/all")
    @ResponseBody

    public Set<Payslip> getAll() {
        return service.getAll();
    }
    @PostMapping("/create")
    @ResponseBody
    public Payslip create(Payslip type) {
        return service.create(type);
    }
    @PostMapping("/update")
    @ResponseBody
    public Payslip update(Payslip type) {
        return service.update(type);
    }
    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(String s) {
        service.delete(s);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Payslip read(String s) {
        return service.read(s);
    }
}
