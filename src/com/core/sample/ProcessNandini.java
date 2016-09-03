package com.core.sample;

import java.util.*;

import com.core.sample.Nandini;

public class ProcessNandini {
	
	HashMap items;
	
	int quantity[] = new int[12];
	
	float price_nandini;
	
	Nandini orderNandini = null;
	
	public ProcessNandini() {
		
		orderNandini = new Nandini();
		
	}
	
	int index = 0;
	
	private ArrayList<int> product_code = new ArrayList();
	
	HashMap NandiniProducts = new HashMap();
	
/*	ProcessNandini() {
		
		items = new HashMap();
				
		System.out.println("Nandini Dairy Products Menu");
		System.out.println("Item"+"\t"+"Quantity"+"\t"+"Price");
		System.out.println("TONED MILK"+"\t"+"250ML"+"\t"+"15");
		System.out.println("TONED MILK"+"\t"+"500ML"+"\t"+"20");
		System.out.println("TONED MILK"+"\t"+"1000ML"+"\t"+"30");
		System.out.println("SHUBAM MILK"+"\t"+"250ML"+"\t"+"16");
		System.out.println("SHUBAM MILK"+"\t"+"500ML"+"\t"+"25");
		System.out.println("SHUBAM MILK"+"\t"+"1000ML"+"\t"+"32");
		System.out.println("HOMOGENIZED MILK"+"\t"+"250ML"+"\t"+"18");
		System.out.println("HOMOGENIZED MILK"+"\t"+"500ML"+"\t"+"28");
		System.out.println("HOMOGENIZED MILK"+"\t"+"1000ML"+"\t"+"36");
		System.out.println("CURD"+"\t"+"250ML"+"\t"+"10");
		System.out.println("CURD"+"\t"+"500ML"+"\t"+"18");
		System.out.println("CURD"+"\t"+"1000ML"+"\t"+"27");
	}
*/
	public void OrderNandini() {
		
		//How do we get the user i/p
		//User i/p has to be stored in the hashmap
		//Assuming the array quantity[] has the quantity of each item in Nandini products in the same sequence as printed in the constructor
		
		final String methodName="OrderNandini()";
		//System.out.println("Tracer: "+className+ " "+methodName+ ": Enter");
		
		System.out.println("MENU ITEM"+"\t"+"Price"+"\t"+"Selection");
		System.out.println("TONED_MILK_250ML"+"\t"+Nandini.TONED_MILK_250ML+"\t"+"1");
		System.out.println("TONED_MILK_500ML"+"\t"+Nandini.TONED_MILK_500ML+"\t"+"2");
		System.out.println("TONED_MILK_1000ML"+"\t"+Nandini.TONED_MILK_1000ML+"\t"+"3");
		System.out.println("SHUBAM_MILK_250ML"+"\t"+Nandini.SHUBAM_MILK_250ML+"\t"+"4");
		System.out.println("SHUBAM_MILK_500ML"+"\t"+Nandini.SHUBAM_MILK_500ML+"\t"+"5");
		System.out.println("SHUBAM_MILK_1000ML"+"\t"+Nandini.SHUBAM_MILK_1000ML+"\t"+"6");
		System.out.println("HOMOGENIZED_MILK_250ML"+"\t"+Nandini.HOMOGENIZED_MILK_250ML+"\t"+"7");
		System.out.println("HOMOGENIZED_MILK_500ML"+"\t"+Nandini.HOMOGENIZED_MILK_500ML+"\t"+"8");
		System.out.println("HOMOGENIZED_MILK_1000ML"+"\t"+Nandini.HOMOGENIZED_MILK_1000ML+"\t"+"9");
		System.out.println("CURD_250ML"+"\t"+Nandini.CURD_250ML+"\t"+"10");
		System.out.println("CURD_500ML"+"\t"+Nandini.CURD_500ML+"\t"+"11");
		System.out.println("CURD_1000ML"+"\t"+Nandini.CURD_1000ML+"\t"+"12");
		System.out.println("Exit - 0");
		
		Scanner in = new Scanner(System.in);
		
		
		List myList = new ArrayList();
		int i;
		int quantity;
		
		do {
			
			System.out.println("Enter user input");
			i = in.nextInt();	
			
			switch(i) {
		
			case 1 : System.out.println("TONED_MILK_250ML : "+Nandini.TONED_MILK_250ML);
					 System.out.println("Input quantity");
					 quantity = in.nextInt();
					 orderNandini.setQuantity_toned_Milk_250ml(quantity);
					 orderNandini.setPrice_toned_Milk_250ml();
					 
					 if (NandiniProducts.containsKey("TONED_MILK_250ML")) {
						myList.add(orderNandini.getQuantity_toned_Milk_250ml());
						myList.add(orderNandini.getPrice_toned_Milk_250ml());
						
						NandiniProducts.put("TONED_MILK_250ML", myList);
					 }
					 else {
						 myList.add(orderNandini.getQuantity_toned_Milk_250ml());
						 myList.add(orderNandini.getPrice_toned_Milk_250ml());
						 NandiniProducts.put("TONED_MILK_250ML", myList);
						 product_code[++index] = index;
					 }
					 
					 myList.clear();
					 
					 break;
					 
			case 2 : System.out.println("TONED_MILK_500ML : "+Nandini.TONED_MILK_500ML);
					 System.out.println("Input Quantity");
					 quantity = in.nextInt();
					 orderNandini.setQuantity_toned_Milk_500ml(quantity);
					 orderNandini.setPrice_toned_Milk_500ml();
					 
					 if (NandiniProducts.containsKey("TONED_MILK_500ML")) {
							myList.add(orderNandini.getQuantity_toned_Milk_500ml());
							myList.add(orderNandini.getPrice_toned_Milk_500ml());
							
							NandiniProducts.put("TONED_MILK_500ML", myList);
					  }
					else {
						 myList.add(orderNandini.getQuantity_toned_Milk_500ml());
						 myList.add(orderNandini.getPrice_toned_Milk_500ml());
						 NandiniProducts.put("TONED_MILK_500ML", myList);
						 product_code[++index] = index;
					 }
					 
					 myList.clear();
					 
					 break;
					 
			case 3 : System.out.println("TONED_MILK_1000ML : "+Nandini.TONED_MILK_1000ML);
					 System.out.println("Input Quantity");
					 quantity = in.nextInt();
					 orderNandini.setQuantity_toned_Milk_1000ml(quantity);
					 orderNandini.setPrice_toned_Milk_1000ml();
					 
					 if (NandiniProducts.containsKey("TONED_MILK_1000ML")) {
							myList.add(orderNandini.getQuantity_toned_Milk_1000ml());
							myList.add(orderNandini.getPrice_toned_Milk_1000ml());
							
							NandiniProducts.put("TONED_MILK_1000ML", myList);
					  }
					else {
						 myList.add(orderNandini.getQuantity_toned_Milk_1000ml());
						 myList.add(orderNandini.getPrice_toned_Milk_1000ml());
						 NandiniProducts.put("TONED_MILK_1000ML", myList);
						 product_code[++index] = index;
					 }
					 
					 myList.clear();
					 
					 break;
					 
			case 4 : System.out.println("SHUBAM_MILK_250ML : "+Nandini.SHUBAM_MILK_250ML);		 
					 System.out.println("Input Quantity");
					 quantity = in.nextInt();
					 orderNandini.setQuantity_shubam_Milk_250ml(quantity);
					 orderNandini.setPrice_shubam_Milk_250ml();
					 
					 if (NandiniProducts.containsKey("SHUBAM_MILK_250ML")) {
							myList.add(orderNandini.getQuantity_shubam_Milk_250ml());
							myList.add(orderNandini.getPrice_shubam_Milk_250ml());
							
							NandiniProducts.put("SHUBAM_MILK_250ML", myList);
					  }
					else {
						 myList.add(orderNandini.getQuantity_shubam_Milk_250ml());
						 myList.add(orderNandini.getPrice_shubam_Milk_250ml());
						 NandiniProducts.put("SHUBAM_MILK_250ML", myList);
						 product_code[++index] = index;
					 }
					 
					 myList.clear();
					 
					 break;
			
			case 5 : System.out.println("SHUBAM_MILK_500ML : "+Nandini.SHUBAM_MILK_500ML);
					 System.out.println("Input Quantity");
					 quantity = in.nextInt();
					 orderNandini.setQuantity_shubam_Milk_500ml(quantity);
					 orderNandini.setPrice_shubam_Milk_500ml();
					 
					 if (NandiniProducts.containsKey("SHUBAM_MILK_500ML")) {
							myList.add(orderNandini.getQuantity_shubam_Milk_500ml());
							myList.add(orderNandini.getPrice_shubam_Milk_500ml());
							
							NandiniProducts.put("SHUBAM_MILK_500ML", myList);
					  }
					else {
						 myList.add(orderNandini.getQuantity_shubam_Milk_500ml());
						 myList.add(orderNandini.getPrice_shubam_Milk_500ml());
						 NandiniProducts.put("SHUBAM_MILK_500ML", myList);
						 product_code[++index] = index;
					 }
					 
					 myList.clear();
					 
					 break;
			
			case 6 : System.out.println("SHUBAM_MILK_1000ML : "+Nandini.SHUBAM_MILK_1000ML);
					System.out.println("Input Quantity");
					quantity = in.nextInt();
					orderNandini.setQuantity_shubam_Milk_1000ml(quantity);
					orderNandini.setPrice_shubam_Milk_1000ml();
					
					if (NandiniProducts.containsKey("SHUBAM_MILK_1000ML")) {
						myList.add(orderNandini.getQuantity_shubam_Milk_1000ml());
						myList.add(orderNandini.getPrice_shubam_Milk_1000ml());
						
						NandiniProducts.put("SHUBAM_MILK_1000ML", myList);
				  }
				else {
					 myList.add(orderNandini.getQuantity_shubam_Milk_1000ml());
					 myList.add(orderNandini.getPrice_shubam_Milk_1000ml());
					 NandiniProducts.put("SHUBAM_MILK_1000ML", myList);
					 product_code[++index] = index;
				 }
				 
				 myList.clear();
					
					break;
			
			case 7 : System.out.println("HOMOGENIZED_MILK_250ML : "+Nandini.HOMOGENIZED_MILK_250ML);
					System.out.println("Input Quantity");
					quantity = in.nextInt();
					orderNandini.setQuantity_homogenized_Milk_250ml(quantity);
					orderNandini.setPrice_homogenized_Milk_250ml();
					
					if (NandiniProducts.containsKey("HOMOGENIZED_MILK_250ML")) {
						myList.add(orderNandini.getQuantity_homogenized_Milk_250ml());
						myList.add(orderNandini.getPrice_homogenized_Milk_250ml());
						
						NandiniProducts.put("HOMOGENIZED_MILK_250ML", myList);
				  }
				else {
					 myList.add(orderNandini.getQuantity_homogenized_Milk_250ml());
					 myList.add(orderNandini.getPrice_homogenized_Milk_250ml());
					 NandiniProducts.put("HOMOGENIZED_MILK_250ML", myList);
					 product_code[++index] = index;
				 }
				 
				 myList.clear();
					
					break;
					
			case 8 : System.out.println("HOMOGENIZED_MILK_500ML : "+Nandini.HOMOGENIZED_MILK_500ML);
					System.out.println("Input Quantity");
					quantity = in.nextInt();
					orderNandini.setQuantity_homogenized_Milk_1000ml(quantity);
					orderNandini.setPrice_homogenized_Milk_500ml();
					
					if (NandiniProducts.containsKey("HOMOGENIZED_MILK_500ML")) {
						myList.add(orderNandini.getQuantity_homogenized_Milk_500ml());
						myList.add(orderNandini.getPrice_homogenized_Milk_500ml());
						
						NandiniProducts.put("HOMOGENIZED_MILK_500ML", myList);
				  }
				else {
					 myList.add(orderNandini.getQuantity_homogenized_Milk_500ml());
					 myList.add(orderNandini.getPrice_homogenized_Milk_500ml());
					 NandiniProducts.put("HOMOGENIZED_MILK_500ML", myList);
					 product_code[++index] = index;
				 }
				 
				 myList.clear();
					
					break;
					
			case 9 : System.out.println("HOMOGENIZED_MILK_1000ML : "+Nandini.HOMOGENIZED_MILK_1000ML);
					System.out.println("Input Quantity");
					quantity = in.nextInt();
					orderNandini.setQuantity_shubam_Milk_1000ml(quantity);
					orderNandini.setPrice_homogenized_Milk_1000ml();
					
					if (NandiniProducts.containsKey("HOMOGENIZED_MILK_1000ML")) {
						myList.add(orderNandini.getQuantity_homogenized_Milk_1000ml());
						myList.add(orderNandini.getPrice_homogenized_Milk_1000ml());
						
						NandiniProducts.put("HOMOGENIZED_MILK_1000ML", myList);
				  }
				else {
					 myList.add(orderNandini.getQuantity_homogenized_Milk_1000ml());
					 myList.add(orderNandini.getPrice_homogenized_Milk_1000ml());
					 NandiniProducts.put("HOMOGENIZED_MILK_1000ML", myList);
					 product_code[++index] = index;
				 }
				 
				 myList.clear();
					
					break;
					
			case 10:System.out.println("CURD_250ML : "+Nandini.CURD_250ML);
					System.out.println("Input Quantity");
					quantity = in.nextInt();
					orderNandini.setQuantity_curd_250ml(quantity);
					orderNandini.setPrice_curd_250ml();
					
					if (NandiniProducts.containsKey("CURD_250ML")) {
						myList.add(orderNandini.getQuantity_curd_250ml());
						myList.add(orderNandini.getPrice_curd_250ml());
						
						NandiniProducts.put("CURD_250ML", myList);
				  }
				else {
					 myList.add(orderNandini.getQuantity_curd_250ml());
					 myList.add(orderNandini.getPrice_curd_250ml());
					 NandiniProducts.put("CURD_250ML", myList);
					 product_code[++index] = index;
				 }
				 
				 myList.clear();
					
					break;
					
			case 11:System.out.println("CURD_500ML : "+Nandini.CURD_500ML);
					System.out.println("Input Quantity");
					quantity = in.nextInt();
					orderNandini.setQuantity_curd_500ml(quantity);
					orderNandini.setPrice_curd_500ml();
					
					if (NandiniProducts.containsKey("CURD_500ML")) {
						myList.add(orderNandini.getQuantity_curd_500ml());
						myList.add(orderNandini.getPrice_curd_500ml());
						
						NandiniProducts.put("CURD_500ML", myList);
				  }
				else {
					 myList.add(orderNandini.getQuantity_curd_500ml());
					 myList.add(orderNandini.getPrice_curd_500ml());
					 NandiniProducts.put("CURD_500ML", myList);
					 product_code[++index] = index;
				 }
				 
				 myList.clear();
					
					break;
					
			case 12:System.out.println("CURD_1000ML : "+Nandini.CURD_1000ML);
					System.out.println("Input Quantity");
					quantity = in.nextInt();
					orderNandini.setQuantity_curd_1000ml(quantity);
					orderNandini.setPrice_curd_1000ml();
					
					if (NandiniProducts.containsKey("CURD_1000ML")) {
						myList.add(orderNandini.getQuantity_curd_1000ml());
						myList.add(orderNandini.getPrice_curd_1000ml());
						
						NandiniProducts.put("CURD_1000ML", myList);
				  }
				else {
					 myList.add(orderNandini.getQuantity_curd_1000ml());
					 myList.add(orderNandini.getPrice_curd_1000ml());
					 NandiniProducts.put("CURD_1000ML", myList);
					 product_code[++index] = index;
				 }
				 
				 myList.clear();
					
					break;
					
			case 0: System.out.println("Exit");
					 break;
					 
			default : System.out.println("Enter input as suggested by the selection in the MENU");
						continue;
			
			}
			
		}while(i==0);
		
	}
	
	
	public float getPrice() {
		final String methodName="getPrice()";
		//System.out.println("Tracer: "+className+ " "+methodName+ ": Enter");
		
		float nandini_total = 0;
		int index_flag = 0;
		
		foreach(Map.Entry<String, List<int>> entry : NandiniProducts.entrySet()) {
			
			//String key = entry.getKey();
			//System.out.print(key);
			
			for(int value : entry.getValue()) {
				
				index_flag++;
				
				if(index_flag % 2 == 0) {

					nandini_total+=value;

				}
			}
		}
		
	}
	
	
	public HashMap reviewNandini() {
		
		final String methodName="reviewNandini()";
		//System.out.println("Tracer: "+className+ " "+methodName+ ": Enter");
		
		return NandiniProducts;
		
	}
	
	
	public float calculate_price_Nandini () {
		
		float price_Nandini = 0;
		
		
		
		return price_Nandini;
	}
		
	
}
