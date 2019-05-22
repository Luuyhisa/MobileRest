package za.ac.cput.Mob.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.Mob.domain.KitchenStaff;
import za.ac.cput.Mob.repository.Impl.KitchenStaffRepositoryImp;
import za.ac.cput.Mob.repository.KitchenStaffRepository;
import za.ac.cput.Mob.service.KitchenStaffService;

import java.util.HashSet;
import java.util.Set;

@Service("KitchenStaffServiceImp")
public class KitchenStaffServiceImp
implements KitchenStaffService {

    @Autowired
    @Qualifier("InMemory")

    private static KitchenStaffServiceImp service = null;
    private KitchenStaffRepository repository;

    private KitchenStaffServiceImp(){
        this.repository = KitchenStaffRepositoryImp.getRepository();

    }

    public static KitchenStaffServiceImp getService(){
        if (service==null) service = new KitchenStaffServiceImp();
        return service;
    }

    @Override
    public Set<KitchenStaff> getAll() {
        return repository.getAll();
    }

    @Override
    public KitchenStaff create(KitchenStaff type) {
        return repository.create(type);
    }

    @Override
    public KitchenStaff update(KitchenStaff type) {
        return repository.update(type);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public KitchenStaff read(String s) {
        return repository.read(s);
    }
}
