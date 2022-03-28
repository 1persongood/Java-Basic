package Exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DepartmentManage {

	public static void main(String[] args) {
		SalariedEmployee se = new SalariedEmployee();
		HourlyEmployee he = new HourlyEmployee();
		Department department = new Department();
	
		List<Department> listOfEmplyee = new ArrayList();

		Scanner sc = new Scanner(System.in);
		int n,m, choose;
		do {
			System.out.println("--------------MENU--------------");
			System.out.println("1.Input data");
			System.out.println("2.Display employees");
			System.out.println("3.Classify employees");
			System.out.println("4.Employee search");
			System.out.println("5.Report");
			System.out.println("6.Exit");
			
			System.out.print("Enter your choise: ");
			choose = sc.nextInt();
			
			switch(choose) {
				case 1:
					String departmentName;
					System.out.print("Enter employee number: ");
					n = sc.nextInt();
					for(int i=0;i<n;i++) {
						System.out.println("1.Salaried Employee");
						System.out.println("2.Hourly Employee");
						System.out.print("\tEnter type of Employee:");
						m = sc.nextInt();
						if(m==1) {
							se.input();
							System.out.print("\nEnter department name: ");
							departmentName = sc.next();
							department = new Department(departmentName,se);
							listOfEmplyee.add(department);
						}else {
							he.input();
							System.out.print("\nEnter department name: ");
							departmentName = sc.next();
							department = new Department(departmentName,he);
							listOfEmplyee.add(department);
						}
					}
					break;
				case 2:
					System.out.println(listOfEmplyee);
					break;
				case 3:
					Classify(listOfEmplyee);
					break;
				case 4:
					int ch;
					System.out.println("1. Search by department name");
					System.out.println("2. Search by employee name");
					System.out.print("\n\tEnter your choise");
					ch =sc.nextInt();
					switch(ch) {
						case 1:
							String a;
							int count=0;
							List<Department> list = new ArrayList();
							System.out.print("\nEnter department name do you want to search: ");
							a = sc.next();
							for(int i=0; i<listOfEmplyee.size();i++) {
								if( listOfEmplyee.get(i).getDepartmentName().equals(a)) {
									list.add(listOfEmplyee.get(i));
									count ++;
								}
							}
							Classify(list);
							if(count==0) {
								System.out.println("Not exists");
							}
							break;
						case 2:
							String b;
							int count2 =0;
							List<Department> list2 = new ArrayList();
							System.out.print("\nEnter employee name do you want to search: ");
							b = sc.next();
							for(int i=0; i<listOfEmplyee.size();i++) {
								if(listOfEmplyee.get(i).getSalaried()!=null) {
									if( listOfEmplyee.get(i).getSalaried().getFirstName().equalsIgnoreCase(b)) {
										System.out.println(listOfEmplyee.get(i));
										count2++;
									}
								}else if(listOfEmplyee.get(i).getHourly()!=null) {
									if( listOfEmplyee.get(i).getHourly().getFirstName().equalsIgnoreCase(b)) {
										System.out.println(listOfEmplyee.get(i));
										count2++;
									}
								}
								
							}
							
							if(count2==0) {
								System.out.println("Not exists");
							}
							break;
						default:
							break;
					}
					break;
				case 5:
					List list3 = new ArrayList();
					System.out.println("Deparment:");
					for(int i=0;i<listOfEmplyee.size();i++) {
						list3.add(listOfEmplyee.get(i).getDepartmentName());
					}
					Map<String, Long> couterMap = (Map<String, Long>) list3.stream().collect(Collectors.groupingBy(e -> e.toString(),Collectors.counting()));
					System.out.println(couterMap);
					break;
				default:
					break;
		}
		
		}while(choose!=0);
		
	}
	public static void Classify(List<Department> d ) {
		System.out.println("Salaried Employee: ");
		for(int i=0; i<d.size();i++) {
			if( d.get(i).getSalaried()!=null) {
				System.out.println("\t"+d.get(i));
			}else {
				
			}
		}
		System.out.println("Hourly Employee: ");
		for(int i=0; i<d.size();i++) {
			if( d.get(i).getHourly()!=null) {
				System.out.println("\t"+d.get(i));
			}else {
				
			}
		}
	}
	
}
