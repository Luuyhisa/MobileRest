package za.ac.cput.Mob.controller.mobRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Mob.domain.Order;
import za.ac.cput.Mob.service.OrderDetailsService;

import java.util.Set;

@RestController
@RequestMapping("/OrderDetails")
public class OrderDetailsController {
    @Autowired
    @Qualifier("OrderDetailstServiceImp")
    private OrderDetailsService service;
    @GetMapping("/read/all")
    @ResponseBody
    public Set<Order> getAll() {
        return service.getAll();
    }
    @PostMapping("/create")
    @ResponseBody
    public Order create(Order type) {
        return service.create(type);
    }
    @PostMapping("/update")
    @ResponseBody
    public Order update(Order type) {
        return service.update(type);
    }
    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(String s) {
        service.delete(s);
    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public Order read(String s) {
        return service.read(s);
    }
}
