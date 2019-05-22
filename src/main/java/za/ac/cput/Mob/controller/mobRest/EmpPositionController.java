package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.EmpPosition;
import za.ac.cput.Mob.service.EmpPositionService;

import java.util.Set;

@RestController
@RequestMapping("/EmpPosition")
public class EmpPositionController {

    @Autowired
    @Qualifier("EmpPositionServiceImp")
    private EmpPositionService service;
    @GetMapping("/read/all")
    @ResponseBody
    public Set<EmpPosition> getAll() {
        return service.getAll();
    }
    @PostMapping("/create")
    @ResponseBody
    public EmpPosition create(EmpPosition type) {
        return service.create(type);
    }
    @PostMapping("/update")
    @ResponseBody
    public EmpPosition update(EmpPosition type) {
        return service.update(type);
    }
    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(String s) {
        service.delete(s);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public EmpPosition read(String s) {
        return service.read(s);
    }
}
