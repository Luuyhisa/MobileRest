package za.ac.cput.Mob.domain;

import java.util.Objects;

public class Item {
    private String Descr;
    private  int intItemNumb;
    private double  itemPrice;
    public Item() {
    }
    private Item(Builder builder){
        this.Descr = builder.Descr;
        this.intItemNumb = builder.intItemNumb;
        this.itemPrice = builder.itemPrice;
    }
    public String getDescr() {
        return Descr;
    }
    public int getIntItemNumb() {
        return intItemNumb;
    }
    public double getItemPrice() {
        return itemPrice;
    }
        public static class Builder {
        private String Descr;
        private  int intItemNumb;
        private double  itemPrice;
        public Builder Descr(String Descr) {
            this.Descr = Descr;
            return this;
        }
        public Builder IntItemNumb(int intItemNumb) {
            this.intItemNumb = intItemNumb;
            return this;
        }
        public Builder ItemPrice(double itemPrice) {
            this.itemPrice = itemPrice;
            return this;
        }
            public Item build() {
                return new Item(this);
            }
         }

    @Override
    public String toString() {
        return "Item{" +
                "Descr='" + Descr + '\'' +
                ", intItemNumb=" + intItemNumb +
                ", itemPrice=" + itemPrice +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return intItemNumb == item.intItemNumb;
    }

    @Override
    public int hashCode() {
        return Objects.hash(intItemNumb);
    }
}
