package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.Name;

import java.util.Set;

public interface NameService extends IService<Name,String> {
    Set<Name> getAll();
}
