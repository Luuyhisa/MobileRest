package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.CContactDetails;

import java.util.Set;

public interface ContactDetailsService extends IService<CContactDetails,String> {

Set<CContactDetails>getAll();
}
