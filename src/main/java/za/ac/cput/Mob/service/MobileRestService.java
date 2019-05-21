package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.MobileRest;

import java.util.Set;

public interface MobileRestService extends IService<MobileRest,String> {

    Set<MobileRest>getAll();

}
