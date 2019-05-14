package za.ac.cput.Mob.domain;

import java.util.Objects;

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
        public Builder telNo( String telNo) {
            this.telNo = telNo;
            return this;
        }
        public Builder copy(CContactDetails contactDetails){

            this.telNo = contactDetails.telNo;
           // this.custName = CContactDetails.custName;
            //this.custSur = CContactDetails.custSur;
           // this.custddress = CContactDetails.custddress;
            return this;
        }

        public CContactDetails build() {
            return new CContactDetails(this);
        }

    }

    @Override
    public String toString() {
        return "CContactDetails{" +
                "telNo='" + telNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CContactDetails that = (CContactDetails) o;
        return telNo.equals(that.telNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telNo);
    }
}
