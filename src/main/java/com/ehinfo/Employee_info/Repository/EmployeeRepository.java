package com.ehinfo.Employee_info.Repository;


import com.ehinfo.Employee_info.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
