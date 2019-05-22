package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.CashPayment;
import za.ac.cput.Mob.service.CashPaymentService;

import java.util.Set;

@RestController
@RequestMapping("/CashPayment")
public class CashPaymentController {

    @Autowired
    @Qualifier("CashPaymentServiceImp")
    private CashPaymentService service;


    @PostMapping("/create")
    @ResponseBody
    public CashPayment create(CashPayment type) {
        return service.create(type);
    }
    @PostMapping("/update")
    @ResponseBody
    public CashPayment update(CashPayment type) {
        return service.update(type);
    }
    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(String s) {
        service.delete(s);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public CashPayment read(String s) {
        return service.read(s);
    }
    @GetMapping("/read/all")
    @ResponseBody
    public Set<CashPayment> getAll() {
        return service.getAll();
    }
}
