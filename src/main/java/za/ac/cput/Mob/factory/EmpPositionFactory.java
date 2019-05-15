package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.EmpPosition;

public class EmpPositionFactory {

    public static EmpPosition getCustomer(int workingShift) {
        return new EmpPosition.Builder()
                .workingShift(workingShift)
                .build();
    }




}
