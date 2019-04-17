package za.ac.cput.Mob.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MobileRestTest {

    @Test
    public void getLocation() {
        String x="Makhaza";
        String  q= "q";

        Assert.assertNotSame(q,x);
    }

    @Test
    public void getPhysicalLoc() {
        String x="khaltsha";
        String  q= "q";

        Assert.assertNotSame(q,x);
    }
}