package za.ac.cput.Mob.domain;

public class CContactDetails {

    private String telNo;
    private CContactDetails(){
    }
    public CContactDetails(Builder builder) {
        this.telNo = builder.telNo;
    }
    public String getTelNo() {
        return telNo;
    }
    public static class Builder {
        private String telNo;
        //private double account;
        public Builder cashBenefits( String cashBenefits) {
            this.telNo = telNo;
            return this;
        }
        public CContactDetails build() {
            return new CContactDetails(this);
        }
        @Override
        public String toString() {
            return "Builder{" +
                    "Contact details = " + telNo +'}';
        }
    }

}
