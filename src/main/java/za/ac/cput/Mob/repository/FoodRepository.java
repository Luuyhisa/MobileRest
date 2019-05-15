package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.Food;

import java.util.Set;

public interface FoodRepository
extends IRepository<Food,String>{

    Set<Food> getAll();
}
