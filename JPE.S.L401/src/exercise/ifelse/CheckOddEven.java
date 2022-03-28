package exercise.ifelse;

import java.util.Scanner;

/**
 * 
 * @author PhuLC2
 *
 */
public class CheckOddEven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter value of number: ");
		int number=scanner.nextInt();
		
		System.out.println("The number is: "+number);
		
		if(number %2==0) {
			System.out.println("Even Number"); // even number
		}else {
			System.out.println("Odd Number"); // odd number
		}
		System.out.println("---------------");
		System.out.println("BYE");
	}
}
