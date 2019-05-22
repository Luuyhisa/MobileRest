package za.ac.cput.Mob.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.Mob.domain.Person;
import za.ac.cput.Mob.repository.Impl.PersonRepositoryImp;
import za.ac.cput.Mob.repository.PersonRepository;
import za.ac.cput.Mob.service.PersonService;

import java.util.HashSet;
import java.util.Set;
@Service("PersonServiceImp")
public class PersonServiceImp
implements PersonService {
    @Autowired
    @Qualifier("InMemory")
    private static PersonServiceImp service = null;
    private PersonRepository repository;
    private PersonServiceImp(){
        this.repository = PersonRepositoryImp.getRepository();
    }
    public static PersonServiceImp getService(){
        if (service==null) service = new PersonServiceImp();
        return service;
    }
    @Override
    public Set<Person> getAll() {
        return repository.getAll();
    }

    @Override
    public Person create(Person person) {
        return repository.create(person);
    }

    @Override
    public Person update(Person person) {
        return repository.update(person);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Person read(String s) {
        return repository.read(s);
    }
}
