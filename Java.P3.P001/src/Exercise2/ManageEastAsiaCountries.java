package Exercise2;

import java.util.Scanner;

public class ManageEastAsiaCountries {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		EastAsiaCountries[] country = new EastAsiaCountries[11];
		do {
			int lc;
			System.out.println("                     MENU                          ");
			System.out.println("===================================================");
			System.out.println("1. Input the information of 11 countries in East Asia");
			System.out.println("2. Display the information of country you've just input");
			System.out.println("3. Search the information of country by user-entered name");
			System.out.println("4. Display the information of countries sorted name in asceding order");
			System.out.println("5. Exit");
			System.out.println("===================================================");
			System.out.print("Please choise one option: ");
			lc = sn.nextInt();

			switch (lc) {
			case 1:
				try {
					addCountryInformation(country);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("ID \tName \t\tTotal Area \t\tTerrain");
				for (int i = 0; i < 2; i++) {
					country[i].display();
				}
				break;
			case 3:
				System.out.println("Enter the name you want to search for:");
				String name = sn.next();
				for (int i = 0; i < 2; i++) {
					if (country[i].countryName.equalsIgnoreCase(name)) {
						System.out.println("ID \tName \t\tTotal Area \t\tTerrain");
						country[i].display();
					}
				}
				break;
			case 4:
				for (int i = 0; i < 2; i++) {
					for (int j = i + 1; j < 2; j++) {
						if (country[i].getCountryName().compareTo(country[j].getCountryName()) > 0) {
							EastAsiaCountries temp = country[i];
							country[i] = country[j];
							country[j] = temp;
						}
					}
				}
				System.out.println("ID \tName \t\tTotal Area \t\tTerrain");
				for (int i = 0; i < 2; i++) {
					country[i].display();
				}
				break;
			case 5:
				break;
			default:
				break;
			}
		} while (true);
	}

	private static void addCountryInformation(EastAsiaCountries[] country) throws Exception {
		for (int i = 0; i < 2; i++) {
			System.out.println("Country " + (i + 1) + " :");
			country[i] = new EastAsiaCountries();
			country[i].Input();
		}
	}

	public static EastAsiaCountries getRecentlyEnteredInformation() throws Exception {
		return null;
	}
	public EastAsiaCountries[] searchInformationByName(String name) throws Exception{
		return null;

	}
	public EastAsiaCountries[]sortInformationByAscendingOrder() throws Exception{
		return null;

	}
}
