package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.ManagementStaff;
import za.ac.cput.Mob.service.ManagementStaffService;

import java.util.Set;

@RestController
@RequestMapping("/ManagementStuff")
public class ManagementStuffController {

    @Autowired
    @Qualifier("ManagementStaffServiceImp")
    private ManagementStaffService service;
    @GetMapping("/read/all")
    @ResponseBody

    public Set<ManagementStaff> getAll() {
        return service.getAll();
    }
    @PostMapping("/create")
    @ResponseBody
    public ManagementStaff create(ManagementStaff type) {
        return service.create(type);
    }
    @PostMapping("/update")
    @ResponseBody
    public ManagementStaff update(ManagementStaff type) {
        return service.update(type);
    }
    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(String s) {
        service.delete(s);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public ManagementStaff read(String s) {
        return service.read(s);
    }
}
