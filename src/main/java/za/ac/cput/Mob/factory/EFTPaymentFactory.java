package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.EFTPayment;

public class EFTPaymentFactory {


    public static EFTPayment getCustomer(String CardType, String ExpDate, String strCardNo) {
        return new EFTPayment.Builder()
                .CardType(CardType).ExpDate(ExpDate).strCardNo(strCardNo)
                .build();
    }




}
