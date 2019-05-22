package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.EFTPayment;
import za.ac.cput.Mob.service.EFTPaymentService;

import java.util.Set;


@RestController
@RequestMapping("/EFTPayment")
public class EFTPaymentController {

    @Autowired
    @Qualifier("EFTPaymentServiceImp")
    private EFTPaymentService service;
    @GetMapping("/read/all")
    @ResponseBody
    public Set<EFTPayment> getAll() {
        return service.getAll();
    }
    @PostMapping("/create")
    @ResponseBody
    public EFTPayment create(EFTPayment type) {
        return service.create(type);
    }
    @PostMapping("/update")
    @ResponseBody
    public EFTPayment update(EFTPayment type) {
        return service.update(type);
    }
    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(String s) {
        service.delete(s);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public EFTPayment read(String s) {
        return service.read(s);
    }
}
