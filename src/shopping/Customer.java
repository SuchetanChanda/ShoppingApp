package shopping;

public class Customer {
 String nameString ;
 String emailString;
 String phoneNoString;
 Cart cart;
 public Customer(String nameString , String emailString , String phoneNoString ) {
	// TODO Auto-generated constructor stub
	 this.nameString=nameString;
	 this.emailString=emailString;
	 this.phoneNoString=phoneNoString;
	 
	 this.cart = new Cart();
 }
 
 @SuppressWarnings("static-access")
public void addToCart(int prodID) {
	 cart.addProduct(prodID);
	 Inventory.removeProd(prodID);
}
}
