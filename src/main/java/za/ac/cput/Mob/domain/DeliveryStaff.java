package za.ac.cput.Mob.domain;

import java.util.Objects;

public class DeliveryStaff  extends EmpPosition {
   private String strDeliver;
public DeliveryStaff(){};
private DeliveryStaff(Builder builder){
    this.strDeliver = builder.strDeliver;

}
    public String getStrDeliver() {
        return strDeliver;
    }

    public static class Builder {
    private String strDeliver;
        public Builder strDeliver( String strDeliver) {
            this.strDeliver = strDeliver;
            return this;
        }
        public Builder copy(DeliveryStaff deliveryStaff){

            this.strDeliver = deliveryStaff.strDeliver;

            return this;
        }
        public DeliveryStaff build() {
            return new DeliveryStaff(this);
        }

    }

    @Override
    public String toString() {
        return "DeliveryStaff{" +
                "strDeliver='" + strDeliver + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DeliveryStaff deliveryStaff=  (DeliveryStaff) o;
        return strDeliver.equals(deliveryStaff.strDeliver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), strDeliver);
    }
}
