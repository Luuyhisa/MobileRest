package za.ac.cput.Mob.service.Impl;
import za.ac.cput.Mob.domain.Login;
import za.ac.cput.Mob.repository.Impl.LoginRepositoryImp;
import za.ac.cput.Mob.repository.LoginRepository;
import za.ac.cput.Mob.service.LoginService;

import java.util.HashSet;
import java.util.Set;

public class LoginServiceImp implements LoginService {
    private static LoginServiceImp service = null;
    private LoginRepository repository;

    private LoginServiceImp(){
        this.repository = LoginRepositoryImp.getRepository();

    }

    public static LoginServiceImp getService(){
        if (service==null) service = new LoginServiceImp();
        return service;
    }

    @Override
    public Set<Login> getAll() {
        return repository.getAll();
    }

    @Override
    public Login create(Login login) {
        return repository.create(login);
    }

    @Override
    public Login update(Login login) {
        return repository.update(login);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Login read(String s) {
        return repository.read(s);
    }
}


