package com.tecweb.java8.function.predicate;

import com.tecweb.java8.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilteringWithPredicates {
    private List<Employee> employees;

    public FilteringWithPredicates(){
        employees = new ArrayList<>();
    }

    public static void main(String ... args){
        FilteringWithPredicates fp = new FilteringWithPredicates();

        Employee manager =
                new Employee(1L, "Albus", "Dumbledore", 1200.35f, Employee.MANAGER_JOB);
        Employee tester =
                new Employee(2L, "Ron", "Whisley", 1100.24f, Employee.TESTER);
        Employee developerOne =
                new Employee(3L, "Hermione", "Granger", 2500.45f, Employee.DEVELOPER);
        Employee developerTwo =
                new Employee(4L, "Harry", "Potter", 2500.45f, Employee.DEVELOPER);
        Employee trainer =
                new Employee(5L, "Severous", "Snape", 2700.45f, Employee.TRAINER);
        fp.addEmployees(manager, tester, developerOne, developerTwo, trainer);

        Predicate<Employee> devPredicate = e -> Employee.DEVELOPER.equals(e.getJobTitle());
        List<Employee> filteredEmployees = fp.filter(fp.employees, devPredicate);
        for(Employee e : filteredEmployees){
            System.out.println(String.format("%s, is %s", e.getFirstName(), e.getJobTitle()));
        }
        /* Employees who are not developers */
        filteredEmployees = fp.filter(fp.employees, devPredicate.negate());
        for(Employee e : filteredEmployees){
            System.out.println(String.format("%s, is %s", e.getFirstName(), e.getJobTitle()));
        }
    }

    void addEmployees(Employee ... employees){
        for(Employee emp : employees){
            this.employees.add(emp);
        }
    }

    List<Employee> filter(List<Employee> employees, Predicate<Employee> p){
        List<Employee> filteredEmployees = new ArrayList<>();
        for(Employee e : employees){
            if(p.test(e)){
                filteredEmployees.add(e);
            }
        }
        return filteredEmployees;
    }
}

