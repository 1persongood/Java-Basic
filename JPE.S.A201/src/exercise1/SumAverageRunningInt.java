package exercise1;

public class SumAverageRunningInt {
	public static void main(String[] args) {
		int a=1,b=100;
		int tong=0, tb=0;
		for(;a<=b;a++) {
			tong=tong+a;
		}
		tb=tong/b;
		System.out.print("sum = "+tong);
		System.out.print("\naverage = "+tb);
	}
}
