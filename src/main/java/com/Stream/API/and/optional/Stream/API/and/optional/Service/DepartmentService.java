package com.Stream.API.and.optional.Stream.API.and.optional.Service;

import com.Stream.API.and.optional.Stream.API.and.optional.Employee;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DepartmentService {
    private final EmployeeService employeeService;

    public DepartmentService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public Employee employeeMaxSalaryDepartment(String department) {
        List<Employee> employees = employeeService.allEmployee();
        return employees.stream()
                .filter(employee -> employee.getDepartment().equals(department))
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);
    }

    public Employee employeeMinSalaryDepartment(String department) {
        List<Employee> employees = employeeService.allEmployee();
        return employees.stream()
                .filter(employee -> employee.getDepartment().equals(department))
                .min(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);
    }

    public Map<String, List<Employee>> allEmployeeDepartment(String department) {
        List<Employee> employees = employeeService.allEmployee();
        return employees.stream()
                .filter(employee -> employee.getDepartment().equals(department))
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }
}
