package za.ac.cput.Mob.repository.Impl;

import za.ac.cput.Mob.domain.Inventory;
import za.ac.cput.Mob.repository.InventoryRepository;

import java.util.HashSet;
import java.util.Set;

public class InventoryRepositoryImp
implements InventoryRepository {
    private static InventoryRepositoryImp repository = null;
    private Set<Inventory> inventory;

    private InventoryRepositoryImp() {
        this.inventory = new HashSet<>();
    }
    public static InventoryRepositoryImp getRepository(){
        if(repository == null) repository =
                new InventoryRepositoryImp();
        return repository;}


    public Set<Inventory> getAll() {
        return null;
    }
    public Inventory create(Inventory inventory) {
        this.inventory.add(inventory);
        return inventory;
    }
    public Inventory update(Inventory inventory) {
        return null;
    }
    public void delete(String s) {
    }
    public Inventory read(String s) {
        return null;
    }
}
