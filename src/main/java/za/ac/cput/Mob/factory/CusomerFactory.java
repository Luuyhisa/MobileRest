package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.Customer;

public class CusomerFactory {

    public static Customer getCustomer(String custID,String custName,String custSur,String custddress) {
        return new Customer.Builder()
                .custID(custID)
                .custddress(custddress)
                .custSur(custSur)
                .custName(custName)
                .build();
   }

}
