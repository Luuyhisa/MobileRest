package za.ac.cput.Mob.repository.Impl;
import za.ac.cput.Mob.domain.Employee;
import za.ac.cput.Mob.domain.Item;
import za.ac.cput.Mob.repository.ItemRepository;
import java.util.HashSet;
import java.util.Set;
public class ItemRepositoryImp implements ItemRepository {
    private static ItemRepositoryImp repository = null;
    private Set<Item> item;

    private ItemRepositoryImp() {
        this.item = new HashSet<>();
    }
    public static ItemRepository getRepository(){
        if(repository == null) repository = new ItemRepositoryImp();
        return repository;
    }
    public Item create(Item item){
        this.item.add(item);
        return item;
    }
    public Item read(String itemId){
        //find the student in the set and return it if it exist
        return null;
    }
    public Item update(Item item) {
        // find the student, update it and return the updated student
        return null;
    }
    public void delete(String employeeId) {
        //find the student and delete it if it exists
    }
    public Set<Item> getAll(){
        return this.item;
    }
}

