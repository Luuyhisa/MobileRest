package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.Name;

import java.util.Set;

public interface NameRepository
extends IRepository<Name,String>{
    Set<Name> getAll();
}
