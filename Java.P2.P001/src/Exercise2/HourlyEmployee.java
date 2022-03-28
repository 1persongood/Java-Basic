package Exercise2;

import java.util.Scanner;

public class HourlyEmployee extends Employee {

	private double wage;
	private double workingHours;
	
	public HourlyEmployee() {
		
	}
	public HourlyEmployee(String ssn, String firstName, String lastName, String birthDate, String phone, String email,double wage, double workingHours) {
		super(ssn, firstName, lastName, birthDate, phone, email);
		this.wage = wage;
		this.workingHours = workingHours;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("Input Wage: ");
		wage = sc.nextDouble();
		System.out.println("Input Working Hours: ");
		workingHours = sc.nextDouble();
	}
	public void display() {
		super.display();
		System.out.println("Wage: " + wage);
		System.out.println("Working Hours: " + workingHours);
	}
	
	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", workingHours=" + workingHours + "]";
	}
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
