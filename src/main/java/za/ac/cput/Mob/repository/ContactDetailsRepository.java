package za.ac.cput.Mob.repository;


import za.ac.cput.Mob.domain.CContactDetails;

import java.util.Set;

public interface ContactDetailsRepository extends IRepository<CContactDetails,String>{

Set<CContactDetails> getAll();

}
