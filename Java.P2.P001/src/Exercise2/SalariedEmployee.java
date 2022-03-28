package Exercise2;

import java.util.Scanner;

public class SalariedEmployee extends Employee{

	private double commisstionRate;
	private double grossSales;
	private double basicSalary;
	public SalariedEmployee() {

	}

	public SalariedEmployee(String ssn, String firstName, String lastName, String birthDate, String phone, String email,
			double commisstionRate, double grossSales, double basicSalary) {
		super(ssn, firstName, lastName, birthDate, phone, email);
		this.commisstionRate = commisstionRate;
		this.grossSales = grossSales;
		this.basicSalary = basicSalary;
	}
	public double getCommisstionRate() {
		return commisstionRate;
	}
	public void setCommisstionRate(double commisstionRate) {
		this.commisstionRate = commisstionRate;
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("Commisstion Rate: ");
		commisstionRate = sc.nextDouble();
		System.out.println("Gross Sales: ");
		grossSales = sc.nextDouble();
		System.out.println("Basic Salary: ");
		basicSalary = sc.nextDouble();
	}
	public void display() {
		super.display();
		System.out.println("Commisstion Rate: " + commisstionRate);
		System.out.println("Gross Sales: " + grossSales);
		System.out.println("Basic Salary: " + basicSalary);
	}
	
	@Override
	public String toString() {
		return "SalariedEmployee [commisstionRate=" + commisstionRate + ", grossSales=" + grossSales + ", basicSalary="
				+ basicSalary + "]";
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
