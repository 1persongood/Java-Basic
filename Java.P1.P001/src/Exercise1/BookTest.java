package Exercise1;
import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         Book [] book = new Book[30];
         System.out.printf("Enter the books data:\n");
         int n=scan.nextInt();
         for(int i=0; i<n; i++){
             System.out.printf("Book %d\n", (i+1));
             String name;
             int ISBN_number; 
             String author; 
             String publisher;
             
             System.out.printf("Enter the book name: \n");
             name = scan.next();
             
             System.out.printf("Enter the book ISBN Number: \n");
             ISBN_number = scan.nextInt();
             
             System.out.printf("Enter the book Author name: \n");
             author = scan.next();
             
             System.out.printf("Enter the book Publisher: \n");
             publisher = scan.next();
             book[i] = new Book(name,ISBN_number,author,publisher );
             
         }
         
         for(int i=0; i<n; i++){
             System.out.printf("\n\nBook %d\n", (i+1));
             book[i].getBookInfo();
         }
	}
}
class Book {

	private String bookName;
	private int ISBN;
	private String authorName;
	private String publisher;
	public Book() {
		
	}
	public Book(String bookName, int ISBN, String authorName, String publisher) {
		this.bookName=bookName;
		this.ISBN=ISBN;
		this.authorName=authorName;
		this.publisher=publisher;
	}
	public void getBookInfo() {
		System.out.println("Book name: "+bookName);
		System.out.println("ISBN: "+ISBN);
		System.out.println("Author name: "+authorName);
		System.out.println("Publisher: "+publisher);
	}
}




