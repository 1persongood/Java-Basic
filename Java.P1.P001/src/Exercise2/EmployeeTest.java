package Exercise2;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee phong=new Employee("Pham", "Phong", 100000000);
		Employee phuong=new Employee("Viet", "Phuong", 100000000);
		System.out.println(phong.getFirstName()+" "+phong.getLastName()+"'s monthly salary: "+phong.getMonthlySalary());
		System.out.println(phuong.getFirstName()+" "+phuong.getLastName()+"'s monthly salary: "+phuong.getMonthlySalary());
		System.out.println();
		System.out.println("Each Employee’s yearly salary after 10% boost");
		System.out.println(phong.getFirstName()+" "+phong.getLastName()+"'s monthly salary: "+phong.getMonthlySalary()*1.1*12);
		System.out.println(phuong.getFirstName()+" "+phuong.getLastName()+"'s monthly salary: "+phuong.getMonthlySalary()*1.1*12);
		
	}
}
