package Exercise4;

import java.util.Scanner;

public class NumberList {

	Scanner sc = new Scanner(System.in);
	public NumberList(int n) {
		
	}

	
	public void input(int[] numberList, int n) {
		System.out.println("Enter number list: ");
		for(int i=0;i<n;i++) {
			numberList[i] = sc.nextInt();
		}
	}
	
	public void print(int[] numberList, int n) {
		System.out.println("Number list: ");
		for(int i =0;i<n;i++) {
			System.out.print(numberList[i]+" ");
		}
	}
}
