package za.ac.cput.Mob.service.Impl;

import za.ac.cput.Mob.domain.OrderStatus;
import za.ac.cput.Mob.repository.Impl.OrderStatusRepositoryImp;
import za.ac.cput.Mob.repository.OrderStatusRepository;
import za.ac.cput.Mob.service.OrderStatusService;

import java.util.HashSet;
import java.util.Set;

public class OrderStatusServiceImp
implements OrderStatusService {
    private static OrderStatusServiceImp service = null;
    private OrderStatusRepository repository;

    private OrderStatusServiceImp(){
        this.repository = OrderStatusRepositoryImp.getRepository();

    }

    public static OrderStatusServiceImp getService(){
        if (service==null) service = new OrderStatusServiceImp();
        return service;
    }

    @Override
    public Set<OrderStatus> getAll() {
        return repository.getAll();
    }

    @Override
    public OrderStatus create(OrderStatus orderStatus) {
        return repository.create(orderStatus);
    }

    @Override
    public OrderStatus update(OrderStatus orderStatus) {
        return repository.update(orderStatus);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public OrderStatus read(String s) {
        return repository.read(s);
    }
}
