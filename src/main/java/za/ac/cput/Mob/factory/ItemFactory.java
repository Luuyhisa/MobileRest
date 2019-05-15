package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.Item;

public class ItemFactory {

    public static Item getCustomer(String Descr,int IntItemNumb, int ItemPrice) {
        return new Item.Builder()
                .Descr(Descr).IntItemNumb(IntItemNumb).ItemPrice(ItemPrice)
                .build();
    }


}
