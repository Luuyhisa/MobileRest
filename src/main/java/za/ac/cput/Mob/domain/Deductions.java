package za.ac.cput.Mob.domain;

import java.util.Objects;

public class Deductions {
    private double dTax;
   private double dUIF;
    private double dMedical;

    public Deductions(){}

    private Deductions(Builder builder){

        this.dTax = builder.dTax;
        this.dUIF = builder.dUIF;
        this.dMedical = builder.dMedical;
        }
    public double getdTax() {
        return dTax;
    }
    public double getdUIF() {
        return dUIF;
    }
    public double getdMedical() {
        return dMedical;
    }

    public static class Builder {
        private double dTax;
        private double dUIF;
        private double dMedical;


        public Builder dTax( double dTax) {
            this.dTax = dTax;
            return this;
        }
        public Builder dUIF( double dUIF) {
            this.dUIF = dUIF;
            return this;
        }

        public Builder dMedical( double dMedical) {
            this.dMedical = dMedical;
            return this;
        }
        public Builder copy(Deductions deductions){

            this.dTax = deductions.dTax;
            this.dUIF = deductions.dUIF;
            this.dMedical = deductions.dMedical;
            return this;
        }

        public Deductions build() {
            return new Deductions(this);
        }



    }

    @Override
    public String toString() {
        return "Deductions{" +
                "dTax=" + dTax +
                ", dUIF=" + dUIF +
                ", dMedical=" + dMedical +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deductions that = (Deductions) o;
        return Double.compare(that.dTax, dTax) == 0 &&
                Double.compare(that.dUIF, dUIF) == 0 &&
                Double.compare(that.dMedical, dMedical) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dTax, dUIF, dMedical);
    }
}
