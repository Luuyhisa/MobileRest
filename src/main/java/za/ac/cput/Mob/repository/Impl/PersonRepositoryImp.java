package za.ac.cput.Mob.repository.Impl;

import za.ac.cput.Mob.domain.Person;
import za.ac.cput.Mob.repository.PersonRepository;

import java.util.HashSet;
import java.util.Set;

public class PersonRepositoryImp
implements PersonRepository {


    private static PersonRepositoryImp repository = null;
    private Set<Person> person;
    private PersonRepositoryImp() {
        this.person = new HashSet<>();
    }
    public static PersonRepositoryImp getRepository(){
        if(repository == null) repository =
                new PersonRepositoryImp();
        return repository;}

    public Set<Person> getAll() {
        return null;
    }

    public Person create(Person person) {
        return null;
    }

    public Person update(Person person) {
        return null;
    }

    public void delete(String s) {

    }

    public Person read(String s) {
        return null;
    }
}
