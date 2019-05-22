package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.KitchenStaff;
import za.ac.cput.Mob.service.KitchenStaffService;

import java.util.Set;

@RestController
@RequestMapping("/KitchenStuff")
public class KitchenStuffController {

    @Autowired
    @Qualifier("KitchenStaffServiceImp")
    private KitchenStaffService service;
    @GetMapping("/read/all")
    @ResponseBody

    public Set<KitchenStaff> getAll() {
        return service.getAll();
    }
    @PostMapping("/create")
    @ResponseBody
    public KitchenStaff create(KitchenStaff type) {
        return service.create(type);
    }
    @PostMapping("/update")
    @ResponseBody
    public KitchenStaff update(KitchenStaff type) {
        return service.update(type);
    }
    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(String s) {
        service.delete(s);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public KitchenStaff read(String s) {
        return service.read(s);
    }
}
