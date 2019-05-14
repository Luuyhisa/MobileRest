package za.ac.cput.Mob.repository;

import za.ac.cput.Mob.domain.Benefits;

import java.util.Set;

public interface BenefitRepository extends IRepository<Benefits, String>
{
    Set<Benefits> getAll();

}
