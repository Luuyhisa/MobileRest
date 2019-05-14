package za.ac.cput.Mob.repository.Impl;
import za.ac.cput.Mob.domain.Login;
import za.ac.cput.Mob.repository.LoginRepository;

import java.util.HashSet;
import java.util.Set;
public class LoginRepositoryImp implements LoginRepository {
    private static LoginRepositoryImp repository = null;
    private Set<Login> login;

    private LoginRepositoryImp() {
        this.login = new HashSet<>();
    }

    public static LoginRepository getRepository(){
        if(repository == null) repository = new LoginRepositoryImp();
        return repository;
    }
    public Login create(Login employee){
        //this.login.add(login);
        return employee;
    }
    public Login read(String loginId){
        //find the student in the set and return it if it exist
        return null;
    }
    public Login update(Login login) {
        // find the student, update it and return the updated student
        return null;
    }
    public void delete(String loginId) {
        //find the student and delete it if it exists
    }
    public Set<Login> getAll(){
        return this.login;
    }


}


