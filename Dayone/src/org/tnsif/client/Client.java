package org.tnsif.client;
import org.tnsif.entities.Employee;
import org.tnsif.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		new EmployeeServiceImpl();
		new Employee();
		
		
		//create
		/*
		emp.setId(102);
		emp.setName("Parag Gupta");
		service.createEmployee(emp);
		System.out.println("The data is added successfully in the DB"); 
		*/
		
		//update
		/*
		emp = service.retrieveEmployee(102);
		emp.setName("Abhinav Rawat");
		service.updateEmployee(emp);
		System.out.println("The data updated successfully in the DB");*/
		
		//delete
		/*
		emp = service.retrieveEmployee(102);
		service.removeEmployee(emp);
		System.out.println("The data deleted successfully from DB");*/
		
		/*retrieve
		emp = service.retrieveEmployee(101);
		System.out.println("Emp Id: "+emp.getId()+" Emp Name: "+emp.getName());
	*/
		}

}