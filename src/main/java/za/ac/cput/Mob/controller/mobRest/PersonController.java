package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.Person;
import za.ac.cput.Mob.service.PersonService;

import java.util.Set;

@RestController
@RequestMapping("/Person")
public class PersonController {
    @Autowired
    @Qualifier("PersonServiceImp")
    private PersonService service;
    @GetMapping("/read/all")
    @ResponseBody


    public Set<Person> getAll() {
        return service.getAll();
    }

    @PostMapping("/create")
    @ResponseBody
    public Person create(Person type) {
        return service.create(type);
    }
    @PostMapping("/update")
    @ResponseBody
    public Person update(Person type) {
        return service.update(type);
    }
    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(String s) {
        service.delete(s);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public Person read(String s) {
        return service.read(s);
    }
}
