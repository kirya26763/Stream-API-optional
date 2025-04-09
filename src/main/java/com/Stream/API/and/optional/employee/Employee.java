package com.Stream.API.and.optional.employee;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private String middleName;
    private int salary;
    private String department;

    public Employee(String firstName, String lastName, String middleName, int salary, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.salary = salary;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(middleName, employee.middleName) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, salary, department);
    }

    @Override
    public String toString() {
        return "Employee - " + firstName + ' ' + lastName + ' ' + middleName + " ЗП - " + salary +
                " отдел " + department;
    }
}
