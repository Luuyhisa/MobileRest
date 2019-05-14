package za.ac.cput.Mob.domain;

import java.util.Objects;

public class CouponPayment extends Payment {
private String strName,strCouponCode;

    public CouponPayment(){}
private CouponPayment(Builder builder){
    this.strName = builder.strName;
    this.strCouponCode = builder.strCouponCode;
}
    public String getStrName() {
        return strName;
    }
    public String getStrCouponCode() {
        return strCouponCode;
    }
    public static class Builder {
        private String strName,strCouponCode;

        public Builder strName( String strName) {
            this.strName = strName;
            return this;
        }
        public Builder strCouponCode( String strCouponCode) {
            this.strCouponCode = strCouponCode;
            return this;
        }
        public Builder copy(CouponPayment couponPayment){

            this.strName = couponPayment.strName;
            this.strCouponCode = couponPayment.strCouponCode;

            return this;
        }

        public CouponPayment build() {
            return new CouponPayment(this);
        }


    }

    @Override
    public String toString() {
        return "CouponPayment{" +
                "strName='" + strName + '\'' +
                ", strCouponCode='" + strCouponCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CouponPayment that = (CouponPayment) o;
        return strCouponCode.equals(that.strCouponCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strCouponCode);
    }
}
