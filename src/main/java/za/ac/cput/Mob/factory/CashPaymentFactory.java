package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.CashPayment;

public class CashPaymentFactory {
    public static CashPayment getCustomer(String buyingBenefits) {
        return new CashPayment.Builder()
                .cashBenefits(buyingBenefits)
                .build();
    }
}
