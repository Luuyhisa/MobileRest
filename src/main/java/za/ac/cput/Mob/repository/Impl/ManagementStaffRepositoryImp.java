package za.ac.cput.Mob.repository.Impl;

import za.ac.cput.Mob.domain.ManagementStaff;
import za.ac.cput.Mob.repository.ManagementStaffRepository;

import java.util.HashSet;
import java.util.Set;

public class ManagementStaffRepositoryImp
implements ManagementStaffRepository {
    private static ManagementStaffRepositoryImp repository = null;

    private Set<ManagementStaff> managementStaff;
    private ManagementStaffRepositoryImp() {
        this.managementStaff = new HashSet<>();
    }
    public static ManagementStaffRepositoryImp getRepository(){
        if(repository == null) repository =
                new ManagementStaffRepositoryImp();
        return repository;}
        public Set<ManagementStaff> getAll() {
        return null;
    }
    public ManagementStaff create(ManagementStaff managementStaff) {
this.managementStaff.add(managementStaff);
        return managementStaff;
    }
    public ManagementStaff update(ManagementStaff managementStaff) {
        return null;
    }
    public void delete(String s) {
    }
    public ManagementStaff read(String s) {
        return null;
    }
}
