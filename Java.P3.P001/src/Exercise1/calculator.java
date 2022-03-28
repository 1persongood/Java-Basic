package Exercise1;

public class calculator {

	public double calculate(double a, String operator, double b) {
		double x = 0;
		if(operator.equalsIgnoreCase("+")) {
			x = a + b;
		}else if(operator.equalsIgnoreCase("-")) {
			x = a - b;
		}else if(operator.equalsIgnoreCase("*")) {
			x = a * b;
		}else if(operator.equalsIgnoreCase("/")) {
			try {
				x = a / b;
			} catch (Exception e) {
				System.out.println("Error "+e.getMessage());
			} 
		}else if(operator.equalsIgnoreCase("^")) {
			x = Math.pow(a, b);
		}
		return x;
	}
	public boolean checkOperator(String operator) {
		if(operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/")||operator.equals("^")){
			return true;
		}
		else {
			System.out.println("Please input (+, -, *, /, ^)");
			return false;
		}
	}
}
