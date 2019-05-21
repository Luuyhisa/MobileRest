package za.ac.cput.Mob.repository.Impl;

import za.ac.cput.Mob.domain.Order;
import za.ac.cput.Mob.repository.OrderRepository;

import java.util.HashSet;
import java.util.Set;

public class OrderRepositoryImp
implements OrderRepository {

    private static OrderRepositoryImp repository = null;
    private Set<Order> order;
    private OrderRepositoryImp() {
        this.order = new HashSet<>();
    }
    public static OrderRepositoryImp getRepository(){
        if(repository == null) repository =
                new OrderRepositoryImp();
        return repository;}



    public Set<Order> getAll() {
        return null;
    }

    public Order create(Order order) {
        return null;
    }

    public Order update(Order order) {
        return null;
    }

    public void delete(String s) {

    }

    public Order read(String s) {
        return null;
    }

}
