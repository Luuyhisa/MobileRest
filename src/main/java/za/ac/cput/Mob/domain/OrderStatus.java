package za.ac.cput.Mob.domain;

import java.util.Objects;

public class OrderStatus extends OrderDetails{
    String cookingTime,deliverTime;
    public OrderStatus(){}
    private OrderStatus(Builder builder){

        this.cookingTime = builder.cookingTime;
        this.deliverTime = builder.deliverTime;

    }


    public String getCookingTime() {
        return cookingTime;
    }
    public String getDeliverTime() {
        return deliverTime;
    }

    public static class Builder {
        String cookingTime,deliverTime;
        public Builder cookingTime( String cookingTime) {
            this.cookingTime = cookingTime;
            return this;
        }
        public Builder deliverTime( String deliverTime) {
            this.deliverTime = deliverTime;
            return this;
        }
        public Builder copy(OrderStatus orderStatus){

            this.cookingTime = orderStatus.cookingTime;
            this.deliverTime = orderStatus.deliverTime;

            return this;
        }

        public OrderStatus build() {
            return new OrderStatus(this);
        }




    }


    @Override
    public String toString() {
        return "OrderStatus{" +
                "cookingTime='" + cookingTime + '\'' +
                ", deliverTime='" + deliverTime + '\'' +
                ", quantity=" + quantity +
                ", taxStatus='" + taxStatus + '\'' +
                ", orderDate=" + orderDate +
                ", ordernumber=" + ordernumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OrderStatus that = (OrderStatus) o;
        return cookingTime.equals(that.cookingTime) &&
                deliverTime.equals(that.deliverTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cookingTime, deliverTime);
    }
}
