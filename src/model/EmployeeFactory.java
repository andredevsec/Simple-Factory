package model;

public class EmployeeFactory {
	
	public enum EMPLYEE_TYPE {
		MANAGER,
		PROGRAMER,
		LEADER;
	}
	
	public static Employee createEmployee(EMPLYEE_TYPE employeetype) {
		
		if(employeetype == EMPLYEE_TYPE.MANAGER)
			return new Manager();
		if(employeetype == EMPLYEE_TYPE.PROGRAMER)
			return new Progamer();
		
		
		return new Leader();
 	}
}
