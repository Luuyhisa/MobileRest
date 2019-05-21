package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.Person;

import java.util.Set;

public interface PersonService extends IService<Person,String> {

    Set<Person>getAll();
}
