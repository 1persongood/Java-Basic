package exercise.whileLoop;
/**
 * 
 * @author PhuLC2
 *Write a program called Fibonacci to print the first 20 Fibonacci numbers F(n),
 *where F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average.
 *The output shall look like:
 *The first 20 Fibonacci numbers are:
 *1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765The average is 885.5
 */
public class Fibonacci {
 public static void main(String[] args) {
	int n=1;
	int fnMinus1=1; //F(n-1), init to F(2)
	int fnMinus2=1; //F(n-2), init to F(1)
	int nMax=20; //maximum n, inclusive
	int sum=fnMinus1+fnMinus2; //Need sum to compute average
	double average;
	
	System.out.println("The first "+nMax+" Fibonacci numbers are: ");
	
	while(n<=nMax) {
		System.out.print(fnMinus1+" ");
		//Compute F(n), print it and add to sum
		//Increment the index n and shift the numbers for the next iteration
		
		sum = fnMinus1+fnMinus2;
		fnMinus1=fnMinus2;
		fnMinus2=sum;
		
		++n;
	}
	
	//Compute and display the average (=sum/average)
	average=sum/nMax;
	//Beware that int/int gives int
	System.out.println("\n The average is "+average);
}
}
