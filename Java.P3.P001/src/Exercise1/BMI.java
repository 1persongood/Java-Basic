package Exercise1;

public class BMI {

	public void calculateBMI(double weight, double height) {
		double x = weight / ((height / 100) * (height / 100));
		int Enum = 0;
		if (x < 19) {
			Enum = 1;
		} else if (x >= 19 && x < 25) {
			Enum = 2;
		} else if (x >= 25 && x < 30) {
			Enum = 3;
		} else if (x >= 30 && x < 40) {
			Enum = 4;
		} else if (x >= 40) {
			Enum = 5;
		}
		System.out.printf("BMI Number: %.2f", x);
		switch (Enum) {
		case 1:
			System.out.println("BMI Status: SUBSTANDARD");
			break;
		case 2:
			System.out.println("BMI Status: STANDARD");
			break;
		case 3:
			System.out.println("BMI Status: OVERWEIGHT");
			break;
		case 4:
			System.out.println("BMI Status: Fat - should lose weight");
			break;
		case 5:
			System.out.println("BMI Status: Very fat - need to lose weight immediately");
			break;
		default:
			break;
		}
	}
	public Double checkIn(String inputVal) {
		boolean isNum = false;
		isNum = inputVal.matches("[0-9]+[\\.]?[0-9]*");
		if (isNum) {
			return Double.parseDouble(inputVal);
		} else {
			return null;
		}
	}
}
