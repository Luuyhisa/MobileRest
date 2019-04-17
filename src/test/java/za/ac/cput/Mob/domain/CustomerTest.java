package za.ac.cput.Mob.domain;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Mob.factory.CusomerFactory;

import static org.junit.Assert.*;

public class CustomerTest {
    @Test
    public void getCustID() {
        String cust="Lugisa";
        Customer  q= CusomerFactory.getCustomer(cust,cust,cust,cust);

        Assert.assertNotSame(q,cust);
    }}