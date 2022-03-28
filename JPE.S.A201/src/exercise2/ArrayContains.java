package exercise2;


import java.util.Scanner;

public class ArrayContains {
	public static void main(String[] args) {
		int n;
		Scanner sn = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu mang: ");
		n=sn.nextInt();
		String[] stringArray = new String[n];
		for(int i=0;i<stringArray.length;i++) {
			System.out.print("\nNhap phan tu thu "+(i+1)+" : ");
			stringArray[i]=sn.next();
		}
		System.out.print("Input sValue: ");
		String sValue=sn.next();
		int dem=0;
		for(int i=0;i<stringArray.length;i++) {
			if(stringArray[i].equals(sValue)) {
				dem++;
			}
		}
		if(dem>0) {
			System.out.print("\nCheck "+sValue+" in Array: Contained!");
		}else {
			System.out.print("\nCheck "+sValue+" in Array: No Contain!");
		}
		
	}
}
