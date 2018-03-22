package com.employee.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import com.employee.entity.Employee;

public interface EmployeeService {
	
	 @Secured ({"ROLE_ADMIN", "ROLE_USER"})
     List<Employee> getAllEmployee();
	 
	 @Secured ({"ROLE_ADMIN", "ROLE_USER"})
	 Employee getEmployeeById(int empId);
	 
	 @Secured ({"ROLE_ADMIN"})
     boolean addEmployee(Employee employee);
	 
	 @Secured ({"ROLE_ADMIN"})
     void updateEmployee(Employee employee);
	 
	 @Secured ({"ROLE_ADMIN"})
     void deleteEmployee(int empId);
}
