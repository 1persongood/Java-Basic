package exercise.ifelse;
/**
 * 
 * @author PhuLC2
 */


import java.util.Scanner;

public class CheckPassFail {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter value of number: ");
		int mark=scanner.nextInt();
		
		System.out.println("The mark is: "+mark);
		
		//if-else statement
		if(mark >=50) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		System.out.println("---------------");
		System.out.println("CHECK DONE");
	}
}
