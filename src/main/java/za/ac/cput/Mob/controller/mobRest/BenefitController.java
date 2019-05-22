package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.Benefits;
import za.ac.cput.Mob.service.BenefitService;

import java.util.Set;
    @RestController
    @RequestMapping("/Benefits")
    public class BenefitController{
        @Autowired
        @Qualifier("BenefitServiceImp")
        private BenefitService service;
        @GetMapping("/read/all")
        @ResponseBody
        public Set<Benefits> getAll() {
            return service.getAll();
        }

        @PostMapping("/create")
        @ResponseBody
        public Benefits create(Benefits benefits) {
            return service.create(benefits);
        }
        @PostMapping("/update")
        @ResponseBody
        public Benefits update(Benefits benefits) {
            return service.update(benefits);
        }
        @GetMapping("/delete/{id}")
        @ResponseBody
        public void delete(@PathVariable String id) {
            service.delete(id);
        }
        @GetMapping("/read/{id}")
        @ResponseBody
        public Benefits read(@PathVariable String id) {
            return service.read(id);
        }


    }


