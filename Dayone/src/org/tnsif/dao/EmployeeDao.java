package org.tnsif.dao;

import org.tnsif.entities.Employee;

public interface EmployeeDao 
{
	public abstract Employee getEmployeeById(int id);
	public abstract void addEmployee(Employee employee);
	public abstract void removeEmployee(Employee employee);
	public abstract void updateEmployee(Employee employee);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
	