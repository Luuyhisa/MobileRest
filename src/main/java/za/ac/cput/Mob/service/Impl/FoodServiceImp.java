package za.ac.cput.Mob.service.Impl;
import za.ac.cput.Mob.domain.Food;
import za.ac.cput.Mob.repository.FoodRepository;
import za.ac.cput.Mob.repository.Impl.FoodRepositoryImp;
import za.ac.cput.Mob.service.FoodService;

import java.util.HashSet;
import java.util.Set;

public class FoodServiceImp
implements FoodService {

    private static FoodServiceImp service = null;
    private FoodRepository repository;

    private FoodServiceImp(){
        this.repository = FoodRepositoryImp.getRepository();

    }

    public static FoodServiceImp getService(){
        if (service==null) service = new FoodServiceImp();
        return service;
    }

    @Override
    public Set<Food> getAll() {
        return repository.getAll();
    }

    @Override
    public Food create(Food food) {
        return repository.create(food);
    }

    @Override
    public Food update(Food food) {
        return repository.update(food);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Food read(String s) {
        return repository.read(s);
    }
}
