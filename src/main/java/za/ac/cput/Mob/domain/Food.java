package za.ac.cput.Mob.domain;

import java.util.Objects;

public class Food {
    private int iAmount,iPrepTime;
    private String descrpt;

    public Food(){

    }
    private Food(Builder builder) {

        this.iAmount = builder.iAmount;
        this.iPrepTime = builder.iPrepTime;
        this.descrpt = builder.descrpt;

    }
        public int getiAmount() {
        return iAmount;
    }
    public int getiPrepTime() {
        return iPrepTime;
    }
    public String getDescrpt() {
        return descrpt;
    }

    public static class Builder {
        private int iAmount,iPrepTime;
        private String descrpt;

        public Builder iAmount( int iAmount) {
            this.iAmount = iAmount;
            return this;
        }

        public Builder iPrepTime( int iPrepTime) {
            this.iPrepTime = iPrepTime;
            return this;
        }

        public Builder descrpt( String descrpt) {
            this.descrpt = descrpt;
            return this;
        }
        public Food build() {
            return new Food(this);
        }


    }

    @Override
    public String toString() {
        return "Food{" +
                "iAmount=" + iAmount +
                ", iPrepTime=" + iPrepTime +
                ", descrpt='" + descrpt + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Objects.equals(descrpt, food.descrpt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descrpt);
    }
}
