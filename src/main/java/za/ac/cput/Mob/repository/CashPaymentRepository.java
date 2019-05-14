package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.CashPayment;

import java.util.Set;

public interface CashPaymentRepository extends IRepository<CashPayment, String>
{
        Set<CashPayment> getAll();

}
