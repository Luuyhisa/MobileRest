package za.ac.cput.Mob.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.Mob.domain.Payslip;
import za.ac.cput.Mob.repository.Impl.PayslipRepositoryImp;
import za.ac.cput.Mob.repository.PayslipRepository;
import za.ac.cput.Mob.service.PayslipService;

import java.util.HashSet;
import java.util.Set;
@Service("CustomerServiceImpl")
public class PayslipServiceImp
implements PayslipService {
    @Autowired
    @Qualifier("InMemory")
    private static PayslipServiceImp service = null;
    private PayslipRepository repository;
    private PayslipServiceImp(){
        this.repository = PayslipRepositoryImp.getRepository();
    }
    public static PayslipServiceImp getService(){
        if (service==null) service = new PayslipServiceImp();
        return service;
    }
    @Override
    public Set<Payslip> getAll() {
        return repository.getAll();
    }
    @Override
    public Payslip create(Payslip payslip) {
        return repository.create(payslip);
    }
    @Override
    public Payslip update(Payslip payslip) {
        return repository.update(payslip);
    }
    @Override
    public void delete(String s) {
        repository.delete(s);
    }
    @Override
    public Payslip read(String s) {
        return repository.read(s);
    }
}
