package services;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entity.Helicopter;
import utils.Valid;

public class HelicopterService {

	public Set<Helicopter> createHelicopter(Scanner sc, int maxPlace){
		String loop ="";
		String id, model, speed, emptyWeight, maxWeight, runwaySize, range, flyMethod;
		Helicopter helicopter;
		int count = 0;
		boolean addStatus = false;
		
		Set<Helicopter> helicopters = new HashSet<Helicopter>();
		do {
			helicopter = new Helicopter();
			if(count<maxPlace) {
				System.out.println("Do you want continue to input the helicopter (Y/N)?:");
				loop = sc.next();
			}else {
				loop = "N";
			}
			
			if (loop.charAt(0) != 'Y' && loop.charAt(0) != 'y') {  
				Valid.getIds().clear();  
				break;
			}
			helicopter.input();
			addStatus = helicopters.add(helicopter);
			count++;
			if(!addStatus) {
				System.out.println("Fixedwing existed");
			}
			
		}while(loop.charAt(0) == 'Y' || loop.charAt(0) == 'y');
		return helicopters;
	}
}
