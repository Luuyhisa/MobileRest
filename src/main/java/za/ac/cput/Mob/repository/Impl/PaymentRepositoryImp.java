package za.ac.cput.Mob.repository.Impl;

import za.ac.cput.Mob.domain.Payment;
import za.ac.cput.Mob.repository.PaymentRepository;

import java.util.HashSet;
import java.util.Set;

public class PaymentRepositoryImp
implements PaymentRepository {

    private static PaymentRepositoryImp repository = null;
    private Set<Payment> payment;
    private PaymentRepositoryImp() {
        this.payment = new HashSet<>();
    }
    public static PaymentRepositoryImp getRepository(){
        if(repository == null) repository =
                new PaymentRepositoryImp();
        return repository;}




    public Set<Payment> getAll() {
        return null;
    }

    public Payment create(Payment payment) {
        return null;
    }

    public Payment update(Payment payment) {
        return null;
    }

    public void delete(String s) {

    }

    public Payment read(String s) {
        return null;
    }
}
