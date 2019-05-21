package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.PersonalAddress;

import java.util.Set;

public interface PersonalAddressService extends IService<PersonalAddress,String> {
    Set<PersonalAddress> getAll();

}
