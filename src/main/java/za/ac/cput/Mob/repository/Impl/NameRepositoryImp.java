package za.ac.cput.Mob.repository.Impl;

import za.ac.cput.Mob.domain.Name;
import za.ac.cput.Mob.repository.NameRepository;

import java.util.HashSet;
import java.util.Set;

public class NameRepositoryImp
implements NameRepository {
    private static NameRepositoryImp repository = null;
    private Set<Name> name;
    private NameRepositoryImp() {
        this.name = new HashSet<>();
    }
    public static NameRepositoryImp getRepository(){
        if(repository == null) repository =
                new NameRepositoryImp();
        return repository;}



    public Set<Name> getAll() {
        return null;
    }

    public Name create(Name name) {
        this.name.add(name);
        return name;
    }

    public Name update(Name name) {
        return null;
    }

    public void delete(String s) {

    }

    public Name read(String s) {
        return null;
    }
}
