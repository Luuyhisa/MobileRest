package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.Person;

public class PersonFactory {

    public static Person getCustomer(String address, String strName) {
        return new Person.Builder()
                .address(address).strName(strName)
                .build();
    }

}
