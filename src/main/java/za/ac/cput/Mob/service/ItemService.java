package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.Item;

import java.util.Set;

public interface ItemService extends IService<Item,String> {
    Set<Item> getAll();
}
