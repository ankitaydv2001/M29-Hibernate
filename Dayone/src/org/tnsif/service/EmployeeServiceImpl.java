package org.tnsif.service;
import org.tnsif.dao.EmployeeDaoImpl;
import org.tnsif.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDaoImpl dao;
	
	//constructor form superclass
	public EmployeeServiceImpl() {
		dao=new EmployeeDaoImpl();
	}
	//add or create
	public void createEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
	}

	public Employee retrieveEmployee(int id) {
		Employee emp=dao.getEmployee(id);
		return emp;
	}

	public void updateEmployee(Employee emp) {
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
	}

	public void deleteEmployee(Employee emp) {
		dao.beginTransaction();
		dao.deleteEmployee(emp);
		dao.commitTransaction();
	}
	@Override
	public void addStudent(Employee employee) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateStudent(Employee employee) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeStudent(Employee employee) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Employee findStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}