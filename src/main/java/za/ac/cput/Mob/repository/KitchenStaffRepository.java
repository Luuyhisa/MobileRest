package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.KitchenStaff;

import java.util.Set;

public interface KitchenStaffRepository
extends IRepository<KitchenStaff,String>{

    Set<KitchenStaff> getAll();
}
