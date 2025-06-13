package com.pislabs.springboot.webrestfulecrud.dao;

import com.pislabs.springboot.webrestfulecrud.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author rayl
 * @description:
 * @date 2025/6/15 07:20
 */
@Repository
public class DepartmentDao {
    private static Map<Integer, Department> departments = null;

    static {
        departments = new HashMap<Integer, Department>();
        departments.put(101, new Department(101, "D-AA"));
        departments.put(101, new Department(102, "D-BB"));
        departments.put(101, new Department(103, "D-CC"));
        departments.put(101, new Department(104, "D-DD"));
        departments.put(101, new Department(105, "D-EE"));
    }

    public Collection<Department> getDepartments() {
        return departments.values();
    }

    public Department getDepartment(Integer id) {
        return departments.get(id);
    }
}
