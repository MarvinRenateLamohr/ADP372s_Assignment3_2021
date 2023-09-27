package za.a.cput.ADP372s_Assignment3_2021.factory;

/**
 * Student Name: MARVIN RENATE LAMOHR
 * Student Number: 214273830
 **/

import za.a.cput.ADP372s_Assignment3_2021.entity.Employee;
import za.a.cput.ADP372s_Assignment3_2021.util.GenericHelper;

public class EmployeeFactory {
    public static Employee createEmployee(String employeeFirstName, String employeeLastName, String employeeID, String employeeContactNumber, String employeeAddress, String employeeEmail, String position){

        String employeeId = GenericHelper.generateId();

        Employee employee = new Employee.Builder().
                setEmployeeFirstName(employeeFirstName).
                setEmployeeLastName(employeeLastName).
                setEmployeeID(employeeID).
                setEmployeeContactNumber(employeeContactNumber).
                setEmployeeAddress(employeeAddress).
                setEmployeeEmail(employeeEmail).
                setPosition(position).
                build();

        return employee;
    }
}
