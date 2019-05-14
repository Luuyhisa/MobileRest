package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.EmpSalary;

import java.util.Set;

public interface EmpSalaryRepository extends IRepository<EmpSalary, String>{
    Set<EmpSalary> getAll();
}
