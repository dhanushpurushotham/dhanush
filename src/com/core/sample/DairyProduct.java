package com.core.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.core.sample.*;

public class DairyProduct extends DailyProduct {

	private static String className = DairyProduct.class.getName();
	protected float total_dairy_products;
	
	HashMap dairyProducts = null;
	
	private boolean Nandini = false;
	//private boolean Heritage = false;
	//private boolean AkshayaKalpa = false;
	//Private boolean Aarogya = false;
	
	
	ProcessNandini processNandini;
	//ProcessHeritage processHeritage;
	//ProcessAkshayakalpa processAkshayakalpa;
	//ProcessAarogya processAarogya;
	
	
	public DairyProduct() {
		
		final String methodName="DairyProduct()";
		dairyProducts = new HashMap();
		processNandini = new ProcessNandini();
		//processHeritage = new ProcessHeritage();
		//processAkshayakalpa = new ProcessAkshayakalpa();
		//processAarogya = new ProcessAarogya();
	}
	

	
	
public void OrderDairy() {
		
		final String methodName="OrderDairy()";
		//System.out.println("Tracer: "+className+ " "+methodName+ ": Enter");
		
		System.out.println("MENU ITEMS");
		System.out.println("Nandini - 1");
		System.out.println("Heritage - 2");
		System.out.println("AkshayaKalpa - 3");
		System.out.println("AArogya - 4");
		System.out.println("Exit - 5");
		
		Scanner in = new Scanner(System.in);
		
		ProcessNandini orderProcessNandini = new ProcessNandini();
		//ProcessHeritage orderProcessHeritage = new ProcessHeritage();
		//ProcessAkshayaKalpa orderProcessAkshayakalpa = new ProcessAkshayaKalpa();
		//ProcessAarogya orderProcessAarogya = new ProcessAarogya();
		
		int i;
		
		do {
			
			System.out.println("Enter user input");
			i = in.nextInt();	
			
			switch(i) {
		
			case 1 : System.out.println("NandiniProducts");
					processNandini.OrderNandini();
					 Nandini=true;
					 break;
					 
			case 2 : System.out.println("HeritageProducts"); 
					 //processHeritage.OrderHeritage();
					 //Heritage=true;
					 break;
					 
			case 3 : System.out.println("AkshayakalpaProducts");
					 //processAkshayakalpa.OrderAkshayakalpa();
					 //AkshayaKalpa = true;
					 break;
					 
			case 4 : System.out.println("AarogyaProducts");		 
					 //processAarogya.OrderAarogya();
					 //Aarogya = true;
					 break;
			
			case 5 : System.out.println("Exit");
					 break;
					 
			default : System.out.println("Enter input as suggested by the selection in the MENU");
			continue;
			
			}
			
		}while(i==5);
		
	}

public float getPrice() {
	
	final String methodName="getPrice()";
	
	float total_Nandini = 0;
	float total_Heritage = 0;
	float total_Aarogya = 0;
	float total_Akshayakalpa = 0;
	
	if (Nandini = true) {
		total_Nandini = processNandini.getPrice();
	}
/*	
	if (Heritage == true) {
		total_Heritage = processHeritage.getPrice();
	}
	
	if (AkshayaKalpa == true) {
		total_Akshayakalpa = processAkshayakalpa.getPrice();
	}
	
	if(Aarogya== true) {
		total_Akshayakalpa = processAarogya.getPrice();
	}
*/	
	
}

public HashMap reviewDairyProduct() {
	final String methodName="reviewDairyProduct()";
	
	Map temp = new HashMap();
	
	if (Nandini = true) {
		temp = processNandini.reviewNandini();
		dairyProducts.putAll(temp);
		temp.clear();
	}
/*	
	if (Heritage == true) {
		temp = processHeritage.reviewHeritage();
		dairyProducts.putAll(temp);
		temp.clear();
	}
	
	if (AkshayaKalpa == true) {
		total_Akshayakalpa = processAkshayakalpa.reviewAkshayakalpa();
		dairyProducts.putAll(temp);
		temp.clear();
	}
	
	if(Aarogya== true) {
		total_Akshayakalpa = processAarogya.reviewAarogya();
		dairyProducts.putAll(temp);
		temp.clear();
	}
*/	
	
	return dairyProducts;
	
}







public float calculateTotalDairy() {
	
	final String methodName="calculateTotalDairy()";
	//System.out.println("Tracer: "+className+ " "+methodName+ ": Enter");
	
	total_dairy_products = processNandini.total_nandini + processHeritage.total_heritage
			+ processAkshayakalpa.total_akshayakalpa + processAarogya.total_aarogya;
	
	//System.out.println("Tracer: "+className+ " "+methodName+ ": Dairy Products Total = "+total_dairy_products);
	
	//System.out.println("Tracer: "+className+ " "+methodName+ ": Exit");
	
	return total_dairy_products;
	
}
	
	
}
