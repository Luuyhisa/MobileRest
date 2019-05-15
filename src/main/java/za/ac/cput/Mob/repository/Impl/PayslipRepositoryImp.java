package za.ac.cput.Mob.repository.Impl;

import za.ac.cput.Mob.domain.Payslip;
import za.ac.cput.Mob.repository.PayslipRepository;

import java.util.HashSet;
import java.util.Set;

public class PayslipRepositoryImp
implements PayslipRepository {

    private static PayslipRepositoryImp repository = null;
    private Set<Payslip> payslip;
    private PayslipRepositoryImp() {
        this.payslip = new HashSet<>();
    }
    public static PayslipRepositoryImp getRepository(){
        if(repository == null) repository =
                new PayslipRepositoryImp();
        return repository;}




    public Set<Payslip> getAll() {
        return null;
    }

    public Payslip create(Payslip payslip) {
        this.payslip.add(payslip);

        return payslip;
    }

    public Payslip update(Payslip payslip) {
        return null;
    }

    public void delete(String s) {

    }

    public Payslip read(String s) {
        return null;
    }
}
