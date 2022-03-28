package entity;

import java.util.Scanner;

import utils.Valid;

public class Fixedwing extends Airplance{

	private String ID;
	private String model;
	private String planeType;
	private String cruiseSpeed;
	private String emptyWeight;
	private String maxTakeoffWeight;
	private String minNeededRunwaySize;
	private final String flyMethod="fixed wing";
	public Fixedwing(String iD, String model, String planeType, String cruiseSpeed, String emptyWeight,
			String maxTakeoffWeight, String minNeededRunwaySize) {
		super();
		ID = iD;
		this.model = model;
		this.planeType = planeType;
		this.cruiseSpeed = cruiseSpeed;
		this.emptyWeight = emptyWeight;
		this.maxTakeoffWeight = maxTakeoffWeight;
		this.minNeededRunwaySize = minNeededRunwaySize;
	}
	public Fixedwing() {
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
	public String getPlaneType() {
		return planeType;
	}
	public void setPlaneType(String planeType) {
		this.planeType = planeType;
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
	public String getMinNeededRunwaySize() {
		return minNeededRunwaySize;
	}
	public void setMinNeededRunwaySize(String minNeededRunwaySize) {
		this.minNeededRunwaySize = minNeededRunwaySize;
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
		do {
			System.out.println("Input plane type: "); planeType = sc.next();
			if(!Valid.checkFixedwingAirplaneType(this.planeType)) {
				System.out.println("Input error plane type.Rewrite!! ");
			}
		}while(!Valid.checkFixedwingAirplaneType(this.planeType));
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
		do {
			System.out.println("Input min needed runway size: "); minNeededRunwaySize = sc.next();
			if(!Valid.checkDouble(this.minNeededRunwaySize)) {
				System.out.println("Input error min needed runway size.Rewrite!! ");
			}
		}while(!Valid.checkDouble(this.minNeededRunwaySize));
	}
	@Override
	public String toString() {
		return "Fixedwing [ID=" + ID + ", model=" + model + ", planeType=" + planeType + ", cruiseSpeed=" + cruiseSpeed
				+ ", emptyWeight=" + emptyWeight + ", maxTakeoffWeight=" + maxTakeoffWeight + ", minNeededRunwaySize="
				+ minNeededRunwaySize + ", flyMethod=" + flyMethod + "]";
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
		Fixedwing other = (Fixedwing) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}
	
	
}
