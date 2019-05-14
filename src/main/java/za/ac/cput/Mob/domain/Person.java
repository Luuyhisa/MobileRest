package za.ac.cput.Mob.domain;

import java.util.Objects;

public class Person {
    String strName,address;
    public Person(){}
    private Person(Builder builder){

        this.strName = builder.strName;
        this.address = builder.address;

    }


    public String getStrName() {
        return strName;
    }
    public String getAddress() {
        return address;
    }
    public static class Builder {
        String strName,address;
        public Builder strName( String strName) {
            this.strName = strName;
            return this;
        }
        public Builder address( String address) {
            this.address = address;
            return this;
        }
        public Builder copy(Person person){
            this.strName = person.strName;
            this.address = person.address;
            return this;
        }
        public Person build() {
            return new Person(this);
        }


    }

    @Override
    public String toString() {
        return "Person{" +
                "strName='" + strName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return strName.equals(person.strName) &&
                address.equals(person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strName, address);
    }
}
