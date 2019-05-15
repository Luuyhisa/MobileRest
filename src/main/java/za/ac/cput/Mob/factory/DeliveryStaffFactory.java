package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.DeliveryStaff;

public class DeliveryStaffFactory {

    public static DeliveryStaff buildDeliveryStaff(String strDeliver) {
        return new DeliveryStaff.Builder()
                .strDeliver(strDeliver)
                .build();
    }


}
