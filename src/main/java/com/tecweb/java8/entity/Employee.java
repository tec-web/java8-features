package com.tecweb.java8.entity;

public class Employee {
    public static final String MANAGER_JOB = "Manager";
    public static final String DEVELOPER = "Developer";
    public static final String TESTER = "Tester";
    public static final String TRAINER = "Trainer";

    private Long id;
    private String firstName;
    private String lastName;
    private float salary;
    private String jobTitle;

    public Employee(){}

    public Employee(Long id, String firstName, String lastName, float salary, String jobTitle) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
