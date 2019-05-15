package za.ac.cput.Mob.repository.Impl;
import za.ac.cput.Mob.domain.Food;
import za.ac.cput.Mob.repository.FoodRepository;

import java.util.HashSet;
import java.util.Set;

public class FoodRepositoryImp
implements FoodRepository {
    private static FoodRepositoryImp repository = null;
    private Set<Food> food;

    private FoodRepositoryImp() {
        this.food = new HashSet<>();
    }
    public static FoodRepositoryImp getRepository(){
        if(repository == null) repository =
                new FoodRepositoryImp();
        return repository;}
    public Set<Food> getAll() {
        return this.food;
    }
    public Food create(Food food) {
        this.food.add(food);
        return food;
    }
    public Food update(Food food) {
        return null;
    }
    public void delete(String s) {
    }
    public Food read(String s) {
        return null;
    }
}
