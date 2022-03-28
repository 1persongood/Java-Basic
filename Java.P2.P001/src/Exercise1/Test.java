package Exercise1;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Test {

	static Scanner sn=new Scanner(System.in);
	public static String checkPhone(String phone) {
		
		String chu = "^[a-zA-Z]$";
		String so="\\d{10}";
		boolean kt = phone.matches(chu);
		boolean kt1 = phone.matches(so);
		if(kt==true) {
			System.out.println("Phone number must is number");
		}else if(kt1==false) {
			System.out.println("Phone number must be 10 digits");
		}
		return phone;
		
	}
	
	public static String checkEmail(String email) {
		String EMAIL_PATTERN = 
	            "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,})$";
		if(Pattern.matches(EMAIL_PATTERN, email)==false) {
			System.out.println("Email must is correct format");
		}
		return email;
		
	
	}
	public static String checkDate(String date) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			formatter.parse(date);
		} catch (ParseException e) {
			System.out.println("Date to correct format(dd/mm/yyyy)");
		}
		
        return date;
		
	}
	public static void main(String[] args) {
		String email, date, phone;
		int lc,dem=0,dem1=0,dem2=0;
		do {
			
			
			System.out.println("=========Validate Progaram========");
			System.out.println("1. Input the Phone number");
			System.out.println("2. Input the email");
			System.out.println("3. Input the date");
			System.out.println("4. Exit");
			System.out.println("===================================================");
			System.out.print("Please choise one option: ");
			lc = sn.nextInt();

			switch (lc) {
			case 1:
			{
				do {
					System.out.println("Phone number: ");
					phone=sn.next();
					checkPhone(phone);
					//System.out.println(checkPhone(phone));
					if(checkPhone(phone)==phone) {
						dem++;
						
					}
				}while(dem==1);
			}
				break;
			case 2:
			{
				do {
					System.out.println("Email: ");
					email=sn.next();
					checkEmail(email);
					if(checkEmail(email)==email) {
						dem1++;
						
					}
				}while(dem1==1);
				
			}
				break;
			case 3:
			{
				do {
					System.out.println("Date: ");
					date=sn.next();
					checkDate(date);
					if(checkDate(date)==date) {
						dem2++;
						
					}
				}while(dem2==1);
				
			}
				break;
			case 4:
				break;
			default:
				break;
			}
		} while (lc!=4);
	}
}
