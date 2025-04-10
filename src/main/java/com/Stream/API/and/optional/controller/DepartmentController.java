package com.Stream.API.and.optional.controller;

import com.Stream.API.and.optional.employee.Employee;
import com.Stream.API.and.optional.service.DepartmentService;
import com.Stream.API.and.optional.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    public DepartmentService departmentService;

    public EmployeeService employeeService;

    public DepartmentController(DepartmentService departmentService, EmployeeService employeeService) {
        this.departmentService = departmentService;
        this.employeeService = employeeService;
    }
    @GetMapping("/max-salary")
    public Employee employeeMaxSalaryDepartment(@RequestParam("departmentId") String department){
        return departmentService.employeeMaxSalaryDepartment(department);
    }
    @GetMapping("/min-salary")
    public Employee employeeMinSalaryDepartment(@RequestParam("departmentId") String departmentId){
        return departmentService.employeeMinSalaryDepartment(departmentId);
    }
    @GetMapping("/all")
    public Map<String, List<Employee>> allEmployeeDepartment(@RequestParam(value = "departmentId",required = false)String departmentId){
        if (departmentId==null){
            return departmentService.allEmployeeDepartment(departmentId);
        }
        return departmentService.allEmployeeDepartment(departmentId);
    }
}
