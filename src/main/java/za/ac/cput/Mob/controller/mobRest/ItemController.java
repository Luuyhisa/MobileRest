package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.Item;
import za.ac.cput.Mob.service.ItemService;

import java.util.Set;
@RestController
@RequestMapping("/Item")
public class ItemController {

    @Autowired
    @Qualifier("ItemServiceImp")
    private ItemService service;

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Item> getAll() {
        return service.getAll();
    }
    @PostMapping("/create")
    @ResponseBody
    public Item create(Item type) {
        return service.create(type);
    }
    @PostMapping("/update")
    @ResponseBody
    public Item update(Item type) {
        return service.update(type);
    }
    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(String s) {
        service.delete(s);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public Item read(String s) {
        return service.read(s);
    }
}
