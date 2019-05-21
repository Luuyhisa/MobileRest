package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.EFTPayment;

import java.util.Set;

public interface EFTPaymentService extends IService<EFTPayment,String> {

Set<EFTPayment> getAll();
}
