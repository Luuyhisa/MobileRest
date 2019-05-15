package za.ac.cput.Mob.repository.Impl;

import za.ac.cput.Mob.domain.MobileRest;
import za.ac.cput.Mob.repository.MobileRestRepository;

import java.util.HashSet;
import java.util.Set;

public class MobileRestRepositoryImp
implements MobileRestRepository {

    private static MobileRestRepositoryImp repository = null;
    private Set<MobileRest> mobileRest;
    private MobileRestRepositoryImp() {
        this.mobileRest = new HashSet<>();
    }
    public static MobileRestRepositoryImp getRepository(){
        if(repository == null) repository =
                new MobileRestRepositoryImp();
        return repository;}

    public Set<MobileRest> getAll() {
        return null;
    }
    public MobileRest create(MobileRest mobileRest) {
        this.mobileRest.add(mobileRest);

        return mobileRest;
    }
    public MobileRest update(MobileRest mobileRest) {
        return null;
    }
    public void delete(String s) {
    }
    public MobileRest read(String s) {
        return null;
    }
}
