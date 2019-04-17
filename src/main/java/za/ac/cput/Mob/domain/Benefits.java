package za.ac.cput.Mob.domain;

public class Benefits {
    private String buyingBenefits;
    private Benefits(){
    }
    public Benefits(Builder builder) {
        this.buyingBenefits = builder.buyingBenefits;
    }
    public String getBuyingBeneits() {
        return buyingBenefits;
    }
    public static class Builder {
        private String buyingBenefits;
        //private double account;
        public Builder buyingBenefits( String buyingBenefits) {
            this.buyingBenefits = buyingBenefits;
            return this;
        }
        public Benefits build() {
            return new Benefits(this);
        }
        @Override
        public String toString() {
            return "Builder{" +
                    "Buying Code = " + buyingBenefits +'}';
        }
    }


}
