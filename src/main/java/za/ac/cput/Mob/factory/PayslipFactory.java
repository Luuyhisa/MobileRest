package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.Payslip;

public class PayslipFactory {

    public static Payslip buildPayslip(int basicSalary,int netIncome) {
        return new Payslip.Builder()
                .basicSalary(basicSalary).netIncome(netIncome)
                .build();
    }

}
