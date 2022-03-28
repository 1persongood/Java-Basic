package Exercise2;

import java.util.Scanner;

public class EastAsiaCountries extends Country {

	private String countryTerrain;
	public EastAsiaCountries() {

	}
	public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
		super(countryCode, countryName, totalArea);
		this.countryTerrain = countryTerrain;
	}

	public String getCountryTerrain() {
		return countryTerrain;
	}

	public void setCountryTerrain(String countryTerrain) {
		this.countryTerrain = countryTerrain;
	}
	@Override
	public void display() {
		super.display();
		System.out.println(countryTerrain);
	}
	public void Input(){
		Scanner sn = new Scanner(System.in);
		super.Input();
		System.out.println("Enter terrain of country:");
		countryTerrain = sn.next();
	}
}
