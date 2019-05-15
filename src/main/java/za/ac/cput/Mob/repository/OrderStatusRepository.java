package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.OrderStatus;

import java.util.Set;

public interface OrderStatusRepository
extends IRepository<OrderStatus,String>{
    Set<OrderStatus> getAll();
}
