package za.ac.cput.Mob.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.Mob.domain.PersonalAddress;
import za.ac.cput.Mob.repository.Impl.PersonalAddressRepositoryImp;
import za.ac.cput.Mob.repository.PersonalAddressRepository;
import za.ac.cput.Mob.service.PersonalAddressService;

import java.util.HashSet;
import java.util.Set;
@Service("PersonalAddressServiceImp")

public class PersonalAddressServiceImp
implements PersonalAddressService {
    @Autowired
    @Qualifier("InMemory")
    private static PersonalAddressServiceImp service = null;
    private PersonalAddressRepository repository;

    private PersonalAddressServiceImp(){
        this.repository = PersonalAddressRepositoryImp.getRepository();

    }

    public static PersonalAddressServiceImp getService(){
        if (service==null) service = new PersonalAddressServiceImp();
        return service;
    }

    @Override
    public Set<PersonalAddress> getAll() {
        return repository.getAll();
    }

    @Override
    public PersonalAddress create(PersonalAddress personalAddress) {
        return repository.create(personalAddress);
    }

    @Override
    public PersonalAddress update(PersonalAddress personalAddress) {
        return repository.update(personalAddress);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public PersonalAddress read(String s) {
        return repository.read(s);
    }
}
