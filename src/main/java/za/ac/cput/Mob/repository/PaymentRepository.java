package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.Payment;

import java.util.Set;

public interface PaymentRepository
extends IRepository<Payment,String>{
    Set<Payment> getAll();

}
