package entity;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import utils.Valid;


public class Airplance implements Serializable{

	private String ID;
	private String name;
	private String runwaySize;
	private String maxFixedwingParkingPlace;
	private String maxRotatedwingParkingPlace;
	private Set<Fixedwing> listOfFixedwingAirplaneID;
	private Set<Helicopter> listOfHelicopterID;
	public Airplance(String iD, String name, String runwaySize, String maxFixedwingParkingPlace,
			String maxRotatedwingParkingPlace, Set<Fixedwing> listOfFixedwingAirplaneID,Set<Helicopter> listOfHelicopterID) {
		super();
		ID = iD;
		this.name = name;
		this.runwaySize = runwaySize;
		this.maxFixedwingParkingPlace = maxFixedwingParkingPlace;
		this.maxRotatedwingParkingPlace = maxRotatedwingParkingPlace;
		this.listOfFixedwingAirplaneID=listOfFixedwingAirplaneID;
		this.listOfHelicopterID=listOfHelicopterID;
	}
	public Airplance() {
		super();
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRunwaySize() {
		return runwaySize;
	}
	public void setRunwaySize(String runwaySize) {
		this.runwaySize = runwaySize;
	}
	public String getMaxFixedwingParkingPlace() {
		return maxFixedwingParkingPlace;
	}
	public void setMaxFixedwingParkingPlace(String maxFixedwingParkingPlace) {
		this.maxFixedwingParkingPlace = maxFixedwingParkingPlace;
	}
	public String getMaxRotatedwingParkingPlace() {
		return maxRotatedwingParkingPlace;
	}
	public void setMaxRotatedwingParkingPlace(String maxRotatedwingParkingPlace) {
		this.maxRotatedwingParkingPlace = maxRotatedwingParkingPlace;
	}
	
	public Set<Fixedwing> getListOfFixedwingAirplaneID() {
		return listOfFixedwingAirplaneID;
	}
	public void setListOfFixedwingAirplaneID(Set<Fixedwing> listOfFixedwingAirplaneID) {
		this.listOfFixedwingAirplaneID = listOfFixedwingAirplaneID;
	}
	public Set<Helicopter> getListOfHelicopterID() {
		return listOfHelicopterID;
	}
	public void setListOfHelicopterID(Set<Helicopter> listOfHelicopterID) {
		this.listOfHelicopterID = listOfHelicopterID;
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Input ID: "); ID = sc.next();
			if(!Valid.checkIDAirport(this.ID)) {
				System.out.println("Input error ID.Rewrite!! ");
			}
		}while(!Valid.checkIDAirport(this.ID));
		System.out.println("Input name: "); name = sc.next();
		do {
			System.out.println("Input runway size: "); runwaySize = sc.next();
			if(!Valid.checkDouble(this.runwaySize)) {
				System.out.println("Input error runway size.Rewrite!! ");
			}
		}while(!Valid.checkDouble(this.runwaySize));
		do {
			System.out.println("Input max fixedwing parking place: "); maxFixedwingParkingPlace = sc.next();
			if(!Valid.checkDouble(this.maxFixedwingParkingPlace)) {
				System.out.println("Input error max fixedwing parking place.Rewrite!! ");
			}
		}while(!Valid.checkDouble(this.maxFixedwingParkingPlace));
		do {
			System.out.println("Input max rotatedwing parking place: "); maxRotatedwingParkingPlace = sc.next();
			if(!Valid.checkDouble(this.maxRotatedwingParkingPlace)) {
				System.out.println("Input error max rotatedwing parking place.Rewrite!! ");
			}
		}while(!Valid.checkDouble(this.maxRotatedwingParkingPlace));
		
	}
	@Override
	public String toString() {
		return "Airplance [ID=" + ID + ", name=" + name + ", runwaySize=" + runwaySize + ", maxFixedwingParkingPlace="
				+ maxFixedwingParkingPlace + ", maxRotatedwingParkingPlace=" + maxRotatedwingParkingPlace
				+ ", listOfFixedwingAirplaneID=" + listOfFixedwingAirplaneID + ", listOfHelicopterID="
				+ listOfHelicopterID + "]";
	}
	
	
}
