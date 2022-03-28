package Exercise4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		NumberList arr = new NumberList(n);
		SelectionSort arrS = new SelectionSort(n);
		InsertSort arrI = new InsertSort(n);
		QuickSort arrQ = new QuickSort(n);
		
		int[] array = new int[n];
		
		arr.input(array, n);
		arr.print(array, n);
		
		System.out.println("\nArray after use select sort: ");
		arrS.sort(array, n, 0);
		arrS.print(array, n);
		
		System.out.println("\nArray after use insert sort: ");
		arrI.sort(array, n, 0);
		arrI.print(array, n);
		
		System.out.println("\nArray after use qick sort: ");
		arrQ.sort(array, 0, n-1);
		arrQ.print(array, n);
	}
}
