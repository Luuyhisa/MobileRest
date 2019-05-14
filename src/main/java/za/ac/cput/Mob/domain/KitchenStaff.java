package za.ac.cput.Mob.domain;

import java.util.Objects;

public class KitchenStaff extends Employee {
    String cook,foodUpdate;
    public KitchenStaff(){}

    private KitchenStaff(Builder builder){

        this.cook = builder.cook;
        this.foodUpdate = builder.foodUpdate;

    }

    public String getCook() {
        return cook;
    }

    public String getFoodUpdate() {
        return foodUpdate;
    }

    public static class Builder {
        String cook,foodUpdate;
        public Builder cook( String cook) {
            this.cook = cook;
            return this;
        }
        public Builder foodUpdate( String foodUpdate) {
            this.foodUpdate = foodUpdate;
            return this;
        }
        public Builder copy(KitchenStaff kitchenStaff){

            this.cook = kitchenStaff.cook;
            this.foodUpdate = kitchenStaff.foodUpdate;
            return this;
        }
        public KitchenStaff build() {
            return new KitchenStaff(this);
        }
    }

    @Override
    public String toString() {
        return "KitchenStaff{" +
                "cook='" + cook + '\'' +
                ", foodUpdate='" + foodUpdate + '\'' +
                ", strName='" + strName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        KitchenStaff that = (KitchenStaff) o;
        return cook.equals(that.cook) &&
                foodUpdate.equals(that.foodUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cook, foodUpdate);
    }
}
