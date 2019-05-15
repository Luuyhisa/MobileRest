package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.MobileRest;

import java.util.Set;

public interface MobileRestRepository
extends IRepository<MobileRest,String>{
Set<MobileRest> getAll();
}
