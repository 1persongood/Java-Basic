package Java.Test1.P003_PhuLC2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PhoneBookManagement {
	public static final String FILE_PATH = "C:\\Users\\Admin\\Documents\\trainning java\\Java.Test1.P003_PhuLC2/phonebook.txt";  
	public static final String SUCCESS = "success";
	public static final String FAIL = "fail";
	private List<PhoneBook> listOfPhoneBook =new ArrayList<PhoneBook>();
	public void inputData() {
		PhoneBook pb = new PhoneBook();
		Scanner sn = new Scanner(System.in);
		System.out.println("Input name: ");
		pb.setName(sn.nextLine());
		System.out.println("Input phone number list: ");
		pb.setPhoneNumberList(sn.nextLine());
		do {
		System.out.println("Input email: ");
		pb.setEmail(sn.nextLine());
		if(!Validator.checkEmail(pb.getEmail())) {
			System.out.println("Input email error.Rewrite!!! ");
		}
		}while(!Validator.checkEmail(pb.getEmail()));
		System.out.println("Input  address: ");
		pb.setAddress(sn.nextLine());
		do {
		System.out.println("Input group: ");
		pb.setGroup(sn.nextLine());
		if(!Validator.checkGroup(pb.getGroup())) {
			System.out.println("Input group error.Rewrite: Family, Colleague, Friend, Other!!! ");
		}
		}while(!Validator.checkGroup(pb.getGroup()));
		listOfPhoneBook.add(pb);
	}
	public String save(List<PhoneBook> listOfPhoneBook) throws Exception {  
		
		ObjectOutputStream objectOutputStream = null;  
		try {  
	 		objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));  
	  		objectOutputStream.writeObject(listOfPhoneBook);  
		} catch (Exception exception) {  
	  		throw new Exception();  
		} finally {  
	  		if (objectOutputStream != null) {  
	    		objectOutputStream.close();  
	      	}  
	    }  
	    return SUCCESS;  
	}
	@SuppressWarnings("unchecked")  
	public List<PhoneBook> findAll() throws IOException {  
		ObjectInputStream objectInputStream = null;  
	    List<PhoneBook> listOfPhoneBook;  
	    try {  
	      	objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));  
	      	listOfPhoneBook = (List<PhoneBook>) objectInputStream.readObject(); 
	      	listOfPhoneBook.clear();
	    } catch (Exception exception) {  
	      	throw new IOException();  
	    } finally {  
	      	if (objectInputStream != null) {  
	        	objectInputStream.close();  
	      	}  
	    }  
	    return listOfPhoneBook;  
	}
	public void Display() {   
	  
	    System.out.println("---------------LIST-------------------");  
	  
	    for (PhoneBook pb : listOfPhoneBook) {  
	      	System.out.println(pb.toString());  
	    }  
	} 
	public List<PhoneBook> findByName(String name) throws IOException {  
	    List<PhoneBook> listOfPhoneBook = findAll();  
	    List<PhoneBook> listOfPhoneBookFindByName = new ArrayList<PhoneBook>();  
	    
	    if (listOfPhoneBook != null) {  
	      	for (PhoneBook pb : listOfPhoneBook) {  
	      		//for (pb.getPhoneNumberList() studentCourse : pb) {  
	          		if (name.equalsIgnoreCase(pb.getName())) {  
	          			listOfPhoneBookFindByName.add(pb);  
	          		}  
	      		//}
	    	}  
		}  
	    return listOfPhoneBookFindByName;  
	} 
	
	public void add(String phone){

		
	 }
	 public List<PhoneBook> delete(String name) throws IOException{

		 List<PhoneBook> listOfPhoneBook = findAll();
		 if (listOfPhoneBook != null) {  
		      	for (PhoneBook pb : listOfPhoneBook) {  
		      		//for (pb.getPhoneNumberList() studentCourse : pb) {  
		          		if (name.equalsIgnoreCase(pb.getName())) {  
		          			listOfPhoneBook.remove(pb);  
		          		}  
		      		//}
		    	}  
			}
		return listOfPhoneBook; 
	 }
	
	
	public String deleteByGroup(String group) throws Exception {  
	    boolean removed = false;  
	  
	    List<PhoneBook> listOfPhoneBook = findAll();  
	    if (listOfPhoneBook == null) {  
	      	throw new IOException();  
	    }  
	    Iterator<PhoneBook> iterator = listOfPhoneBook.iterator();  
	    while (iterator.hasNext()) {  
	    	PhoneBook course = iterator.next();  
	      	if (group.equalsIgnoreCase(course.getGroup())) {  
	        	iterator.remove();  
	        	removed = true;  
	        	break;  
	      	}  
	    }  
	  
	    if (removed) {  
	      	try {  
	        	// update list  
	        	save(listOfPhoneBook);  
	      	} catch (Exception e) {  
	        	throw new Exception();  
	      	}  
	        
	      	return SUCCESS;  
	    }  
	    return FAIL;  
	}
	
}
