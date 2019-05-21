package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.KitchenStaff;

import java.util.Set;

public interface KitchenStaffService extends IService<KitchenStaff,String>{

    Set<KitchenStaff> getAll();

}
