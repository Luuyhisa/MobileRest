package za.ac.cput.Mob.factory;

import za.ac.cput.Mob.domain.Employee;

public class EmployeeFactory {


    public static Employee getCustomer(String employeeNumber) {
        return new Employee.Builder()
                .employeeNumber(employeeNumber)
                .build();
    }
}
