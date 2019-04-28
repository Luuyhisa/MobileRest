package za.ac.cput.Mob.domain;



public class Customer  extends Person {
    private String custID,custName,custSur,custddress;
    private double account;
    public Customer() {
    }
    private Customer(Builder builder){

        this.custID = builder.custID;
        this.custName = builder.custName;
        this.custSur = builder.custSur;
        this.custddress = builder.custddress;
    }
    public String getCustID() {
        return custID;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustSur() {
        return custSur;
    }

    public String getCustddress() {
        return custddress;
    }

    public double getAccount() {
        return account;
    }
    public static class Builder {
        private String custID,custName,custSur,custddress;
        private double account;
        public Builder custID( String custID) {
            this.custID = custID;
            return this;
        }
        public Builder custName( String custName) {
            this.custName = custName;
            return this;
        }public Builder custSur( String custSur) {
            this.custSur = custSur;
            return this;
        }public Builder custddress( String custddress) {
            this.custddress = custddress;
            return this;
        }
        public Customer build() {
            return new Customer(this);
        }
        @Override
        public String toString() {
            return "Builder{" +
                    "custID='" + custID + '\'' +
                    ", custName='" + custName + '\'' +
                    ", custSur='" + custSur + '\'' +
                    ", custddress='" + custddress + '\'' +
                    ", account=" + account +
                    '}';
        }

    }

}
