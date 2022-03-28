package Java.Test1.P003_PhuLC2;

public class Validator {
	public static boolean checkEmail(String email) {
		String chu = "^[A-Za-z0-9]{6,}$";
		boolean kt = email.matches(chu);
		if(kt!=true) {
			return false;
		}
		return true;
	}
	public static boolean checkGroup(String group) {
		
		if(group.equalsIgnoreCase("Family")||group.equalsIgnoreCase("Colleague")||group.equalsIgnoreCase("Friend")||group.equalsIgnoreCase("Other")) {
			return true;
		}
		return false;
	}
	
}
