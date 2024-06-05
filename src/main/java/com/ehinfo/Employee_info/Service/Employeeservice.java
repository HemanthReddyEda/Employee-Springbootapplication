package com.ehinfo.Employee_info.Service;
import com.ehinfo.Employee_info.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ehinfo.Employee_info.Model.Employee;

@Service
public class Employeeservice {
    @Autowired
    private EmployeeRepository repo;
    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }
}

