package org.tnsif.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee implements Serializable {
private static final long serialVersionUID = 1L;

@Id
private int employeeId;
private String name;

public int getEmployeeId() {
return employeeId;
}

public void setEmployeeId(int employeeId) {
this.employeeId = employeeId;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}
}