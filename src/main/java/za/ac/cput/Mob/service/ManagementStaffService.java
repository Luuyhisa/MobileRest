package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.ManagementStaff;

import java.util.Set;

public interface ManagementStaffService extends IService<ManagementStaff,String> {

Set<ManagementStaff>getAll();
}
