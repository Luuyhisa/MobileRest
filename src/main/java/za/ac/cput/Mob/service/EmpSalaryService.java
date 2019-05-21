package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.EmpSalary;

import java.util.Set;

public interface EmpSalaryService extends IService<EmpSalary,String> {
    Set<EmpSalary> getAll();

}
