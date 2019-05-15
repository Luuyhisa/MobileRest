package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.OrderStatus;

public class OrderStatusFactory {

    public static OrderStatus buildOrderStatus(String cookingTime,String deliverTime) {
        return new OrderStatus.Builder()
                .cookingTime(cookingTime).deliverTime(deliverTime)
                .build();
    }


}
