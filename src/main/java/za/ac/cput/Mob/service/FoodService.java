package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.Food;

import java.util.Set;

public interface FoodService extends IService<Food,String> {

    Set<Food> getAll();
}
