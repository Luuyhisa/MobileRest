package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.Order;

import java.util.Set;

public interface OrderRepository
extends IRepository<Order,String>{
    Set<Order> getAll();

}
