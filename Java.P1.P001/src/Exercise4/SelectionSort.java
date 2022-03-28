package Exercise4;

import java.util.Scanner;

public class SelectionSort extends NumberList implements Sort{

	public SelectionSort(int n) {
		super(n);
	}

	@Override
	public void sort(int[] numberList, int n, int m) {
		for(int i=0;i<n-1;i++) {
			int min_index = i;
			for(int j=i+1;j<n;j++) {
				if(numberList[j]<numberList[min_index]) {
					min_index = j;
				}
				
			}
			int temp = numberList[min_index];
			numberList[min_index] = numberList[i];
			numberList[i] = temp;
		}
		
	}
	

}
