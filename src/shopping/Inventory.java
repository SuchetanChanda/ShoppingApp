package shopping;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	 public static List<Product> prodStockList = new ArrayList<Product>() ;
	
//	public Inventory(List<Product> products) {
//		// TODO Auto-generated constructor stub
//		this.prodStockList = products;
//	}
	public void diplay() {
		System.out.println("Inventory: \n");
		for(int i = 0 ; i<prodStockList.size(); i++)
		{
			System.out.println(prodStockList.get(i).nameString+"----"+prodStockList.get(i).quantity+" left");
		}
	}
	public static void removeProd(int prodID) {
		for(int i = 0 ;i< prodStockList.size();i++)
		{
			if(prodStockList.get(i).prodId==prodID)
				prodStockList.get(i).quantity--;
		}
	}
	
	
}

