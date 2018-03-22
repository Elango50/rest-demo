package com.employee.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee implements Serializable { 
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id")
    private int empId;  
	
	@Column(name="name")
    private String name;
	
	@Column(name="department")	
	private String department;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
/*	
	use employee;

	CREATE TABLE IF NOT EXISTS `users` (
	  `username` varchar(50) NOT NULL,
	  `password` varchar(100) NOT NULL,
	  `full_name` varchar(100) NOT NULL,
	  `role` varchar(50) NOT NULL,
	  `country` varchar(100) NOT NULL,
	  `enabled` tinyint(1) NOT NULL,
	  PRIMARY KEY (`username`)
	) ENGINE=InnoDB DEFAULT CHARSET=latin1;

	CREATE TABLE IF NOT EXISTS `employee` (
	  `emp_id` int(5) NOT NULL AUTO_INCREMENT,
	  `name` varchar(200) NOT NULL,
	  `department` varchar(100) NOT NULL,
	  PRIMARY KEY (`emp_id`)
	) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

	INSERT INTO `users` (`username`, `password`, `full_name`, `role`, `country`, `enabled`) VALUES
		('test', '$2a$10$N0eqNiuikWCy9ETQ1rdau.XEELcyEO7kukkfoiNISk/9F7gw6eB0W', 'm123', 'ROLE_ADMIN', 'India', 1);*/


	
} 