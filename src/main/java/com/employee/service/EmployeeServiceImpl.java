package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDAO;
import com.employee.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	public Employee getEmployeeById(int articleId) {
		Employee obj = employeeDAO.getEmployeeById(articleId);
		return obj;
	}	
	
	@Override
	public List<Employee> getAllEmployee(){
		return employeeDAO.getAllEmployee();
	}
	
	@Override
	public synchronized boolean addEmployee(Employee employee) {
		
       if (employeeDAO.checkEmployee(employee.getName(), employee.getDepartment())) {
    	   return false;
       } else {
    	   employeeDAO.addEmployee(employee);
    	   return true;
       }
	}
	
	@Override
	public void updateEmployee(Employee employee) {
		employeeDAO.updateEmployee(employee);
	}
	
	@Override
	public void deleteEmployee(int articleId) {
		employeeDAO.deleteEmployee(articleId);
	}
}
