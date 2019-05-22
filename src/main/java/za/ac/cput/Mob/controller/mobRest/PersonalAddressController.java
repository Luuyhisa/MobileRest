package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.PersonalAddress;
import za.ac.cput.Mob.service.PersonalAddressService;

import java.util.Set;

@RestController
@RequestMapping("/PersonalAddress")
public class PersonalAddressController {
    @Autowired
    @Qualifier("PersonalAddressServiceImp")
    private PersonalAddressService service;
    @GetMapping("/read/all")
    @ResponseBody


    public Set<PersonalAddress> getAll() {
        return service.getAll();
    }
    @PostMapping("/create")
    @ResponseBody
    public PersonalAddress create(PersonalAddress type) {
        return service.create(type);
    }
    @PostMapping("/update")
    @ResponseBody
    public PersonalAddress update(PersonalAddress type) {
        return service.update(type);
    }
    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(String s) {
        service.delete(s);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public PersonalAddress read(String s) {
        return service.read(s);
    }
}
