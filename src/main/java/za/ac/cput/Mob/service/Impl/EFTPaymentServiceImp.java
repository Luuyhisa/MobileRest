package za.ac.cput.Mob.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.Mob.domain.EFTPayment;
import za.ac.cput.Mob.repository.EFTPaymentRepository;
import za.ac.cput.Mob.repository.Impl.EFTPaymentRepositoryImp;
import za.ac.cput.Mob.service.EFTPaymentService;

import java.util.HashSet;
import java.util.Set;
@Service("EFTPaymentServiceImp")

public class EFTPaymentServiceImp
implements EFTPaymentService {

    @Autowired
    @Qualifier("InMemory")
    private static EFTPaymentServiceImp service = null;
    private EFTPaymentRepository repository;

    private EFTPaymentServiceImp(){
        this.repository = EFTPaymentRepositoryImp.getRepository();

    }

    public static EFTPaymentServiceImp getService(){
        if (service==null) service = new EFTPaymentServiceImp();
        return service;
    }

    @Override
    public Set<EFTPayment> getAll() {
        return repository.getAll();
    }

    @Override
    public EFTPayment create(EFTPayment eftPayment) {
        return repository.create(eftPayment);
    }

    @Override
    public EFTPayment update(EFTPayment eftPayment) {
        return repository.update(eftPayment);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public EFTPayment read(String s) {
        return repository.read(s);
    }
}
