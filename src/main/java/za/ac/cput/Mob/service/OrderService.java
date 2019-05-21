package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.OrderDetails;

import java.util.Set;

public interface OrderService extends IService<OrderDetails,String>{
    Set<OrderDetails> getAll();

}
