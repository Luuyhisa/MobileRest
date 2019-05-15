package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.Inventory;

public class InventoryFactory {

    public static Inventory buildInventory(int itemNum, int itemQuantity) {
        return new Inventory.Builder()
                .itemNum(itemNum).itemQuantity(itemQuantity)
                .build();
    }

}
