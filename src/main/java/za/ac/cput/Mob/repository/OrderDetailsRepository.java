package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.OrderDetails;

import java.util.Set;

public interface OrderDetailsRepository
extends IRepository<OrderDetails,String>{
Set<OrderDetails> getAll();
}
