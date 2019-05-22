package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.service.FoodService;

import java.util.Set;

@RestController
@RequestMapping("/Food")
public class Food {
    @Autowired
    @Qualifier("FoodServiceImp")
    private FoodService service;
    @GetMapping("/read/all")
    @ResponseBody
    public Set<za.ac.cput.Mob.domain.Food> getAll() {
        return service.getAll();
    }
    @PostMapping("/create")
    @ResponseBody
    public za.ac.cput.Mob.domain.Food create(za.ac.cput.Mob.domain.Food type) {
        return service.create(type);
    }
    @PostMapping("/update")
    @ResponseBody
    public za.ac.cput.Mob.domain.Food update(za.ac.cput.Mob.domain.Food type) {
        return service.update(type);
    }
    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(String s) {
        service.delete(s);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public za.ac.cput.Mob.domain.Food read(String s) {
        return service.read(s);
    }
}
