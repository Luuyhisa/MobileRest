package za.ac.cput.Mob.domain;

import java.util.Objects;

public class Inventory {
   private   int itemNum,itemQuantity;
    public Inventory(){}

    public Inventory(Builder builder){
        this.itemNum = builder.itemNum;
        this.itemQuantity = builder.itemQuantity;



    }
    public int getItemNum() {
        return itemNum;
    }
    public int getItemQuantity() {
        return itemQuantity;
    }


    public static class Builder{
        private   int itemNum,itemQuantity;

        public Builder itemNum( int itemNum) {
            this.itemNum = itemNum;
            return this;
        }
        public Builder itemQuantity( int itemQuantity) {
            this.itemQuantity = itemQuantity;
            return this;
        }


        public Inventory build(){
            return new Inventory(this);

        }


    }


    @Override
    public String toString() {
        return "Inventory{" +
                "itemNum=" + itemNum +
                ", itemQuantity=" + itemQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventory inventory = (Inventory) o;
        return itemNum == inventory.itemNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemNum);
    }
}
