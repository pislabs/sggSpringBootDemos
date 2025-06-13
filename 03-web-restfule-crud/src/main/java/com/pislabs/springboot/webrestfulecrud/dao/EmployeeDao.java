package com.pislabs.springboot.webrestfulecrud.dao;

import com.pislabs.springboot.webrestfulecrud.entity.Department;
import com.pislabs.springboot.webrestfulecrud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author rayl
 * @description:
 * @date 2025/6/15 07:20
 */
@Repository
public class EmployeeDao {

    private static Map<Integer, Employee> employees = null;

    @Autowired
    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer, Employee>();
        employees.put(1001, new Employee(1001, "E-AA", "aa@labs.com", 1, new Date(2001, 1, 1), new Department(101, "D-AA")));
        employees.put(1002, new Employee(1002, "E-BB", "bb@labs.com", 1, new Date(2000, 2, 6), new Department(102, "D-BB")));
        employees.put(1003, new Employee(1003, "E-CC", "cc@labs.com", 0, new Date(2000, 3, 7), new Department(103, "D-CC")));
        employees.put(1004, new Employee(1004, "E-DD", "dd@labs.com", 0, new Date(2001, 4, 8), new Department(104, "D-DD")));
        employees.put(1005, new Employee(1005, "E-EE", "ee@labs.com", 1, new Date(2001, 5, 9), new Department(105, "D-EE")));
    }

    private static Integer initId = 1006;

    public void save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
        }
    }

    public Employee get(Integer id) {
        return employees.get(id);
    }

    public Collection<Employee> getAll() {
        return employees.values();
    }
}
