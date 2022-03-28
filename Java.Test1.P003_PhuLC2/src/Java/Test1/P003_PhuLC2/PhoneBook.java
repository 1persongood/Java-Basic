package Java.Test1.P003_PhuLC2;

import java.util.Scanner;

public class PhoneBook {

	private String name;
	private String phoneNumberList;
	private String email;
	private String address;
	private String group;
	public PhoneBook(String name, String phoneNumberList, String email, String address, String group) {
		
		this.name = name;
		this.phoneNumberList = phoneNumberList;
		this.email = email;
		this.address = address;
		this.group = group;
	}
	public PhoneBook() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumberList() {
		return phoneNumberList;
	}
	public void setPhoneNumberList(String phoneNumberList) {
		this.phoneNumberList = phoneNumberList;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	@Override
	public String toString() {
		return "PhoneBook [name=" + name + ", phoneNumberList=" + phoneNumberList + ", email=" + email + ", address="
				+ address + ", group=" + group + "]";
	}
	
}
