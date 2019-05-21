package za.ac.cput.Mob.service;

import za.ac.cput.Mob.domain.Gemographic;

import java.util.Set;

public interface GemographicService extends IService<Gemographic,String> {
Set<Gemographic>getAll();
}
