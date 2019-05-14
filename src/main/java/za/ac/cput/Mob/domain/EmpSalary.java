package za.ac.cput.Mob.domain;

import java.util.Objects;

public class EmpSalary extends EmpPosition {
   private int intPerhour,intHoursWorked,intExtraHrs;
    public EmpSalary(){};
    private EmpSalary(Builder builder){
        this.intExtraHrs  = builder.intExtraHrs;
        this.intHoursWorked  = builder.intHoursWorked;
        this.intPerhour  = builder.intPerhour;
    }
    public int getIntPerhour() {
        return intPerhour;
    }
    public int getIntHoursWorked() {
        return intHoursWorked;
    }
    public int getIntExtraHrs() {
        return intExtraHrs;
    }



    public static class Builder{
        private int intPerhour,intHoursWorked,intExtraHrs;

        public Builder intPerhour( int intPerhour) {
            this.intPerhour = intPerhour;
            return this;
        }
        public Builder intHoursWorked( int intHoursWorked) {
            this.intHoursWorked = intHoursWorked;
            return this;
        }
        public Builder intExtraHrs( int intExtraHrs) {
            this.intExtraHrs = intExtraHrs;
            return this;
        }
        public EmpSalary build() {
            return new EmpSalary(this);
        }



    }

    @Override
    public String toString() {
        return "EmpSalary{" +
                "intPerhour=" + intPerhour +
                ", intHoursWorked=" + intHoursWorked +
                ", intExtraHrs=" + intExtraHrs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpSalary empSalary = (EmpSalary) o;
        return intPerhour == empSalary.intPerhour &&
                intHoursWorked == empSalary.intHoursWorked &&
                intExtraHrs == empSalary.intExtraHrs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(intPerhour, intHoursWorked, intExtraHrs);
    }
}
