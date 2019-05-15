package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.ManagementStaff;

public class ManagementStaffFactory {


    public static ManagementStaff getCustomer(String manageTeam) {
        return new ManagementStaff.Builder()
                .manageTeam(manageTeam)
                .build();
    }


}
