package za.ac.cput.Mob.repository.Impl;

import za.ac.cput.Mob.domain.CashPayment;
import za.ac.cput.Mob.repository.CashPaymentRepository;

import java.util.HashSet;
import java.util.Set;

public class CashPaymentRepositoryImp
         implements CashPaymentRepository {

    private static CashPaymentRepositoryImp repository = null;
    private Set<CashPayment> cashPayment;

    private CashPaymentRepositoryImp() {
        this.cashPayment = new HashSet<>();
    }

    public static CashPaymentRepositoryImp getRepository(){
        if(repository == null) repository
                = new CashPaymentRepositoryImp();
        return repository;
    }

    public CashPayment create(CashPayment cashPayment){
        this.cashPayment.add(cashPayment);
        return cashPayment;
    }

    public CashPayment read(String customerId){
        //find the student in the set and return it if it exist
        return null;
    }

    public CashPayment update(CashPayment cashPayment) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String customerId) {
        //find the student and delete it if it exists

    }

    public Set<CashPayment> getAll(){
        return this.cashPayment;
    }


}
