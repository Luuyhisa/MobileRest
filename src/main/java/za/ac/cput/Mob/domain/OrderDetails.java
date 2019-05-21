package za.ac.cput.Mob.domain;
import java.util.Objects;
public class OrderDetails extends Order {
    int quantity;
    String taxStatus;
     public  OrderDetails(){}
    private OrderDetails(Builder builder){

        this.quantity = builder.quantity;
        this.taxStatus = builder.taxStatus;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getTaxStatus() {
        return taxStatus;
    }
    public static class Builder {
        int quantity;
        String taxStatus;
        public Builder quantity( int quantity) {
            this.quantity = quantity;
            return this;
        }
        public Builder taxStatus( String taxStatus) {
            this.taxStatus = taxStatus;
            return this;
        }

        public Builder copy(OrderDetails orderDetails){

            this.quantity = orderDetails.quantity;
            this.taxStatus = orderDetails.taxStatus;

            return this;
        }
        public OrderDetails build() {
            return new OrderDetails(this);
        }

    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "quantity=" + quantity +
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
        OrderDetails that = (OrderDetails) o;
        return quantity == that.quantity &&
                taxStatus.equals(that.taxStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantity, taxStatus);
    }
}
