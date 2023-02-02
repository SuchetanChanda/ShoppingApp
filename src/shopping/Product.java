package shopping;

public class Product {
	static int genID=1;
	String nameString;
	String brandString;
	int quantity;
	double price;
	int prodId = genID;
	
	public Product(String nameString , String brandString , int quantiiy , double price) {
		// TODO Auto-generated constructor stub
		this.nameString = nameString;
		this.brandString = brandString;
		this.quantity = quantiiy;
		this.price = price;
		
		genID++;
	}
}
