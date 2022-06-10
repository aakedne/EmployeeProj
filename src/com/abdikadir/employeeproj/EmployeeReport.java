package com.abdikadir.employeeproj;

public abstract class EmployeeReport {
    // abstract method
    public abstract void displayEmpData();

    //Concrete method
    public void displayHeading(){
        System.out.println("ABC Engineering");
    }

    public abstract void updateEmployee();

    public abstract void deleteEmployee();
}
