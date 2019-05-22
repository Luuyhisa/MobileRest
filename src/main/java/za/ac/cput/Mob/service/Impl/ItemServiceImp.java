package za.ac.cput.Mob.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.Mob.domain.Item;
import za.ac.cput.Mob.repository.Impl.ItemRepositoryImp;
import za.ac.cput.Mob.repository.ItemRepository;
import za.ac.cput.Mob.service.ItemService;

import java.util.Set;
@Service("ItemServiceImp")
public class ItemServiceImp implements ItemService {
    @Autowired
    @Qualifier("InMemory")
    private static ItemServiceImp service = null;
    private ItemRepository repository;

    private ItemServiceImp(){
        this.repository = ItemRepositoryImp.getRepository();

    }

    public static ItemServiceImp getService(){
        if (service==null) service = new ItemServiceImp();
        return service;
    }

    @Override
    public Set<Item> getAll() {
        return repository.getAll();
    }

    @Override
    public Item create(Item item) {
        return repository.create(item);
    }

    @Override
    public Item update(Item item) {
        return repository.update(item);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Item read(String s) {
        return repository.read(s);
    }
}

