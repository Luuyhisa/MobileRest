package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.Customer;
import za.ac.cput.Mob.service.CustomerService;

import java.util.Set;
@RestController
@RequestMapping("/customer")
public class CustomerController {




    @Autowired
   @Qualifier("CustomerServiceImp")
        private CustomerService service;

        @PostMapping("/create")
        @ResponseBody
        public Customer create(Customer customer) {
            return service.create(customer);
        }

        @PostMapping("/update")
        @ResponseBody
        public Customer update(Customer customer) {
            return service.update(customer);
        }

        @GetMapping("/delete/{id}")
        @ResponseBody
        public void delete(@PathVariable String id) {
            service.delete(id);
        }

        @GetMapping("/read/{id}")
        @ResponseBody
        public Customer read(@PathVariable String id) {
            return service.read(id);
        }

        @GetMapping("/read/all")
        @ResponseBody
        public Set<Customer> getAll() {
            return service.getAll();
        }


}
