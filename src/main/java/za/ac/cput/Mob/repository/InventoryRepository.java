package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.Inventory;

import java.util.Set;

public interface InventoryRepository
extends IRepository<Inventory,String>{
Set<Inventory> getAll();

}
