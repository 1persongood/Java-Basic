package Exercise2;

import java.util.Scanner;

public class Country {

	protected String countryCode;
	protected String countryName;
	protected float totalArea;

	public Country() {
	}

	public Country(String countryCode, String countryName, float totalArea) {
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.totalArea = totalArea;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public float getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(float totalArea) {
		this.totalArea = totalArea;
	}
	public void display() {
		System.out.print(getCountryCode()+"\t"+ getCountryName()+"\t\t"+getTotalArea()+"\t\t");
	}
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code of country:");
		countryCode = sc.next();
		System.out.println("Enter name of country:");
		countryName = sc.next();
		System.out.println("Enter total Area:");
		totalArea = sc.nextFloat();
	}
}
