package za.ac.cput.Mob.repository.Impl;

import za.ac.cput.Mob.domain.OrderDetails;
import za.ac.cput.Mob.repository.OrderDetailsRepository;

import java.util.HashSet;
import java.util.Set;

public class OrderDetailsRepositoryImp
implements OrderDetailsRepository {

    private static OrderDetailsRepositoryImp repository = null;
    private Set<OrderDetails> orderDetails;
    private OrderDetailsRepositoryImp() {
        this.orderDetails = new HashSet<>();
    }
    public static OrderDetailsRepositoryImp getRepository(){
        if(repository == null) repository =
                new OrderDetailsRepositoryImp();
        return repository;}




    public Set<OrderDetails> getAll() {
        return null;
    }

    public OrderDetails create(OrderDetails orderDetails) {
        this.orderDetails.add(orderDetails);
        return orderDetails;
    }

    public OrderDetails update(OrderDetails orderDetails) {
        return null;
    }

    public void delete(String s) {

    }

    public OrderDetails read(String s) {
        return null;
    }
}
