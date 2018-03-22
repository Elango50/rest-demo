package com.employee.dao;
import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeDAO {
	
	
    List<Employee> getAllEmployee();
    
    Employee getEmployeeById(int empId);
    
    void addEmployee(Employee article);
    
    void updateEmployee(Employee article);
    
    void deleteEmployee(int empId);
    
    boolean checkEmployee(String title, String category);
}
 