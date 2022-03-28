package Exercise3;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		Sedan sd= new Sedan(160, 20000, "Red", 10);
		Ford f1 = new Ford (150,4452.0,"Black",2005, 10); 
		Ford f2 = new Ford (140,5555.0,"Pink",1998, 5);
		Car c = new Car (555, 56856.0, "Red");
		System.out.println("Sedan Price: "+sd.getSalePrice());
		System.out.println("First ford Price: "+f1.getSalePrice());
		System.out.println("Second ford Price: "+f2.getSalePrice());
		System.out.println("Car Price: "+c.getSalePrice());
	}
}
