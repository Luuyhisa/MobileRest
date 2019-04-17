package za.ac.cput.Mob.factory;


import za.ac.cput.Mob.domain.Benefits;

public class BenefitFactory {

    public static Benefits getBenefits(String buyingBenefits) {
        return new Benefits.Builder()
                .buyingBenefits(buyingBenefits)
                .build();
    }


}
