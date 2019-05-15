package za.ac.cput.Mob.repository.Impl;

import za.ac.cput.Mob.domain.PersonalAddress;
import za.ac.cput.Mob.repository.PersonalAddressRepository;

import java.util.HashSet;
import java.util.Set;

public class PersonalAddressRepositoryImp
implements PersonalAddressRepository {

    private static PersonalAddressRepositoryImp repository = null;
    private Set<PersonalAddress> personalAddress;
    private PersonalAddressRepositoryImp() {
        this.personalAddress = new HashSet<>();
    }
    public static PersonalAddressRepositoryImp getRepository(){
        if(repository == null) repository =
                new PersonalAddressRepositoryImp();
        return repository;}


    public Set<PersonalAddress> getAll() {
        return null;
    }

    public PersonalAddress create(PersonalAddress personalAddress) {
        return null;
    }

    public PersonalAddress update(PersonalAddress personalAddress) {
        return null;
    }

    public void delete(String s) {

    }

    public PersonalAddress read(String s) {
        return null;
    }
}
