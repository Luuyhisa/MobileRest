package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.Inventory;
import za.ac.cput.Mob.service.InventoryService;

import java.util.Set;


@RestController
@RequestMapping("/Inventory")
public class InventoryController {

    @Autowired
    @Qualifier("InventoryServiceImp")
    private InventoryService service;
    @GetMapping("/read/all")
    @ResponseBody
    public Set<Inventory> getAll() {
        return service.getAll();
    }
    @PostMapping("/create")
    @ResponseBody
    public Inventory create(Inventory type) {
        return service.create(type);
    }
    @PostMapping("/update")
    @ResponseBody
    public Inventory update(Inventory type) {
        return service.update(type);
    }
    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(String s) {
        service.delete(s);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public Inventory read(String s) {
        return service.read(s);
    }
}
