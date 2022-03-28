package exercise.forloop;
/**
 * 
 * @author PhuLC2
 *Write a program called HarmonicSum to compute the sum of a harmonic series,
 * as shown below, where n=50000. The program shall compute the sum from
 * left-to-right as well as from the right-to-left.
 * Are the two sums the same?
 * Obtain the absolute difference between these two sums and explain the difference.
 * Which sum is more accurate?.
 * 
 * Harmonic(n) = 1+1/2+1/3+...+1/n
 */
public class HarmonicSum {
	public static void main(String[] args) {
		int n=50000;
		double sumL2R=printLeftToRightSum(n);
		double sumR2L=printRightToLeftSum(n);
		System.out.printf("Diference: %.15f",(sumL2R-sumR2L));
		System.out.println();
	}
	/**
	 * left-to-right Harmonic Sum
	 * 
	 * @param int n
	 */
	private static double printLeftToRightSum(int n) {
		double sum=0.0;
		for(int i=1;i<=n;i++) {
			sum+=(double)1/i;
		}
		System.out.printf("Left-to-right Harmonic Sum %.15f", sum);
		System.out.println();
		
		return sum;
	}
	
	/**
	 * right-to-left Harmonic Sum
	 * 
	 * @param int n
	 * @return
	 */
	private static double printRightToLeftSum(int n) {
		double sum=0.0;
		for(int i=n;i>=1;i--) {
			sum+=(double)1/i;
		}
		System.out.printf("Right-to-left Harmonic Sum %.15f", sum);
		System.out.println();
		
		return sum;
	}
}
