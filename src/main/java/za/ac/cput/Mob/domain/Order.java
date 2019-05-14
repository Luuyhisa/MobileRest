package za.ac.cput.Mob.domain;

import java.util.Date;
import java.util.Objects;

public class Order  {
    public Date orderDate;
    public int ordernumber;
    public Order(){}
    private Order(Builder builder){

        this.orderDate = builder.orderDate;
        this.ordernumber = builder.ordernumber;

    }

    public Date getOrderDate() {
        return orderDate;
    }
    public int getOrdernumber() {
        return ordernumber;
    }

    public static class Builder {
        public Date orderDate;
        public int ordernumber;

        public Builder ordernumber( int ordernumber) {
            this.ordernumber = ordernumber;
            return this;
        }
        public Builder orderDate( Date orderDate) {
            this.orderDate = orderDate;
            return this;
        }
        public Builder copy(Order order){

            this.orderDate = order.orderDate;
            this.ordernumber = order.ordernumber;

            return this;
        }

        public Order build() {
            return new Order(this);
        }


    }

    @Override
    public String toString() {
        return "Order{" +
                "orderDate=" + orderDate +
                ", ordernumber=" + ordernumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return ordernumber == order.ordernumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordernumber);
    }
}
