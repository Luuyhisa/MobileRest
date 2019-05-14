package za.ac.cput.Mob.domain;

import java.util.Objects;

public class Payslip extends EmpSalary {
    private int basicSalary,netIncome;
    public Payslip(){}

    private Payslip(Builder builder){

        this.basicSalary = builder.basicSalary;
        this.netIncome = builder.netIncome;
       }

    public int getBasicSalary() {
        return basicSalary;
    }
    public int getNetIncome() {
        return netIncome;
    }


    public static class Builder {
        private int basicSalary,netIncome;
        public Builder basicSalary( int basicSalary) {
            this.basicSalary = basicSalary;
            return this;
        }
        public Builder netIncome( int netIncome) {
            this.netIncome = netIncome;
            return this;
        }
        public Builder copy(Payslip payslip){

            this.basicSalary = payslip.basicSalary;
            this.netIncome = payslip.netIncome;
             return this;
        }
        public Payslip build() {
            return new Payslip(this);
        }

    }

    @Override
    public String toString() {
        return "Payslip{" +
                "basicSalary=" + basicSalary +
                ", netIncome=" + netIncome +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Payslip payslip = (Payslip) o;
        return basicSalary == payslip.basicSalary &&
                netIncome == payslip.netIncome;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), basicSalary, netIncome);
    }
}
