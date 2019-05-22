package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.Login;
import za.ac.cput.Mob.service.LoginService;

import java.util.Set;

@RestController
@RequestMapping("/Login")
public class LoginController {
    @Autowired
    @Qualifier("LoginServiceImp")
    private LoginService service;
    @GetMapping("/read/all")
    @ResponseBody

    public Set<Login> getAll() {
        return service.getAll();
    }
    @PostMapping("/create")
    @ResponseBody
    public Login create(Login type) {
        return service.create(type);
    }
    @PostMapping("/update")
    @ResponseBody
    public Login update(Login type) {
        return service.update(type);
    }  @GetMapping("/delete/{id}")
    @ResponseBody

    public void delete(String s) {
        service.delete(s);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public Login read(String s) {
        return service.read(s);
    }
}
