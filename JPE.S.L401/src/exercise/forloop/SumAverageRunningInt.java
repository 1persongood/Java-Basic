package exercise.forloop;

import java.util.Iterator;

/**
 * 
 * @author PhuLC2
 *
 */
public class SumAverageRunningInt {
	public static void main(String[] args) {
		//Define variables
		int sum=0;//The accumulated sum, inti to 0
		double average; //average in double
		int lowerBound = 1;
		int upperBound=100;
		
		//Use a for-loop to sum from lowerbound to upperbound
		for(int number = lowerBound;number<=upperBound;++number) {
			sum+=number;
		}
		average=sum/upperBound;
		
		System.out.print("Average of all 100 first numbers:" +average);
	}
}
