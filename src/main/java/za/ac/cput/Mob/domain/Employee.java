package za.ac.cput.Mob.domain;

public class Employee extends Person {
    private String employeeNumber;
    private Employee(){
     }
    public Employee(Builder builder) {
        this.employeeNumber = builder.employeeNumber;
    }
    public String getEmployeeNumber() {
        return employeeNumber;
    }
    public static class Builder {
        private String employeeNumber;
        //private double account;
        public Builder employeeNumber( String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }
        public Employee build() {
            return new Employee(this);
        }
        @Override
        public String toString() {
            return "Builder{" +
                    "employee Number = " + employeeNumber +'}';
        }

    }
}
