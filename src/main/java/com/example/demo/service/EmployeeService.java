package com.example.demo.service;
import java.util.List;

import com.example.demo.Dto.EmployeeDTO;
import com.example.demo.Dto.LoginDTO;
import com.example.demo.model.Employee;
import com.example.demo.response.LoginMesage;


public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);

    LoginMesage loginEmployee(LoginDTO loginDTO);

	List<Employee> getAll();

}
