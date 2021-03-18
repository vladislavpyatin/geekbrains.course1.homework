package ru.geekbrains.course1.homework5;

import javax.swing.*;

public class Employee {
    private String  fullName;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    private String [] Employee = {"Vlad", "John", "Vera", "Nicholas", "Anita"};




    Employee (String fullName, String position, String email, int phoneNumber, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }



    private void printInfo (){
        System.out.println("Full name: " + fullName + "; Position: " + position + "; Email: " + email +
                "; Phone number: " + phoneNumber + "; Salary: " + salary + "; Age: " + age);
    }

    public String[] getEmployee() {
        return Employee;
    }

    public void setEmployee(String[] employee) {
        for ( int i = 0; i < employee.length; i++){
            if (age > 40){
                printInfo();
            }
        }
        Employee = employee;
    }
}
