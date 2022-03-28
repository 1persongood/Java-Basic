package services;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import entity.*;
import utils.InvalidIdException;

public class AirplanceService {

	public static final int EXIT = 3;
	public List<Airplance> createAirport(Scanner sc){
		
		String loop ,loop2;
		int ch;
		double size =0;
		
		Airplance airplance;
		Set<Fixedwing> fixedwings = new HashSet<Fixedwing>();
		Set<Helicopter> helicopters = new HashSet<Helicopter>();
		List<Airplance> airplances = new ArrayList<Airplance>();
		FixedwingService fixedwingService = new FixedwingService();
		HelicopterService helicopterService = new HelicopterService();
		
		do {
			airplance = new Airplance();
			airplance.input();
			
			System.out.println("---------Fixedwing------------");
			fixedwings = fixedwingService.createFixedwing(sc,Double.parseDouble(airplance.getRunwaySize()), Integer.parseInt(airplance.getMaxFixedwingParkingPlace()));
			airplance.setListOfFixedwingAirplaneID(fixedwings);
			
			System.out.println("----------Helicopter-----------");
			helicopters = helicopterService.createHelicopter(sc,Integer.parseInt(airplance.getMaxRotatedwingParkingPlace()));
			airplance.setListOfHelicopterID(helicopters);
			airplances.add(airplance);
	
			System.out.println("Do you want continue to input the airport (Y/N)?:");
			loop = sc.next();
			
		}while(loop.charAt(0) == 'Y' || loop.charAt(0) == 'y');
		return airplances;
	}
	
	public String save(List<Airplance> airplances) throws Exception{
		ObjectOutputStream objectOutputStream = null;
		try {
			objectOutputStream = new ObjectOutputStream(new FileOutputStream("airport.dat"));
			objectOutputStream.writeObject(airplances);
		}catch (Exception e) {
			throw new Exception();
		}finally {
			if(objectOutputStream != null) {
				objectOutputStream.close();
			}
		}
		return "SUCCESS";
	}
	
	@SuppressWarnings("unchecked") 
	public List<Airplance> getAll( ) throws IOException{
		ObjectInputStream objectInputStream = null;
		List<Airplance> airports;
		try {
			objectInputStream = new ObjectInputStream(new FileInputStream("airport.dat"));
			airports = (List<Airplance>) objectInputStream.readObject();
		}catch (Exception e) {
			throw new IOException();
		}finally {
			if(objectInputStream != null) {
				objectInputStream.close();
			}
		}
		return airports;
	}
	
	public void Display(List<Airplance> airplances) {
		Collections.sort(airplances, new AirplanceIdCompare());
		System.out.println("--------------AIRPORT LIST---------------");
		for(Airplance airplance : airplances) {
			System.out.format("%s%10s%10.2f%100s%100s%n",airplance.getID(), airplance.getName(), airplance.getRunwaySize(), airplance.getListOfFixedwingAirplaneID(), airplance.getListOfHelicopterID());
					
		}
	}
	
	public List<Airplance> getByIdAirplance(String airplanceID) throws IOException{
		List<Airplance> airplances = getAll();
		List<Airplance> airplancesByID = new ArrayList<Airplance>();
		
		if(airplances !=null) {
			for(Airplance airplance : airplances) {
				if(airplanceID.equalsIgnoreCase(airplance.getID())) {
					airplancesByID.add(airplance);
				}
			}
		}
		return airplancesByID;
	}
	
	public List<Airplance> getFixedwing() throws IOException{
		List<Airplance> airplances = getAll();
		List<Airplance> airplancesByFixedwing = new ArrayList<Airplance>();
		
		if(airplances !=null) {
			for(Airplance airplance : airplances) {
				if(airplance.getListOfFixedwingAirplaneID()!=null) {
					airplancesByFixedwing.add(airplance);
				}
			}
		}
		return airplancesByFixedwing;
	}
	
	public List<Airplance> getHelicopter() throws IOException{
		List<Airplance> airplances = getAll();
		List<Airplance> airplancesByHelicopter = new ArrayList<Airplance>();
		
		if(airplances !=null) {
			for(Airplance airplance : airplances) {
				if(airplance.getListOfHelicopterID()!=null) {
					airplancesByHelicopter.add(airplance);
				}
			}
		}
		return airplancesByHelicopter;
	}
	
	public String remove(String id) throws Exception {  
		boolean removed = false;  
		
		List<Airplance> airplances = getAll();  
		if (airplances == null) {  
			throw new IOException();  
		}  
		Iterator<Airplance> iterator = airplances.iterator();  
		while (iterator.hasNext()) {  
			Airplance airplance = iterator.next();  
			if (id.equalsIgnoreCase(airplance.getID())) {  
				iterator.remove();  
				removed = true;  
				break;  
			}  
		}  
		
		if (removed) {  
			try {  
				save(airplances);  
			} catch (Exception e) {  
				throw new Exception();  
			}  
		
			return "SUCCESS";  
		}  
		return "FAIL";  
	}
}
