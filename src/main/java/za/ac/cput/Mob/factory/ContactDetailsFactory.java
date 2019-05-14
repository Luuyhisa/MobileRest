package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.CContactDetails;

public class ContactDetailsFactory {

    public static CContactDetails  getCContactDetails(String ContactDetail){
        return new CContactDetails.Builder()
                .telNo(ContactDetail).build();

    }



}
