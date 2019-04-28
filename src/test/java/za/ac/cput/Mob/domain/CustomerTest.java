package za.ac.cput.Mob.domain;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Mob.factory.CustomerFactory;

public class CustomerTest {
    @Test
    public void getCustID() {
        String cust="Lugisa";
        Customer  q= CustomerFactory.getCustomer(cust,cust,cust,cust);

        Assert.assertNotSame(q,cust);
    }}