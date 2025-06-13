package com.pislabs.springboot.webrestfulecrud.controller;

import com.pislabs.springboot.webrestfulecrud.dao.EmployeeDao;
import com.pislabs.springboot.webrestfulecrud.entity.Employee;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.Map;

/**
 * @author rayl
 * @description:
 * @date 2025/6/17 06:09
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;

    // 查询所有员工返回列表页面
    @GetMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps", employees);

        // 放在请求域中
        // thymyleaf默认就会拼串
        // claspath:/templates/xxx.html

        return "emp/list";
    }


    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp", employee);

        // 回到修改页面
        return "emp/edit";
    }
}
