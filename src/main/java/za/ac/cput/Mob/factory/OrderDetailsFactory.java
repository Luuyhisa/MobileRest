package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.OrderDetails;

public class OrderDetailsFactory {

    public static OrderDetails buildOrderDetails(int quantity, String taxStatus) {
        return new OrderDetails.Builder()
                .quantity(quantity).taxStatus(taxStatus)
                .build();
    }

}
