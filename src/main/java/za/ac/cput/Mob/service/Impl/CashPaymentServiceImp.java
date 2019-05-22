package za.ac.cput.Mob.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.Mob.domain.CashPayment;
import za.ac.cput.Mob.repository.CashPaymentRepository;
import za.ac.cput.Mob.repository.Impl.CashPaymentRepositoryImp;
import za.ac.cput.Mob.service.CashPaymentService;

import java.util.HashSet;
import java.util.Set;
@Service("CashPaymentServiceImp")
public class CashPaymentServiceImp

        implements CashPaymentService {
    @Autowired
    @Qualifier("InMemory")
    private static CashPaymentServiceImp service = null;

    private CashPaymentRepository repository;

    private CashPaymentServiceImp(){
        this.repository = CashPaymentRepositoryImp.getRepository();

    }

    public static CashPaymentServiceImp getService(){
        if (service==null) service = new CashPaymentServiceImp();
        return service;
    }

    @Override
    public Set<CashPayment> getAll() {
        return repository.getAll();
    }

    @Override
    public CashPayment create(CashPayment cashPayment) {
        return repository.create(cashPayment);
    }

    @Override
    public CashPayment update(CashPayment cashPayment) {
        return repository.update(cashPayment);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public CashPayment read(String s) {
        return repository.read(s);
    }
}
