package za.ac.cput.Mob.repository.Impl;

import za.ac.cput.Mob.domain.OrderStatus;
import za.ac.cput.Mob.repository.OrderStatusRepository;

import java.util.HashSet;
import java.util.Set;

public class OrderStatusRepositoryImp
implements OrderStatusRepository {
    private static OrderStatusRepositoryImp repository = null;
    private Set<OrderStatus> orderStatus;
    private OrderStatusRepositoryImp() {
        this.orderStatus = new HashSet<>();
    }
    public static OrderStatusRepositoryImp getRepository(){
        if(repository == null) repository =
                new OrderStatusRepositoryImp();
        return repository;}




    public Set<OrderStatus> getAll() {
        return null;
    }

    public OrderStatus create(OrderStatus orderStatus) {
        return null;
    }

    public OrderStatus update(OrderStatus orderStatus) {
        this.orderStatus.add(orderStatus);
        return null;
    }

    public void delete(String s) {

    }

    public OrderStatus read(String s) {
        return null;
    }
}
