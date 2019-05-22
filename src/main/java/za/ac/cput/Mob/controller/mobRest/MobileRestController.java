package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.MobileRest;
import za.ac.cput.Mob.service.MobileRestService;

import java.util.Set;

@RestController
@RequestMapping("/MobileRest")
public class MobileRestController {
    @Autowired
    @Qualifier("MobileRestServiceImp")
    private MobileRestService service;
    @GetMapping("/read/all")
    @ResponseBody

    public Set<MobileRest> getAll() {
        return service.getAll();
    }
    @PostMapping("/create")
    @ResponseBody
    public MobileRest create(MobileRest type) {
        return service.create(type);
    }
    @PostMapping("/update")
    @ResponseBody
    public MobileRest update(MobileRest type) {
        return service.update(type);
    }
    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(String s) {
        service.delete(s);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public MobileRest read(String s) {
        return service.read(s);
    }
}
