package com.employee.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.employee.entity.Employee;
@Transactional
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;	
	
	@Override
	public Employee getEmployeeById(int empId) {
		return entityManager.find(Employee.class, empId);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployee() {
		String hql = "FROM Employee as atcl ORDER BY atcl.articleId";
		return (List<Employee>) entityManager.createQuery(hql).getResultList();
	}	
	
	@Override
	public void addEmployee(Employee employee) {
		entityManager.persist(employee);
	}
	
	@Override
	public void updateEmployee(Employee employee) {
		
		Employee emp = getEmployeeById(employee.getEmpId());
		emp.setName(employee.getName());
		emp.setDepartment(employee.getDepartment());
		entityManager.flush();
	}
	
	@Override
	public void deleteEmployee(int empId) {
		entityManager.remove(getEmployeeById(empId));
	}
	
	@Override
	public boolean checkEmployee(String title, String department) {
		
		String hql = "FROM Article as atcl WHERE atcl.title = ? and atcl.department = ?";
		int count = entityManager.createQuery(hql).setParameter(1, title)
		              .setParameter(2, department).getResultList().size();
		return count > 0 ? true : false;
	}
}
