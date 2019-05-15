package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.Login;

public class LoginFactory {


    public static Login buildLogin(String password,String username){
        return new Login.Builder()
                .password(password).username(username)
                .build();
    }
}
