package za.ac.cput.Mob.domain;

import java.util.Objects;

public class EmpPosition {
     private    int workingShift;
public EmpPosition(){}

    private EmpPosition(Builder builder){
        this.workingShift = builder.workingShift;
        }

        public int getWorkingShift() {
        return workingShift;
    }


    public static class Builder {

        private    int workingShift;

        public Builder workingShift( int workingShift) {
            this.workingShift = workingShift;
            return this;
        }

        public Builder copy(EmpPosition EmpPosition){

            this.workingShift = EmpPosition.workingShift;
            return this;
        }

        public EmpPosition build() {
            return new EmpPosition(this);
        }



    }

    @Override
    public String toString() {
        return "EmpPosition{" +
                "workingShift=" + workingShift +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpPosition that = (EmpPosition) o;
        return workingShift == that.workingShift;
    }

    @Override
    public int hashCode() {
        return Objects.hash(workingShift);
    }
}

