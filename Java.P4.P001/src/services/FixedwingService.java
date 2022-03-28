package services;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entity.Fixedwing;
import utils.Valid;

public class FixedwingService {

	public Set<Fixedwing> createFixedwing(Scanner sc, double maxSize, int maxPlace){
		String loop ="";
		String id, model, type, speed, emptyWeight, maxWeight, runwaySize, flyMethod;
		Fixedwing fixedwing;
		boolean addStatus = false;
		int count = 0;
		
		Set<Fixedwing> fixedwings = new HashSet<Fixedwing>();
		do {
			if(count<maxPlace) {
				System.out.println("Do you want continue to input the fixedwing (Y/N)?:");
				loop = sc.next();
			}else {
				loop = "N";
			}
			
			if (loop.charAt(0) != 'Y' && loop.charAt(0) != 'y') {  
				Valid.getIds().clear(); 
				break;
			}
			fixedwing = new Fixedwing();
			fixedwing.input();
			addStatus = fixedwings.add(fixedwing);
			count++;
			if(!addStatus) {
				System.out.println("Fixedwing existed");
			}
			
		}while(loop.charAt(0) == 'Y' || loop.charAt(0) == 'y');
		return fixedwings;
	}
}
