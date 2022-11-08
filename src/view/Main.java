package view;

import model.Employee;
import model.EmployeeFactory;
import model.EmployeeFactory.EMPLYEE_TYPE;

public class Main {
	public static void main(String[] args) {
		Employee employee = null;
		
employee = EmployeeFactory.createEmployee(EMPLYEE_TYPE.PROGRAMER);
		
		System.out.printf("Cargo: %s, Salario: %.2f", employee.getPosition(),
				employee.calculateSalary());
		
employee = EmployeeFactory.createEmployee(EMPLYEE_TYPE.MANAGER);
		
		System.out.printf("Cargo: %s, Salario: %.2f", employee.getPosition(),
				employee.calculateSalary());
		
		employee = EmployeeFactory.createEmployee(EMPLYEE_TYPE.LEADER);
		
		System.out.printf("Cargo: %s, Salario: %.2f", employee.getPosition(),
				employee.calculateSalary());
	}

}
