package za.ac.cput.Mob.repository.Impl;

import za.ac.cput.Mob.domain.EFTPayment;
import za.ac.cput.Mob.repository.EFTPaymentRepository;

import java.util.HashSet;
import java.util.Set;

public class EFTPaymentRepositoryImp
implements EFTPaymentRepository {
private static EFTPaymentRepositoryImp repository = null;
    private Set<EFTPayment> eFTPayment;
    private EFTPaymentRepositoryImp() {
        this.eFTPayment = new HashSet<>();
    }
    public static EFTPaymentRepositoryImp getRepository(){
        if(repository == null) repository =
                new EFTPaymentRepositoryImp();
        return repository;}
    public EFTPayment create(EFTPayment eFTPayment){
        this.eFTPayment.add(eFTPayment);
        return eFTPayment;}

    public EFTPayment read(String eFTPayment){
        //find the student in the set and return it if it exist
        return null;}
    public EFTPayment update(EFTPayment eFTPayment) {
        // find the student, update it and return the updated student
        return null;
    }
    public void delete(String eFTPayment) {
        //find the student and delete it if it exists
    }
    public Set<EFTPayment> getAll(){
        return this.eFTPayment;
    }



}
