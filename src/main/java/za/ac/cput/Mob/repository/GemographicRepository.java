package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.Gemographic;

import java.util.Set;

public interface GemographicRepository
extends IRepository<Gemographic,String>{
    Set<Gemographic> getAll();

}
