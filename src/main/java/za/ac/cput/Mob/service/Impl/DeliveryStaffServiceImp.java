package za.ac.cput.Mob.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.Mob.domain.DeliveryStaff;
import za.ac.cput.Mob.repository.DeliveryStaffRepository;
import za.ac.cput.Mob.repository.Impl.DeliveryStaffRepositoryImp;
import za.ac.cput.Mob.service.DeliveryStuffService;

import java.util.HashSet;
import java.util.Set;
@Service("DeliveryStaffServiceImp")
public class DeliveryStaffServiceImp
implements DeliveryStuffService {

    @Autowired
    @Qualifier("InMemory")
    private static DeliveryStaffServiceImp service = null;
    private DeliveryStaffRepository repository;

    private DeliveryStaffServiceImp(){
        this.repository = DeliveryStaffRepositoryImp.getRepository();

    }

    public static DeliveryStaffServiceImp getService(){
        if (service==null) service = new DeliveryStaffServiceImp();
        return service;
    }

    @Override
    public Set<DeliveryStaff> getAll() {
        return repository.getAll();
    }

    @Override
    public DeliveryStaff create(DeliveryStaff deliveryStaff) {
        return repository.create(deliveryStaff);
    }

    @Override
    public DeliveryStaff update(DeliveryStaff deliveryStaff) {
        return repository.update(deliveryStaff);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public DeliveryStaff read(String s) {
        return repository.read(s);
    }
}
