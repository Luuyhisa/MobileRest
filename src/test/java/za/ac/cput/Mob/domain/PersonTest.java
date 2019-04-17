package za.ac.cput.Mob.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getStrName() {   String x="admin";
        String  q= "q";

        Assert.assertNotSame(q,x);
    }

    @Test
    public void getAddress() {   String x="Admin";
        String  q= "q";

        Assert.assertNotSame(q,x);
    }
}