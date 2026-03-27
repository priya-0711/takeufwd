package org.example.java8quesrevision;

import java.util.List;

class Employee {
    String name;
    double salary;
    List<String> skills;

    List<String> getSkills() {
        return skills;
    }

    Employee(String name, double salary,List<String> skills) {
        this.name = name;
        this.salary = salary;
        this.skills = skills;
    }

    double getSalary() {
        return salary;
    }
}

class Department {
    String name;
    List<Employee> employees;

    Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    List<Employee> getEmployees() {
        return employees;
    }
}
