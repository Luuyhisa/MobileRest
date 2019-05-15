package za.ac.cput.Mob.repository.Impl;

import za.ac.cput.Mob.domain.DeliveryStaff;
import za.ac.cput.Mob.repository.DeliveryStaffRepository;

import java.util.HashSet;
import java.util.Set;

public class DeliveryStaffRepositoryImp
implements DeliveryStaffRepository {
private static DeliveryStaffRepositoryImp repository = null;
private Set<DeliveryStaff> deliveryStaff  ;

    private DeliveryStaffRepositoryImp() {
        this.deliveryStaff = new HashSet<>();
    }

    public static DeliveryStaffRepositoryImp getRepository(){
        if(repository == null) repository =
                new DeliveryStaffRepositoryImp();
        return repository;}


    public DeliveryStaff create(DeliveryStaff deliveryStaff){
        this.deliveryStaff.add(deliveryStaff);
        return deliveryStaff;}

    public DeliveryStaff read(String deliveryStaff){
        //find the student in the set and return it if it exist
        return null;}

    public DeliveryStaff update(DeliveryStaff deliveryStaff) {
        // find the student, update it and return the updated student
        return null;
    }
    public void delete(String deliveryStaff) {
        //find the student and delete it if it exists
    }
    public Set<DeliveryStaff> getAll(){
        return this.deliveryStaff;
    }

}
