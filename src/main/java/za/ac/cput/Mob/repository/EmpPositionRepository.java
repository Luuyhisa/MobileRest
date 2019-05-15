package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.EmpPosition;

import java.util.Set;

public interface EmpPositionRepository
extends IRepository<EmpPosition,String>{

    Set<EmpPosition> getAll();
}
