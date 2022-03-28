package exercise3;

import java.util.Scanner;

public class FrequentNumber {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int n,len=0,dem=0;
		char a=0;
		System.out.print("\nNhap do dai mang: ");
		n=sn.nextInt();
		int[] intArray = new int [n];
		do {
			
				System.out.print("\nNhap phan tu thu "+(len+1)+" : ");
				intArray[len]=sn.nextInt();
			
			if(len!=(n)&&a!='n'&&a!='N') {
				System.out.print("\nBan co muon nhap tiep khong? ");
				a=sn.next().charAt(0);
			}
			len++;
		}while(len!=(n)&&a!='n'&&a!='N');
		System.out.print("\nInput value: ");
		int value=sn.nextInt();
		for(int i=0;i<intArray.length;i++) {
			if(value==intArray[i]) {
				dem++;
			}
		}
		System.out.print("\nAmount of frequence: "+dem);
	}
}
