package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.Order;

import java.util.Date;

public class OrderFactory {

    public static Order getCustomer(Date orderDate, int ordernumber) {
        return new Order.Builder()
                .orderDate(orderDate).ordernumber(ordernumber)
                .build();
    }

}
