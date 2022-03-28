package exercise4;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		int n, i;
		Scanner sn = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu mang: ");
		n=sn.nextInt();
		int[] intArray = new int[n];
		for(i=0;i<intArray.length;i++) {
			System.out.print("\nNhap phan tu thu "+(i+1)+" : ");
			intArray[i]=sn.nextInt();
		}
		System.out.print("\nMang sau khi nhap: ");
		for(i=0;i<intArray.length;i++) {
			System.out.print(intArray[i]+"\t");
		}
		
		int j = intArray.length - 1;
		for (i = 0; i < j; i++){
            int temp = intArray[i];
            intArray[i]  = intArray[j];
            intArray[j] = temp;
            j--;
        }
		
		System.out.print("\nMang sau khi dao: ");
		for(i=0;i<intArray.length;i++) {
			System.out.print(intArray[i]+"\t");
		}
	}
}
