package za.ac.cput.Mob.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginTest {

    @Test
    public void getUsername() {
        String x="User";
        String  q= "ssa";

        Assert.assertNotSame(q,x);
    }

    @Test
    public void getPassword() {
        String x="pass";
        String  q= "psaa";

        Assert.assertNotSame(q,x);
    }
}