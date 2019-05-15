package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.Login;

public class LoginFactory {


    public static Login getCustomer(String password,String username){
        return new Login.Builder()
                .password(password).username(username)
                .build();
    }
}
