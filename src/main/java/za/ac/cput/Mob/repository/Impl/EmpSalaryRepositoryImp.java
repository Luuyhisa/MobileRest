package za.ac.cput.Mob.repository.Impl;


import za.ac.cput.Mob.domain.EmpSalary;
import za.ac.cput.Mob.repository.EmpSalaryRepository;

import java.util.HashSet;
import java.util.Set;

public class EmpSalaryRepositoryImp implements EmpSalaryRepository{

      private static EmpSalaryRepositoryImp repository = null;
    private Set<EmpSalary> empSalary;


    private EmpSalaryRepositoryImp() {
        this.empSalary = new HashSet<>();
    }
    public static EmpSalaryRepositoryImp getRepository(){
        if(repository == null) repository = new EmpSalaryRepositoryImp();
        return repository;}
    public EmpSalary create(EmpSalary benefits){
       this.empSalary.add(empSalary);
       return empSalary;}
    public EmpSalary read(String empSalaryId){
        //find the student in the set and return it if it exist
        return null;}
    public EmpSalary update(EmpSalary empSalary) {
        // find the student, update it and return the updated student
        return null;
    }
    public void delete(String empSalaryId) {
        //find the student and delete it if it exists
    }
    public Set<EmpSalary> getAll(){
        return this.empSalary;
    }

      /* */

}
