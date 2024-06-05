package com.ehinfo.Employee_info.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    public int id;
    public String employee_id;
    public String image;
    public String name;
    public String department;
    public String designation;
    public String email;
    public String phone;
    public String address;
    public String salary;
}