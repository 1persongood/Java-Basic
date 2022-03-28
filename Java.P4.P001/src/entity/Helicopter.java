package entity;

import java.util.Scanner;

import utils.Valid;

public class Helicopter extends Airplance {

	private String ID;
	private String model;
	private String cruiseSpeed;
	private String emptyWeight;
	private String maxTakeoffWeight;
	private String range;
	private final String flyMethod="rotated wing";
	public Helicopter(String iD, String model, String cruiseSpeed, String emptyWeight, String maxTakeoffWeight,
			String range) {
		super();
		ID = iD;
		this.model = model;
		this.cruiseSpeed = cruiseSpeed;
		this.emptyWeight = emptyWeight;
		this.maxTakeoffWeight = maxTakeoffWeight;
		this.range = range;
	}
	public Helicopter() {
		super();
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCruiseSpeed() {
		return cruiseSpeed;
	}
	public void setCruiseSpeed(String cruiseSpeed) {
		this.cruiseSpeed = cruiseSpeed;
	}
	public String getEmptyWeight() {
		return emptyWeight;
	}
	public void setEmptyWeight(String emptyWeight) {
		this.emptyWeight = emptyWeight;
	}
	public String getMaxTakeoffWeight() {
		return maxTakeoffWeight;
	}
	public void setMaxTakeoffWeight(String maxTakeoffWeight) {
		this.maxTakeoffWeight = maxTakeoffWeight;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Input ID: "); ID = sc.next();
			if(!Valid.checkIDFixedwing(this.ID)) {
				System.out.println("Input error ID.Rewrite!! ");
			}
		}while(!Valid.checkIDFixedwing(this.ID));
		
		do {
			System.out.println("Input model: "); model = sc.next();
			if(!Valid.checkModel(this.model)) {
				System.out.println("Input error model.Rewrite!! ");
			}
		}while(!Valid.checkModel(this.model));
		
			
		System.out.println("Input cruise speed: "); cruiseSpeed = sc.next();
		do {
			System.out.println("Input empty weight: "); emptyWeight = sc.next();
			if(!Valid.checkDouble(this.emptyWeight)) {
				System.out.println("Input error empty weight.Rewrite!! ");
			}
		}while(!Valid.checkDouble(this.emptyWeight));
		do {
			System.out.println("Input max takeoff weight: "); maxTakeoffWeight = sc.next();
			if(!Valid.checkDouble(this.maxTakeoffWeight)) {
				System.out.println("Input error max takeoff weight.Rewrite!! ");
			}
		}while(!Valid.checkDouble(this.maxTakeoffWeight));
		
		System.out.println("Input range: "); range = sc.next();
		
	}
	@Override
	public String toString() {
		return "Helicopter [ID=" + ID + ", model=" + model + ", cruiseSpeed=" + cruiseSpeed + ", emptyWeight="
				+ emptyWeight + ", maxTakeoffWeight=" + maxTakeoffWeight + ", range=" + range + ", flyMethod="
				+ flyMethod + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Helicopter other = (Helicopter) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}
}
