package za.ac.cput.Mob.domain;

import java.util.Objects;

public class MobileRest  {

    String Location, physicalLoc;
public MobileRest(){}
     private MobileRest(Builder builder){

        this.Location = builder.Location;
        this.physicalLoc = builder.physicalLoc;
         }
    public String getLocation() {
        return Location;
    }
    public String getPhysicalLoc() {
        return physicalLoc;
    }
    public static class Builder {
        String Location, physicalLoc;
        public Builder Location( String Location) {
            this.Location = Location;
            return this;
        }
        public Builder physicalLoc( String physicalLoc) {
            this.physicalLoc = physicalLoc;
            return this;
        }
        public Builder copy(MobileRest mobileRest){

            this.Location = mobileRest.Location;
            this.physicalLoc = mobileRest.physicalLoc;
           return this;
        }
        public MobileRest build() {
            return new MobileRest(this);
        }


    }

    @Override
    public String toString() {
        return "MobileRest{" +
                "Location='" + Location + '\'' +
                ", physicalLoc='" + physicalLoc + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobileRest that = (MobileRest) o;
        return Location.equals(that.Location) &&
                physicalLoc.equals(that.physicalLoc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Location, physicalLoc);
    }
}
