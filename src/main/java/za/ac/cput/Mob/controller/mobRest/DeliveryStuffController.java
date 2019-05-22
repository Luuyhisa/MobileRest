package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.DeliveryStaff;
import za.ac.cput.Mob.service.DeliveryStuffService;

import java.util.Set;

@RestController
@RequestMapping("/DeliveryStuff")
public class DeliveryStuffController {
    @Autowired
    @Qualifier("DeliveryStaffServiceImp")
    private DeliveryStuffService service;


    @GetMapping("/read/all")
    @ResponseBody
    public Set<DeliveryStaff> getAll() {
        return service.getAll();
    }
    @PostMapping("/create")
    @ResponseBody
    public DeliveryStaff create(DeliveryStaff type) {
        return service.create(type);
    }
    @PostMapping("/update")
    @ResponseBody
    public DeliveryStaff update(DeliveryStaff type) {
        return service.update(type);
    }
    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(String s) {
        service.delete(s);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public DeliveryStaff read(String s) {
        return service.read(s);
    }
}
