package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.Payslip;

import java.util.Set;

public interface PayslipRepository
extends IRepository<Payslip,String>{
    Set<Payslip> getAll();
}
