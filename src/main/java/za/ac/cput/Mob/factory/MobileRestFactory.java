package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.MobileRest;

public class MobileRestFactory {
    public static MobileRest buildMobileRest(String physicalLoc, String Location) {
        return new MobileRest.Builder()
                .Location(Location).physicalLoc(physicalLoc)
                .build();
    }



}
