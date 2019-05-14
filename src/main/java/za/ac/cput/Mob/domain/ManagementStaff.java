package za.ac.cput.Mob.domain;

import java.util.Objects;

public class ManagementStaff extends EmpPosition {
    String manageTeam;
    public ManagementStaff(){}
    private ManagementStaff(Builder builder){

        this.manageTeam = builder.manageTeam;
            }
    public String getManageTeam() {
        return manageTeam;
    }

    public static class Builder {
        String manageTeam;
        public Builder manageTeam( String manageTeam) {
            this.manageTeam = manageTeam;
            return this;
        }

        public Builder copy(ManagementStaff managementStaff){

            this.manageTeam = managementStaff.manageTeam;

            return this;
        }

        public ManagementStaff build() {
            return new ManagementStaff(this);
        }


    }

    @Override
    public String toString() {
        return "ManagementStaff{" +
                "manageTeam='" + manageTeam + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ManagementStaff that = (ManagementStaff) o;
        return Objects.equals(manageTeam, that.manageTeam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), manageTeam);
    }
}
