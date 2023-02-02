package shopping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
	int id;
	static Map <String , Integer> prodList = new HashMap <>(); 
	static double cartTotal;
	
	
	public static void addProduct(int productId) {
		if(prodList.containsKey(Inventory.prodStockList.get(productId-1).nameString))
		{
			prodList.put(Inventory.prodStockList.get(productId-1).nameString, prodList.get(Inventory.prodStockList.get(productId-1).nameString) + 1);
			cartTotal+=Inventory.prodStockList.get(productId-1).price;
		}
			
        else
        	{
        		prodList.put(Inventory.prodStockList.get(productId-1).nameString, 1);
        		cartTotal+=Inventory.prodStockList.get(productId-1).price;
        	}
	}
	public  void display() {
		System.out.println("Your Cart: \n");
		 for (Map.Entry<String,Integer> entry : prodList.entrySet()) 
		        System.out.println(entry.getKey() +
		                         " - " + entry.getValue());
		
	}
	
}
