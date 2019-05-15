package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.Food;

public class FoodFactory {

    public static Food getCustomer(String descrpt,int iAmount,int iPrepTime) {
        return new Food.Builder()
                .descrpt(descrpt).iAmount(iAmount).iPrepTime(iPrepTime)
                .build();
    }

}
