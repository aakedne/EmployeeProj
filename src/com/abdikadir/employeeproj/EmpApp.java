package com.abdikadir.employeeproj;

public class EmpApp {

    public static void main(String[] args) {
        Employee emp1 = new Employee( 1, "Abdikadir",  80000);
        emp1.displayEmpData();
        emp1.deleteEmployee();
        emp1.updateEmployee();

        Employee emp2 = new Employee(2, "Lory",  76000);
        emp2.displayEmpData();
        emp2.deleteEmployee();
        emp2.updateEmployee();

//        emp1.displayHeading();
//        emp2.displayHeading();
    }
}
