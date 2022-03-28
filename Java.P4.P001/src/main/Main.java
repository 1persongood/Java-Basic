package main;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import entity.*;
import services.AirplanceService;
public class Main {

	private static List<Airplance> listNewAirplance;
	private static List<Airplance> listAirplance;
	
	public static void main(String[] args) {
		String status, airplanceId;
		Scanner sc = new Scanner(System.in);
		AirplanceService airplanceService = new AirplanceService();
		List<Airplance> airplanceById;
		int choise;
		
		do {
			System.out.println("=====================MENU======================");
			System.out.println("1. Input data");
			System.out.println("2. Display list of all Airplance information(sort by ID)");
			System.out.println("3. Display the status of one airport, selected by Airplance ID");
			System.out.println("4. Display list of all fixed wing airplanes with its parking Airplance ID and name");
			System.out.println("5. Display list of all helicopters with its parking Airplance ID and name");
			System.out.println("6. Delete one Airplance by id");
			System.out.println("7. Exit");
			System.out.println("Please enter your choise: ");
			choise = sc.nextInt();
			
			switch(choise) {
				case 1:
					if(listNewAirplance != null) {
						listNewAirplance.clear();
					}
					listNewAirplance = airplanceService.createAirport(sc);
					System.out.println("Input done!");
					
					try {
						if(listNewAirplance == null) {
							throw new Exception();
						}
						status = airplanceService.save(listNewAirplance);
						System.out.println("Save: "+status);
					}catch (Exception e) {
						System.out.println("Save fail");
					}
					break;
				case 2:
					if(listAirplance != null) {
						listAirplance.clear();
					}
					try {
						listAirplance = airplanceService.getAll();
						if(listAirplance == null) {
							throw new IOException();
						}
						airplanceService.Display(listAirplance);
					}catch (IOException e) {
						System.out.println("no data");
					}
					
					break;
				case 3:
					System.out.println("=============SEARCH============");
					try {
						System.out.println("Enter Airplance id: ");
						String idAirplance = sc.next();
						airplanceById = airplanceService.getByIdAirplance(idAirplance);
						
						if(airplanceById == null) {
							throw new IOException();
						}
						System.out.println("----Airplance----");
						for(Airplance airplance : airplanceById) {
							System.out.println(airplance.getID()+"\t" +airplance.getName()+"\t"+
									airplance.getRunwaySize()+"\t"+ airplance.getListOfFixedwingAirplaneID());
						}
					}catch (IOException e) {
						System.out.println("No data");
					}
					break;
				case 4:
					System.out.println("=============FIXEDWING==============");
					try {
						listAirplance = airplanceService.getFixedwing();
						if(listAirplance == null) {
							throw new IOException();
						}
						System.out.println("------------------------");
						for(Airplance airplance : listAirplance) {
							for(Fixedwing fixedwing : airplance.getListOfFixedwingAirplaneID()) {
								System.out.println(airplance.getID()+"\t"+airplance.getName()+"\t"+fixedwing.toString());
							}
						}
					}catch (IOException e) {
						System.out.println("no data");
					}
					break;
				case 5:
					System.out.println("=============HELICOPTER============");
					try {
						listAirplance = airplanceService.getHelicopter();
						if(listAirplance == null) {
							throw new IOException();
						}
						System.out.println("------------------------");
						for(Airplance airplance : listAirplance) {
							for(Helicopter helicopter : airplance.getListOfHelicopterID()) {
								System.out.println(airplance.getID()+"\t"+airplance.getName()+"\t"+helicopter.toString());
							}
						}
					}catch (IOException e) {
						System.out.println("no data");
					}
					break;
				case 6:
					System.out.println("Enter airport id to delete: ");  
					airplanceId = sc.next();  
	 
			 		try {  
			 			status = airplanceService.remove(airplanceId);  
			 			System.out.println("Remove: " + status);  
			 		} catch (Exception e) {  
			 			System.out.println("Remove Fail!");  
			 		}  
					break;
				default:
					System.exit(0);
					break;
			}
		}while(choise!=0);
		
		
	}
}
