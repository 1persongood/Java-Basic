package Exercise1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int lc;
		System.out.println("===============Calculator Program===============");
		System.out.println("1. Normal Calculator");
		System.out.println("2. BMI Calculator");
		System.out.println("3. Exit");
		System.out.print("Please choise one option: ");
		lc = sn.nextInt();
		switch (lc) {
		case 2:
			String weight, height;
			BMI bmi = new BMI();
			System.out.println("-----------BMI Calculator----------");
			do {
				System.out.print("Enter Weight(kg): ");
				weight = sn.next();
				if (bmi.checkIn(weight) == null) {
					System.out.println("BMI is degit");
				}
			} while (bmi.checkIn(weight) == null);
			do {
				System.out.print("Enter Height(cm): ");
				height = sn.next();
				if (bmi.checkIn(height) == null) {
					System.out.println("BMI is degit");
				}
			} while (bmi.checkIn(height) == null);
			double weightx = Double.parseDouble(weight);
			double heightx = Double.parseDouble(height);
			bmi.calculateBMI(weightx, heightx);
			break;
		case 1:
			double a = 0, b = 0, x = 0;
			calculator cal = new calculator();
			System.out.println("-----------Normal Calculator----------");
			try {
				System.out.print("Enter number: ");
				a = sn.nextDouble();
			} catch (Exception e) {
				System.out.println("Please input number !");
			} 
			String op;
			do {
				do {
					System.out.print("Enter Operator: ");
					op = sn.next();
				} while (!cal.checkOperator(op));

				if (op.equalsIgnoreCase("=")) {
					break;
				}
				try {
					System.out.println("Enter number: ");
					b = sn.nextDouble();
				} catch (Exception e) {
					System.out.println("Please input number !");
				}

				x = cal.calculate(a, op, b);
				System.out.print("Memory: " + x);
				System.out.println();
				a = x;
			} while (!op.equalsIgnoreCase("="));
			System.out.println("Result: " + x);
			break;
		default:
			break;
		}
	}
}
