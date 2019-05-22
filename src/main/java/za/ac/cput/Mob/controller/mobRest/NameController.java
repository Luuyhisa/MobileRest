package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.Name;
import za.ac.cput.Mob.service.NameService;

import java.util.Set;

@RestController
@RequestMapping("/Name")
public class NameController {
    @Autowired
    @Qualifier("NameServiceImp")
    private NameService service;
    @GetMapping("/read/all")
    @ResponseBody

    public Set<Name> getAll() {
        return service.getAll();
    }
    @PostMapping("/create")
    @ResponseBody
    public Name create(Name type) {
        return service.create(type);
    }
    @PostMapping("/update")
    @ResponseBody
    public Name update(Name type) {
        return service.update(type);
    }
    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(String s) {
        service.delete(s);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public Name read(String s) {
        return service.read(s);
    }
}
