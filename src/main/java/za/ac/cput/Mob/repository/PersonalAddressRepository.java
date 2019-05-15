package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.PersonalAddress;

import java.util.Set;

public interface PersonalAddressRepository
extends IRepository<PersonalAddress,String>{
    Set<PersonalAddress> getAll();
}
