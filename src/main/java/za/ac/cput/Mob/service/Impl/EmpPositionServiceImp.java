package za.ac.cput.Mob.service.Impl;

import za.ac.cput.Mob.domain.EmpPosition;
import za.ac.cput.Mob.repository.EmpPositionRepository;
import za.ac.cput.Mob.repository.Impl.EmpPositionRepositoryImp;
import za.ac.cput.Mob.service.EmpPositionService;

import java.util.HashSet;
import java.util.Set;

public class EmpPositionServiceImp
implements EmpPositionService {
    private static EmpPositionServiceImp service = null;
    private EmpPositionRepository repository;

    private EmpPositionServiceImp(){
        this.repository = EmpPositionRepositoryImp.getRepository();

    }

    public static EmpPositionServiceImp getService(){
        if (service==null) service = new EmpPositionServiceImp();
        return service;
    }

    @Override
    public Set<EmpPosition> getAll() {
        return repository.getAll();
    }

    @Override
    public EmpPosition create(EmpPosition empPosition) {
        return repository.create(empPosition);
    }

    @Override
    public EmpPosition update(EmpPosition empPosition) {
        return repository.update(empPosition);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public EmpPosition read(String s) {
        return repository.read(s);
    }
}
