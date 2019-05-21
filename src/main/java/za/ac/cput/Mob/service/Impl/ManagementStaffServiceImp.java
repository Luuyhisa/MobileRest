package za.ac.cput.Mob.service.Impl;

import za.ac.cput.Mob.domain.ManagementStaff;
import za.ac.cput.Mob.repository.Impl.ManagementStaffRepositoryImp;
import za.ac.cput.Mob.repository.ManagementStaffRepository;
import za.ac.cput.Mob.service.ManagementStaffService;

import java.util.HashSet;
import java.util.Set;

public class ManagementStaffServiceImp
implements ManagementStaffService {



    private static ManagementStaffServiceImp service = null;
    private ManagementStaffRepository repository;

    private ManagementStaffServiceImp(){
        this.repository = ManagementStaffRepositoryImp.getRepository();

    }

    public static ManagementStaffServiceImp getService(){
        if (service==null) service = new ManagementStaffServiceImp();
        return service;
    }

    @Override
    public Set<ManagementStaff> getAll() {
        return repository.getAll();
    }

    @Override
    public ManagementStaff create(ManagementStaff managementStaff) {
        return repository.create(managementStaff);
    }

    @Override
    public ManagementStaff update(ManagementStaff managementStaff) {
        return repository.update(managementStaff);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public ManagementStaff read(String s) {
        return repository.read(s);
    }
}
