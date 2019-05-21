package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.Payment;

import java.util.Set;

public interface PaymentService extends IService<Payment,String> {

    Set<Payment> getAll();
}
