package com.example.testboot.boottest.model;

public class Employee {
    String name;
    String salary;

    public Employee(String name, String salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
