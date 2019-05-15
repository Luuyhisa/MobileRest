package za.ac.cput.Mob.domain;

import java.util.Objects;

public class CashPayment extends Payment {

    private String cashBenefits;
    private CashPayment(){
    }
    public CashPayment(Builder builder) {
        this.cashBenefits = builder.cashBenefits;
    }
    public String getCashPayment() {
        return cashBenefits;
    }
    public static class Builder {
        private String cashBenefits;
        //private double account;
        public Builder cashBenefits( String cashBenefits) {
            this.cashBenefits = cashBenefits;
            return this;
        }
        public Builder copy(CashPayment cashPayment){

            this.cashBenefits = cashPayment.cashBenefits;

            return this;
        }

        public CashPayment build() {
            return new CashPayment(this);
        }

    }

    @Override
    public String toString() {
        return "CashPayment{" +
                "cashBenefits='" + cashBenefits + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CashPayment that = (CashPayment) o;
        return Objects.equals(cashBenefits, that.cashBenefits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cashBenefits);
    }
}
