package za.ac.cput.Mob.domain;

import java.util.Objects;

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
        public Builder copy(Benefits benefits){

            this.buyingBenefits = benefits.buyingBenefits;

            return this;
        }

        public Benefits build() {
            return new Benefits(this);
        }

    }

    @Override
    public String toString() {
        return "Benefits{" +
                "buyingBenefits='" + buyingBenefits + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Benefits benefits = (Benefits) o;
        return Objects.equals(buyingBenefits, benefits.buyingBenefits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buyingBenefits);
    }
}
