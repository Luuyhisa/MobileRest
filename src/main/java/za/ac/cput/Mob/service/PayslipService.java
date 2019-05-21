package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.Payslip;

import java.util.Set;

public interface PayslipService extends IService<Payslip,String> {

    Set<Payslip> getAll();
}
