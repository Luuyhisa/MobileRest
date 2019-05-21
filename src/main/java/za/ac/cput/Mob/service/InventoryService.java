package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.Inventory;

import java.util.Set;

public interface InventoryService extends IService<Inventory,String>{
    Set<Inventory> getAll();

}
