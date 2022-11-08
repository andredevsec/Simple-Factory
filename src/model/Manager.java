package model;

public class Manager extends Employee{
	
	public Manager() {
		super("Gerente");
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return 10000;
	}
	
}
