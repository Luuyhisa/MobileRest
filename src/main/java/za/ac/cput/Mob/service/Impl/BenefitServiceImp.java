package za.ac.cput.Mob.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.Mob.domain.Benefits;
import za.ac.cput.Mob.repository.BenefitRepository;
import za.ac.cput.Mob.repository.Impl.BenefitRepositoryImp;
import za.ac.cput.Mob.service.BenefitService;

import java.util.Set;
@Service("BenefitServiceImp")
public class BenefitServiceImp
        implements BenefitService {
    @Autowired
    @Qualifier("InMemory")
    private static BenefitServiceImp service = null;
    private BenefitRepository repository;
    private BenefitServiceImp(){
        this.repository = BenefitRepositoryImp.getRepository();
    }
    public static BenefitServiceImp getService(){
        if (service==null) service = new BenefitServiceImp();
        return service;    }
    @Override
    public Set<Benefits> getAll() {
        return repository.getAll();
    }
    @Override
    public Benefits create(Benefits benefits) {
        return repository.create(benefits);
    }
    @Override
    public Benefits update(Benefits benefits) {
        return repository.update(benefits);
    }
    @Override
    public void delete(String s) {
        repository.delete(s);
    }
    @Override
    public Benefits read(String s) {
        return repository.read(s);
    }
}
