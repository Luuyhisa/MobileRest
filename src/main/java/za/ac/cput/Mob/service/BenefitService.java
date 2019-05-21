package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.Benefits;

import java.util.Set;

public interface BenefitService extends IService<Benefits,String> {

    Set<Benefits> getAll();

}
