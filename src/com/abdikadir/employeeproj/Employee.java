package com.abdikadir.employeeproj;

public class Employee extends EmployeeReport {
    // Fields/variables
    private int id;
    private String name;
    private double salary;

    // Default constructor
    public Employee() {
    }
    // All args constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void displayEmpData(){
        displayHeading();
        System.out.println(" ID: " + getId() + " Name: " + getName() + " salary: " + getSalary());
    }
    // ToString method
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void displayHeading() {
        System.out.println("ABC Engineering");
//    }
//    public void displayEmpData();{

    }
    @Override
    public void updateEmployee(){

    }
    @Override
    public void deleteEmployee() {


    }
}

