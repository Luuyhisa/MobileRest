package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.DeliveryStaff;

import java.util.Set;

public interface DeliveryStuffService extends IService<DeliveryStaff,String> {
    Set<DeliveryStaff> getAll();
}
