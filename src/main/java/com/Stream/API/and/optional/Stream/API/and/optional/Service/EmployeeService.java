package com.Stream.API.and.optional.Stream.API.and.optional.Service;

import com.Stream.API.and.optional.Stream.API.and.optional.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {
    private final Map<String, Employee> employees;

    public EmployeeService() {
        employees = new HashMap<>(new HashMap<>(Map.of(
                "Дмитрий", new Employee("Дмитрий", "Иванов", "Александрович", 152100, "1"),
                "Олег", new Employee("Олег", "Дмитрев", "Евгеневич", 152000, "1"),
                "Вадим", new Employee("Вадим", "Стрельников", "Никитич", 100020, "2"),
                "Александр", new Employee("Александр", "Рубинов", "Леонидович", 100000, "2"),
                "Данил", new Employee("Данил", "Михаилов", "Генадьевичь", 80007, "3"),
                "Леонид", new Employee("Леонид", "Григорьев", "Артемович", 55000, "3"),
                "Алексей", new Employee("Алексей", "Матросов", "Михаилович", 60001, "4"),
                "Михаил", new Employee("Михаил", "Берегов", "Алексеевич", 60000, "4"),
                "Кирилл", new Employee("Кирилл", "Артемьев", "Владимирович", 45097, "5"),
                "Никита", new Employee("Никита", "Голубцов", "Григорьевичь", 45000, "5"))));
    }

    public List<Employee> allEmployee() {
        return new ArrayList<>(employees.values());
    }
}