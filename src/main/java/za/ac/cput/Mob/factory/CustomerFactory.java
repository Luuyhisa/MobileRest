package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.Customer;
import za.ac.cput.Mob.util.Misc;

public class CustomerFactory {

    public static Customer buildCustomer(String custName,String custSur,String custddress) {
        return new Customer.Builder()
                .custID(Misc.generateId())
                .custddress(custddress)
                .custSur(custSur)
                .custName(custName)
                .build();
   }

}
