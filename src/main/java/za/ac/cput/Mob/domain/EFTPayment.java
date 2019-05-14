package za.ac.cput.Mob.domain;

import java.util.Objects;

public class EFTPayment extends Payment {
private String strCardNo,CardType,ExpDate;
    public  EFTPayment(){}

    private EFTPayment(Builder builder){

        this.strCardNo = builder.strCardNo;
        this.CardType = builder.CardType;
        this.ExpDate = builder.ExpDate;
    }
    public String getStrCardNo() {
        return strCardNo;
    }
    public String getCardType() {
        return CardType;
    }
    public String getExpDate() {
        return ExpDate;
    }
    public static class Builder {

        private String strCardNo,CardType,ExpDate;

        public Builder strCardNo( String strCardNo) {
            this.strCardNo = strCardNo;
            return this;
        }
        public Builder CardType( String CardType) {
            this.CardType = CardType;
            return this;
        }
        public Builder ExpDate( String ExpDate) {
            this.ExpDate = ExpDate;
            return this;
        }
        public Builder copy(EFTPayment eftPayment){

            this.strCardNo = eftPayment.strCardNo;
            this.CardType = eftPayment.CardType;
            this.ExpDate = eftPayment.ExpDate;

            return this;

        }

        public EFTPayment build() {
            return new EFTPayment(this);
        }


    }

    @Override
    public String toString() {
        return "EFTPayment{" +
                "strCardNo='" + strCardNo + '\'' +
                ", CardType='" + CardType + '\'' +
                ", ExpDate='" + ExpDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EFTPayment eftPayment = (EFTPayment) o;
        return strCardNo.equals(eftPayment.strCardNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strCardNo);
    }
}
