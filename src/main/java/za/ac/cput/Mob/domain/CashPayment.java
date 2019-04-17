package za.ac.cput.Mob.domain;

public class CashPayment extends Payment {

    private String cashBenefits;
    private CashPayment(){
    }
    public CashPayment(Builder builder) {
        this.cashBenefits = builder.cashBenefits;
    }
    public String getCashBenefits() {
        return cashBenefits;
    }
    public static class Builder {
        private String cashBenefits;
        //private double account;
        public Builder cashBenefits( String cashBenefits) {
            this.cashBenefits = cashBenefits;
            return this;
        }
        public CashPayment build() {
            return new CashPayment(this);
        }
        @Override
        public String toString() {
            return "Builder{" +
                    "Cash Amount = " + cashBenefits +'}';
        }
    }
}
