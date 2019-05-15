package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.EmpSalary;

public class EmpSalaryFactory {

    public static EmpSalary getCustomer
            (int intEH,int intHW,int intPH) {
        return new EmpSalary.Builder()
                .intExtraHrs(intEH)
                .intHoursWorked(intHW)
                .intPerhour(intPH)
                .build();
    }

}
