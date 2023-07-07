package org.tnsif.dao;

import org.tnsif.entities.Employee;

import javax.persistence.EntityManager;

public class EmployeeDaoImpl implements EmployeeDao
{
	private EntityManager entityManager;
	public EmployeeDaoImpl() {
	entityManager = JPAUtil.getEntityManager();
}

	@Override
		public Employee getEmployeeById(int id) 
		{
			Employee employee = entityManager.find(Employee.class, id);
			return employee;
		}
	
	@Override
		public void addEmployee(Employee employee) 
		{
			entityManager.persist(employee);
		}
		
	@Override
		public void removeEmployee(Employee employee) 
		{
			entityManager.remove(employee);
		}
		
	@Override
		public void updateEmployee(Employee employee) 
		{
			entityManager.merge(employee);
		}
		
	@Override
		public void beginTransaction() 
		{
			entityManager.getTransaction().begin();
		}
		
	@Override
		public void commitTransaction() 
		{
			entityManager.getTransaction().commit();
		}

	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}