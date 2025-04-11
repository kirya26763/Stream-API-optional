package com.Stream.API.and.optional.Stream.API.and.optional.Controller;

import com.Stream.API.and.optional.Stream.API.and.optional.Employee;
import com.Stream.API.and.optional.Stream.API.and.optional.Service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/department")
public class ControllerDepartment {
    private final DepartmentService departmentService;

    public ControllerDepartment(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/max-salary")
    public Employee employeeMaxSalaryDepartment(@RequestParam("departmentId") String departmentId) {
        return departmentService.employeeMaxSalaryDepartment(departmentId);
    }

    @GetMapping("/min-salary")
    public Employee employeeMinSalaryDepartment(@RequestParam("departmentId") String departmentId) {
        return departmentService.employeeMinSalaryDepartment(departmentId);
    }

    @GetMapping("/all")
    public Map<String, List<Employee>> allEmployeeDepartment(@RequestParam("departmentId") String departmentId) {
        if (departmentId == null) {
            return departmentService.allEmployeeDepartment(departmentId);
        }
        return departmentService.allEmployeeDepartment(departmentId);
    }
}