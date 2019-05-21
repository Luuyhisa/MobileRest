package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.OrderStatus;

import java.util.Set;

public interface OrderStatusService extends IService<OrderStatus,String> {
Set<OrderStatus> getAll();
}
