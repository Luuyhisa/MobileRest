package za.ac.cput.Mob.service.Impl;

import za.ac.cput.Mob.domain.Name;
import za.ac.cput.Mob.repository.Impl.NameRepositoryImp;
import za.ac.cput.Mob.repository.NameRepository;
import za.ac.cput.Mob.service.NameService;

import java.util.HashSet;
import java.util.Set;

public class NameServiceImp
implements NameService {
    private static NameServiceImp service = null;
    private NameRepository repository;

    private NameServiceImp(){
        this.repository = NameRepositoryImp.getRepository();

    }

    public static NameServiceImp getService(){
        if (service==null) service = new NameServiceImp();
        return service;
    }

    @Override
    public Set<Name> getAll() {
        return repository.getAll();
    }

    @Override
    public Name create(Name name) {
        return repository.create(name);
    }

    @Override
    public Name update(Name name) {
        return repository.update(name);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Name read(String s) {
        return repository.read(s);
    }
}
