package entity;

import java.util.Comparator;

public class AirplanceIdCompare implements Comparator<Airplance>{

	@Override
	public int compare(Airplance o1, Airplance o2) {
		return o1.getID().compareToIgnoreCase(o2.getID());
		
	}

}
