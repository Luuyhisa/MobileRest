package za.ac.cput.Mob.service.Impl;

import za.ac.cput.Mob.domain.Payment;
import za.ac.cput.Mob.repository.Impl.PaymentRepositoryImp;
import za.ac.cput.Mob.repository.PaymentRepository;
import za.ac.cput.Mob.service.PaymentService;

import java.util.HashSet;
import java.util.Set;

public class PaymentServiceImp
implements PaymentService {
    private static PaymentServiceImp service = null;
    private PaymentRepository repository;

    private PaymentServiceImp(){
        this.repository = PaymentRepositoryImp.getRepository();

    }

    public static PaymentServiceImp getService(){
        if (service==null) service = new PaymentServiceImp();
        return service;
    }

    @Override
    public Set<Payment> getAll() {
        return repository.getAll();
    }

    @Override
    public Payment create(Payment payment) {
        return repository.create(payment);
    }

    @Override
    public Payment update(Payment payment) {
        return repository.update(payment);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Payment read(String s) {
        return repository.read(s);
    }
}
