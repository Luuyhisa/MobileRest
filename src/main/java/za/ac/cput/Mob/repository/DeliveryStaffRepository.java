package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.DeliveryStaff;

import java.util.Set;

public interface DeliveryStaffRepository
extends IRepository<DeliveryStaff, String>{
    Set<DeliveryStaff> getAll();
}
