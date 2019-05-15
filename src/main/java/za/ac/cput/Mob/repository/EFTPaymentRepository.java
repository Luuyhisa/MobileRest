package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.EFTPayment;

import java.util.Set;

public interface EFTPaymentRepository
extends IRepository<EFTPayment,String>{
    Set<EFTPayment> getAll();



}
