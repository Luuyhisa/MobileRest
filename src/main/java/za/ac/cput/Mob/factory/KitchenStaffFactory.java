package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.KitchenStaff;

public class KitchenStaffFactory {

    public static KitchenStaff getCustomer(String cook, String foodUpdate) {
        return new KitchenStaff.Builder()
                .cook(cook).foodUpdate(foodUpdate)
                .build();
    }


}
