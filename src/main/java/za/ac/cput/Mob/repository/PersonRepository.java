package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.Person;

import java.util.Set;

public interface PersonRepository
extends IRepository<Person,String>

{
    Set<Person> getAll();
}
