package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.ManagementStaff;

import java.util.Set;

public interface ManagementStaffRepository
extends IRepository<ManagementStaff,String>{

    Set<ManagementStaff> getAll();
}
