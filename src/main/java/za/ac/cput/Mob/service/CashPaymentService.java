package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.CashPayment;

import java.util.Set;

public interface CashPaymentService extends IService<CashPayment,String> {

Set<CashPayment> getAll();
}
