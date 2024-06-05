package com.ehinfo.Employee_info.controller;
import com.ehinfo.Employee_info.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ehinfo.Employee_info.Service.Employeeservice;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class Employeecontroller {
    @Autowired
    private Employeeservice service;
    @PostMapping("/addemp")
    public Employee addEmployee( @RequestBody  Employee employee){
        return service.addEmployee(employee);
    }
}
