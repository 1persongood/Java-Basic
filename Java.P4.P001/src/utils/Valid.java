package utils;

import java.util.HashSet;
import java.util.Set;

public class Valid {

	private static Set<String> ids = new HashSet<String>();
	public static boolean checkIDFixedwing(String id) {
		String chu = "^\\F\\W\\d{5}$";
		boolean kt = id.matches(chu);
		if(kt!=true) {
			return false;
		}
		return true;
	}
	public static boolean checkIDHelicopter(String id) {
		String chu = "^\\R\\W\\d{5}$";
		boolean kt = id.matches(chu);
		if(kt!=true) {
			return false;
		}
		return true;
	}
	public static boolean checkIDAirport(String id) {
		String chu = "^[A][P]\\d{5}$";
		boolean kt = id.matches(chu);
		if(kt!=true) {
			return false;
		}
		return true;
	}
	public static boolean checkModel(String model) {
		
		if(model==null) {
			return false;
		}
		if(model.length()>40) {
			return false;
		}
		return true;
	}
	public static boolean checkDouble(String d) {
		
		try {
			Double.parseDouble(d);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	public static boolean checkFixedwingAirplaneType(String planeType) {
		
		if(planeType=="CAG"||planeType=="LGR"||planeType=="PRV") {
			return false;
		}
		return true;
	}
	public static boolean checkMinRunwaySize(String minRunwaySize, String maxFixedwingParkingPlace) {
		
		if(Double.parseDouble(minRunwaySize)>Double.parseDouble(maxFixedwingParkingPlace)) {
			return false;
		}
		return true;
	}
	public static boolean checkHelicopters(String maxTakeoffWeight, String emptyWeight) {
		
		if(Double.parseDouble(maxTakeoffWeight)>(Double.parseDouble(emptyWeight)*1.5)) {
			return false;
		}
		return true;
	}
	public static boolean isExistsed(String id) {
		if(!ids.contains(id)) {
			ids.add(id);
			return true;
		}else {
			return false;
		}
	}
	public static Set<String> getIds(){
		return ids;
	}
}
