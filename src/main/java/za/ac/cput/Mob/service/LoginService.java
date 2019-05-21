package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.Login;

import java.util.Set;

public interface LoginService extends IService<Login,String> {

    Set<Login>getAll();

}
