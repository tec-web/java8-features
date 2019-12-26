package com.tecweb.java8.streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SimpleStreamMapper {
        static Function<Employee, Employee> raiseSalary = (e) -> {
            e.setSalary(e.getSalary() * 1.08);
            return e;
        };

        public static void main(String ... args){
        Employee homer = new Employee("Homer", "Simpson", "Sales", 1200);
        Employee bart = new Employee("Bart", "Simpson", "IT", 850);
        Employee lisa = new Employee("Lisa", "Simpson", "IT", 1000);
        Employee margie = new Employee("Margie", "Simpson", "Marketing", 760);

        List<Employee> employees = List.of(homer, bart, lisa, margie);
        List<Employee> employeesWithRaisedSalary = employees.stream()
                .filter(e -> "IT".equals(e.getDepartment()))
                .map(raiseSalary)
                .collect(Collectors.toList());

        employeesWithRaisedSalary.forEach(System.out::println);
    };

static class Employee{
        private String firstName;
        private String lastName;
        private String department;
        private double salary;

        public Employee(String firstName, String lastName, String department, double salary){
            this.firstName = firstName;
            this.lastName = lastName;
            this.department = department;
            this.salary = salary;
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

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String toString(){
            return this.getFirstName() + " " + this.getSalary();
        }
    }
}
