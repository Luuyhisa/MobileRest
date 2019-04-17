package za.ac.cput.Mob.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Mob.domain.Benefits;

import static org.junit.Assert.*;

public class BenefitFactoryTest {
    @Test
    public void getCustomer() {
        String cust="qwe123";
        Benefits q= BenefitFactory.getBenefits(cust);

        Assert.assertNotSame(q,cust);
    }
}