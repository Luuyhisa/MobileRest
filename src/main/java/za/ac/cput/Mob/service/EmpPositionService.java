package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.EmpPosition;

import java.util.Set;

public interface EmpPositionService extends IService<EmpPosition,String>{
    Set<EmpPosition> getAll();
}
