package za.ac.cput.Mob.domain;

public class CouponPayment extends Payment {
String strName,strCouponCode;

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrCouponCode() {
        return strCouponCode;
    }

    public void setStrCouponCode(String strCouponCode) {
        this.strCouponCode = strCouponCode;
    }
}
