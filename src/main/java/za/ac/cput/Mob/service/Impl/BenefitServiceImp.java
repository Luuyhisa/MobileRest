package za.ac.cput.Mob.service.Impl;

import za.ac.cput.Mob.domain.Benefits;
import za.ac.cput.Mob.repository.BenefitRepository;
import za.ac.cput.Mob.repository.Impl.BenefitRepositoryImp;
import za.ac.cput.Mob.service.BenefitService;

import java.util.Set;

public class BenefitServiceImp
        implements BenefitService {


    private static BenefitServiceImp service = null;
    private BenefitRepository repository;

    private BenefitServiceImp(){
        this.repository = BenefitRepositoryImp.getRepository();

    }

    public static BenefitServiceImp getService(){
        if (service==null) service = new BenefitServiceImp();
        return service;
    }

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
