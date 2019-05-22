package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.Payment;
import za.ac.cput.Mob.service.PaymentService;

import java.util.Set;

@RestController
@RequestMapping("/Payment")
public class PaymentController {

    @Autowired
    @Qualifier("PaymentServiceImp")
    private PaymentService service;
    @GetMapping("/read/all")
    @ResponseBody

    public Set<Payment> getAll() {
        return service.getAll();
    }
    @PostMapping("/create")
    @ResponseBody
    public Payment create(Payment type) {
        return service.create(type);
    }
    @PostMapping("/update")
    @ResponseBody
    public Payment update(Payment type) {
        return service.update(type);
    }
    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(String s) {
        service.delete(s);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public Payment read(String s) {
        return service.read(s);
    }
}
