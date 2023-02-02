package shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	
		
		//Product Creation:
		Product p1 = new Product("Redmi Note 10 pro" , "Redmi" , 20 , 18000);
		Product p2 = new Product("Realme buds wireless","Realme", 40,1999);
		Product p3 = new Product("Winter Jacket", "Quecha", 15, 999);
		Product p4 = new Product("Wrist watch", "Fastrack", 24,1850);
		Product p5 = new Product("Wired Headphone", "Redgear",45 , 899);
		
//		List<Product> products = new ArrayList<Product>();
//		
//		products.add(p1);
//		products.add(p2);
//		products.add(p3);
//		products.add(p4);
//		products.add(p5);
//		
//		
//		//Inventory Creation:
//		
		Inventory inventory = new Inventory();
		
		Inventory.prodStockList.add(p1);
		Inventory.prodStockList.add(p2);
		Inventory.prodStockList.add(p3);
		Inventory.prodStockList.add(p4);
		Inventory.prodStockList.add(p5);
		
//		for (int i = 0; i < Inventory.prodStockList.size(); i++) {
//			System.out.println(Inventory.prodStockList.get(i).nameString); 
//		}
//		inventory.diplay();
		//Customer creation : 
		
		Customer c1 = new Customer("Suchetan", "xxx@gmail.com","7003234994");
		
		// UI :
		
		boolean session = true;
		
		while(session)
		{
			System.out.println("Welocome to Amazon, " +c1.nameString);
			System.out.println("Select the product you want to purchase from below : ");
			
			for(int i = 0 ; i<Inventory.prodStockList.size();i++)
			{
				System.out.println(Inventory.prodStockList.get(i).prodId+". "+Inventory.prodStockList.get(i).nameString);
			}
			
			int option = scanner.nextInt();
			
			c1.addToCart(option);
//			System.out.println(Inventory.prodStockList.get(option-1).quantity);
//			System.out.println(Cart.prodList.get(0).nameString);
//			System.out.println(Cart.cartTotal);
			
			System.out.println("Do you want to continue shopping? Press y to continue :");
			String reString = scanner.next().toLowerCase();
			if(!reString.equals("y"))
			{
				c1.cart.display();
				System.out.println("Thank You for shopping! \nYour Cart total is - "+Cart.cartTotal+" rs. \nProceed to payment.");
				session=false;
			}
			
		}
		inventory.diplay();
		
	}

}
