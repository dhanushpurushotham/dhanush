package com.core.sample;

import java.util.Scanner;
import java.util.*;

import com.core.sample.DairyProduct;
import com.core.sample.NewsPaper;
import com.core.sample.Flowers;
import com.core.sample.Magazines;

public class DailyProduct {

	private static String className = DailyProduct.class.getName();
	private float totalPrice;
	
	HashMap products = null;
	
	private boolean DairyProduct=false;
	//private boolean NewsPaperProduct=false;
	//private boolean FlowerOrders=false;
	//private boolean MagazinesProducts=false;
	
	DairyProduct dairyProduct;
	//NewsPaper newspaper;
	//Flowers flowers;
	//Magazines magazines
	
	
	public DailyProduct() {
		products = new HashMap();
		 dairyProduct = new DairyProduct();
		// newspaper = new NewsPaper();
		// flowers = new Flowers();
		// magazines = new magazines();
	}
	
	public void OrderProduct() {
		
		final String methodName="OrderProduct()";
		//System.out.println("Tracer: "+className+ " "+methodName+ ": Enter");
		
		System.out.println("MENU ITEMS");
		System.out.println("Dairy Products - 1");
		System.out.println("NewsPaper - 2");
		System.out.println("Flowers - 3");
		System.out.println("Magazines - 4");
		System.out.println("Exit - 5");
		
		Scanner in = new Scanner(System.in);
		
		int i;
		
		do {
			
			System.out.println("Enter user input");
			i = in.nextInt();	
			
			switch(i) {
		
			case 1 : System.out.println("DairyProducts");
					 dairyProduct.OrderDairy();
					 DairyProduct=true;
					 break;
					 
			case 2 : System.out.println("NewsPaperProducts"); 
					 //newspaper.OrderNewsPaper();
					 //NewsPaperProduct=true;
					 break;
					 
			case 3 : System.out.println("Flowers");
					 //flowers.OrderFlowers();
					 //FlowerOrders=true;
					 break;
					 
			case 4 : System.out.println("MagazineProducts");		 
					 //magazines.OrderMagazines();
					 //MagazinesProducts=true;
					 break;
			
			case 5 : System.out.println("Exit");
					 break;
					 
			default : System.out.println("Enter input as suggested by the selection in the MENU");
			continue;

			
			}
			
		}while(i==5);
		
	}
	
	
	public void BuyProduct () {
		
		final String methodName="BuyProduct()";
		
		float total_dairyProduct = 0;
		float total_NewsPaper = 0;
		float total_Flowers = 0;
		float total_magazines = 0;
		
		Map temp = new HashMap();
		
		if (DairyProduct == true) {
			
			temp = dairyProduct.reviewDairyProduct();
			products.putAll(temp);
			total_dairyProduct = dairyProduct.getPrice();
			temp.clear();
		}
		
/*		if (NewsPaperProduct == true) {
			
			temp = newspaper.reviewNewsPaperProduct();
			products.putAll(temp);
			total_NewsPaper = newspaper.getPrice();	
			temp.clear();
		}
		
		if (FlowerOrders == true) {
			
			temp = flowers.reviewFlowersProduct();
			products.putAll(temp);
			total_Flowers = flowers.getPrice();
			temp.clear();
		}
		
		if(MagazinesProducts == true) {
			
			temp = magazines.reviewMagazinesProduct();
			products.putAll(temp);
			total_magazines = magazines.getPrice();
			temp.clear();
		}
		
*/	
		
		System.out.println("Products ordered :");
		reviewProducts(products);
		
		float total_price = total_dairyProduct + total_NewsPaper + total_Flowers + total_magazines;
		
		System.out.println("Total Price of products ordered : "+total_price);
		
		
	}
	
	
	public void reviewProducts(HashMap temp) {
		final String methodName="reviewProducts()";
		
		for (Map.Entry<String, List<int>> entry : temp.entrySet()) {
			String key = entry.getKey();
			System.out.print(key);
			for (int value : entry.getValue()){
				
				System.out.print("\t"+value);
			}
			System.out.println();
		}
		
		
	}
	
	
//This method must be implemented such that as soon as a product is added into the cart, the total price must be updated
public float calculateTotal() {
		
		final String methodName="calculateTotal()";
		//System.out.println("Tracer: "+className+ " "+methodName+ ": Enter");
				
		totalPrice = dairyProduct.total_dairy_products + newspaper.total_newspaper
				+ flowers.total_flowers + magazines.total_magazines;
		
		System.out.println("Tracer: "+className+ " "+methodName+ ": Total Order Price = "+totalPrice);
		
		System.out.println("Tracer: "+className+ " "+methodName+ ": Exit");
		
		return totalPrice;
		
	}
	



	
}
