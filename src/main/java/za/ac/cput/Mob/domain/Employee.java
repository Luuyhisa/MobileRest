package za.ac.cput.Mob.domain;

import java.util.Objects;

public class Employee extends Person {
    private String employeeNumber;
    public Employee(){
     }
    public Employee(Builder builder) {
        this.employeeNumber = builder.employeeNumber;
    }
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public static class Builder {
        private String employeeNumber;
       // private double account;
        public Builder employeeNumber( String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder copy(Employee employee){
            this.employeeNumber = employee.employeeNumber;
            return this;

        }

        public Employee build() {
            return new Employee(this);
        }


    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", strName='" + strName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeNumber, employee.employeeNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNumber);
    }
}
