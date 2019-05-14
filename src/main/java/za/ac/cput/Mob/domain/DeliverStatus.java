package za.ac.cput.Mob.domain;

public class DeliverStatus {
   private double dDistance,dTime;

    public DeliverStatus(){}

    private DeliverStatus(Builder builder){

        this.dDistance = builder.dDistance;
        this.dTime = builder.dTime;

                                            }
        public double getdDistace() {
        return dDistance;
        }
        public double getdTime() {
         return dTime;
        }

    public static class Builder {
        private double dDistance,dTime;

        public Builder dDistance( double dDistance) {
            this.dDistance = dDistance;
            return this;
        }
        public Builder dTime( double dTime) {
            this.dTime = dTime;
            return this;
        }
        public Builder copy(DeliverStatus deliverStatus){

            this.dDistance = deliverStatus.dDistance;
            this.dTime = deliverStatus.dTime;

            return this;
        }

        public DeliverStatus build() {
            return new DeliverStatus(this);
        }


    }

    @Override
    public String toString() {
        return "DeliverStatus{" +
                "dDistance=" + dDistance +
                ", dTime=" + dTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliverStatus that = (DeliverStatus) o;
        return Double.compare(that.dDistance, dDistance) == 0 &&
                Double.compare(that.dTime, dTime) == 0;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
