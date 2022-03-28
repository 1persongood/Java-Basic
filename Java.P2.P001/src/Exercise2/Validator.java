package Exercise2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {

	static Scanner sn=new Scanner(System.in);
	public static boolean checkPhone(String phone) {
		
		String chu = "^[a-zA-Z]$";
		String so="\\d{10}";
		boolean kt = phone.matches(chu);
		boolean kt1 = phone.matches(so);
		if(kt==true) {
			return false;
		}else if(kt1==false) {
			return false;
			}
		return true;
		
	}
	
	public static boolean checkEmail(String email) {
		String EMAIL_PATTERN = 
	            "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,})$";
		if(Pattern.matches(EMAIL_PATTERN, email)==false) {
			return false;
		}
		return true;
		
	
	}
	public static boolean checkDate(String date) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			formatter.parse(date);
		} catch (ParseException e) {
			return false;
		}
		
        return true;
		
	}
}
