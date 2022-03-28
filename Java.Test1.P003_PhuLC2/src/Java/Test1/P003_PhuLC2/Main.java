package Java.Test1.P003_PhuLC2;

import java.util.List;
import java.util.Scanner;

public class Main {
			private static List<PhoneBook> listPhoneBook;

			public static void main(String[] args) {
				String choise;
				Scanner sc = new Scanner(System.in);
				List<PhoneBook> phoneBookByName;
				PhoneBookManagement bookManagement = new PhoneBookManagement();
				do {
					System.out.println("===========MENU=============");
			System.out
					.println("1. Add a new list of phone book\r\n" + "2. Add a new phone number to existed contact\r\n"
							+ "3. Display all contacts in the phone book, sort by name\r\n"
							+ "4. Find phone number list by name\r\n" + "5. Delete contact by name\r\n"
							+ "6. Delete contact by group\r\n" + "7. Close program\r\n" + "");
			System.out.println("Select: ");
			choise = sc.next();
			switch (choise) {
			case "1":
				bookManagement.inputData();
				try {
					bookManagement.save(listPhoneBook);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case "2":
				break;
			case "3":
				bookManagement.Display();
				break;
			case "4":
				System.out.println("--------- Find phone number list by name ------");
				try {
					System.out.println("Enter name: ");
					String nameSearch = sc.next();
					phoneBookByName = bookManagement.findByName(nameSearch);
					//if()
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
			case "5":
				System.out.println("--------- Delete contact by name ------");
				try {
					System.out.println("Enter name: ");
					String nameSearch = sc.next();
					phoneBookByName = bookManagement.delete(nameSearch);
					//if()
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
			case "6":
				System.out.println("--------- Delete contact by group ------");
				try {
					System.out.println("Enter group: ");
					String groupSearch = sc.next();
					System.out.println(bookManagement.deleteByGroup(groupSearch));
					//if()
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
			case "7":
				break;
			default:
				break;
			}
		} while (true);
		
	}
}

