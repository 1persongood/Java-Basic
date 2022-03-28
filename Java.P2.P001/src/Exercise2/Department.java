package Exercise2;

import java.util.List;

public class Department {

	private String departmentName;
	private HourlyEmployee hourly;
	private SalariedEmployee salaried;
	public Department() {
		
	}
	public Department(String departmentName, HourlyEmployee hourly) {
		this.departmentName = departmentName;
		this.hourly = hourly;
	}
	public Department(String departmentName, SalariedEmployee salaried) {
		this.departmentName = departmentName;
		this.salaried = salaried;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public HourlyEmployee getHourly() {
		return hourly;
	}
	public void setHourly(HourlyEmployee hourly) {
		this.hourly = hourly;
	}
	public SalariedEmployee getSalaried() {
		return salaried;
	}
	public void setSalaried(SalariedEmployee salaried) {
		this.salaried = salaried;
	}
	@Override
	public String toString() {
		if(salaried!=null) {
			return salaried.toString()+"Department [departmentName=" + departmentName + "]]\n";
		}else {
			return hourly.toString()+"Department [departmentName=" + departmentName + "]]\n";
		}
	}
	public void display() {
		if(salaried!=null) {
			salaried.display();
		}else {
			hourly.display();
		}
		System.out.println("Department Name: " + departmentName);
	}
	
}
