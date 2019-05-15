package za.ac.cput.Mob.repository.Impl;

import za.ac.cput.Mob.domain.KitchenStaff;
import za.ac.cput.Mob.repository.KitchenStaffRepository;

import java.util.HashSet;
import java.util.Set;

public class KitchenStaffRepositoryImp
implements KitchenStaffRepository {
private static KitchenStaffRepositoryImp repository = null;
    private Set<KitchenStaff> kitchenStaff;
    private KitchenStaffRepositoryImp() {
        this.kitchenStaff = new HashSet<>();
    }
    public static KitchenStaffRepositoryImp getRepository(){
        if(repository == null) repository =
                new KitchenStaffRepositoryImp();
        return repository;}



    public Set<KitchenStaff> getAll() {
        return null;
    }
    public KitchenStaff create(KitchenStaff kitchenStaff) {
        this.kitchenStaff.add(kitchenStaff);
        return kitchenStaff;
    }
    public KitchenStaff update(KitchenStaff kitchenStaff) {
        return null;
    }
    public void delete(String s) {
    }
    public KitchenStaff read(String s) {
        return null;
    }
}
