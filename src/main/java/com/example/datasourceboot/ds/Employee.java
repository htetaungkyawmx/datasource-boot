package com.example.datasourceboot.ds;

import java.sql.Date;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Date hiredate;
    private double salary;

    public Employee(int id, String firstName, String lastName, String email, String phoneNumber, Date hiredate, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hiredate = hiredate;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hiredate=" + hiredate +
                ", salary=" + salary +
                '}';
    }
}
