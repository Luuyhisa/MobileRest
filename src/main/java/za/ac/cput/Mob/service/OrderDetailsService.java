package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.Order;

import java.util.Set;

public interface OrderDetailsService extends IService<Order,String>{

    Set<Order> getAll();
}
