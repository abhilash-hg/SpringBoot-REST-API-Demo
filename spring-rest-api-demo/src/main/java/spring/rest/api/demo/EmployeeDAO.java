package spring.rest.api.demo;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

	private static Employees list = new Employees();

	static {

		list.getEmployeeList().add(new Employee(1, "Abhilash", "Gowda", "abhilash.hg@gmail.com"));

		list.getEmployeeList().add(new Employee(2, "Manoj", "Kumar", "manoj@gmail.com"));

		list.getEmployeeList().add(new Employee(3, "Kiran", "Gowda", "kiran@gmail.com"));

	}

	public Employees getAllEmployees() {

		return list;
	}

	public void addEmployee(Employee employee) {
		list.getEmployeeList().add(employee);

	}
}
