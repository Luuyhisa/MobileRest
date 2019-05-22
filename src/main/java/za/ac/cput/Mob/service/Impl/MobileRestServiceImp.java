package za.ac.cput.Mob.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.Mob.domain.MobileRest;
import za.ac.cput.Mob.repository.Impl.MobileRestRepositoryImp;
import za.ac.cput.Mob.repository.MobileRestRepository;
import za.ac.cput.Mob.service.MobileRestService;

import java.util.HashSet;
import java.util.Set;
@Service("MobileRestServiceImp")

public class MobileRestServiceImp
implements MobileRestService {
    @Autowired
    @Qualifier("InMemory")
    private static MobileRestServiceImp service = null;
    private MobileRestRepository repository;

    private MobileRestServiceImp(){
        this.repository = MobileRestRepositoryImp.getRepository();

    }

    public static MobileRestServiceImp getService(){
        if (service==null) service = new MobileRestServiceImp();
        return service;
    }

    @Override
    public Set<MobileRest> getAll() {
        return repository.getAll();
    }

    @Override
    public MobileRest create(MobileRest mobileRest) {
        return repository.create(mobileRest);
    }

    @Override
    public MobileRest update(MobileRest mobileRest) {
        return repository.update(mobileRest);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public MobileRest read(String s) {
        return repository.read(s);
    }
}
