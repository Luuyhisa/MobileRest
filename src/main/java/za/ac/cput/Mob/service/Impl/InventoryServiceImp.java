package za.ac.cput.Mob.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.Mob.domain.Inventory;
import za.ac.cput.Mob.repository.Impl.InventoryRepositoryImp;
import za.ac.cput.Mob.repository.InventoryRepository;
import za.ac.cput.Mob.service.InventoryService;

import java.util.HashSet;
import java.util.Set;
@Service("InventoryServiceImp")
public class InventoryServiceImp
implements InventoryService {

    @Autowired
    @Qualifier("InMemory")
    private static InventoryServiceImp service = null;
    private InventoryRepository repository;

    private InventoryServiceImp(){
        this.repository = InventoryRepositoryImp.getRepository();

    }

    public static InventoryServiceImp getService(){
        if (service==null) service = new InventoryServiceImp();
        return service;
    }

    @Override
    public Set<Inventory> getAll() {
        return repository.getAll();
    }

    @Override
    public Inventory create(Inventory inventory) {
        return repository.create(inventory);
    }

    @Override
    public Inventory update(Inventory inventory) {
        return repository.update(inventory);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Inventory read(String s) {
        return repository.read(s);
    }
}
