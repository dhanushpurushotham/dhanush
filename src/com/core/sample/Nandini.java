package com.core.sample;

public class Nandini {
	
	private static String className = Nandini.class.getName();
	
	//Price of each product. It would be better if we could read the price from an external text file. It also becomes easier to configure.
	final static  float TONED_MILK_250ML = 15;
	final static  float TONED_MILK_500ML = 20;
	final static  float TONED_MILK_1000ML = 30;
	final static  float SHUBAM_MILK_250ML = 16;
	final static  float SHUBAM_MILK_500ML = 25;
	final static  float SHUBAM_MILK_1000ML = 32;
	final static  float HOMOGENIZED_MILK_250ML = 18;
	final static  float HOMOGENIZED_MILK_500ML = 28;
	final static  float HOMOGENIZED_MILK_1000ML = 36;
	final static  float CURD_250ML = 10;
	final static  float CURD_500ML = 18;
	final static  float CURD_1000ML = 27;
	
	private int quantity_toned_Milk_250ml;
	private int quantity_toned_Milk_500ml;
	private int quantity_toned_Milk_1000ml;
	private int quantity_shubam_Milk_250ml;
	private int quantity_shubam_Milk_500ml;
	private int quantity_shubam_Milk_1000ml;
	private int quantity_homogenized_Milk_250ml;
	private int quantity_homogenized_Milk_500ml;
	private int quantity_homogenized_Milk_1000ml;
	private int quantity_curd_250ml;
	private int quantity_curd_500ml;
	private int quantity_curd_1000ml;
	
	private float price_toned_Milk_250ml;
	private float price_toned_Milk_500ml;
	private float price_toned_Milk_1000ml;
	private float price_shubam_Milk_250ml;
	private float price_shubam_Milk_500ml;
	private float price_shubam_Milk_1000ml;
	private float price_homogenized_Milk_250ml;
	private float price_homogenized_Milk_500ml;
	private float price_homogenized_Milk_1000ml;
	private float price_curd_250ml;
	private float price_curd_500ml;
	private float price_curd_1000ml;
	
	
	
	public void setPrice_toned_Milk_250ml() {
		this.price_toned_Milk_250ml = this.quantity_toned_Milk_250ml * TONED_MILK_250ML;
	}
	public void setPrice_toned_Milk_500ml() {
		this.price_toned_Milk_500ml = this.quantity_toned_Milk_500ml * TONED_MILK_500ML;
	}
	public void setPrice_toned_Milk_1000ml() {
		this.price_toned_Milk_1000ml = this.quantity_toned_Milk_1000ml * TONED_MILK_1000ML;
	}
	public void setPrice_shubam_Milk_250ml() {
		this.price_shubam_Milk_250ml = this.quantity_shubam_Milk_250ml * SHUBAM_MILK_250ML;
	}
	public void setPrice_shubam_Milk_500ml() {
		this.price_shubam_Milk_500ml = this.quantity_shubam_Milk_500ml * SHUBAM_MILK_500ML;
	}
	public void setPrice_shubam_Milk_1000ml() {
		this.price_shubam_Milk_1000ml = this.quantity_shubam_Milk_1000ml * SHUBAM_MILK_1000ML;
	}
	public void setPrice_homogenized_Milk_250ml() {
		this.price_homogenized_Milk_250ml = this.quantity_homogenized_Milk_250ml * HOMOGENIZED_MILK_250ML;
	}
	public void setPrice_homogenized_Milk_500ml() {
		this.price_homogenized_Milk_500ml = this.quantity_homogenized_Milk_500ml * HOMOGENIZED_MILK_500ML;
	}
	public void setPrice_homogenized_Milk_1000ml() {
		this.price_homogenized_Milk_1000ml = this.quantity_homogenized_Milk_1000ml * HOMOGENIZED_MILK_1000ML;
	}
	public void setPrice_curd_250ml() {
		this.price_curd_250ml = this.quantity_curd_250ml * CURD_250ML;
	}
	public void setPrice_curd_500ml() {
		this.price_curd_500ml = this.quantity_curd_500ml * CURD_500ML;
	}
	public void setPrice_curd_1000ml() {
		this.price_curd_1000ml = this.quantity_curd_500ml * CURD_1000ML;
	}
	public float getPrice_toned_Milk_250ml() {
		return price_toned_Milk_250ml;
	}
	public float getPrice_toned_Milk_500ml() {
		return price_toned_Milk_500ml;
	}
	public float getPrice_toned_Milk_1000ml() {
		return price_toned_Milk_1000ml;
	}
	public float getPrice_shubam_Milk_250ml() {
		return price_shubam_Milk_250ml;
	}
	public float getPrice_shubam_Milk_500ml() {
		return price_shubam_Milk_500ml;
	}
	public float getPrice_shubam_Milk_1000ml() {
		return price_shubam_Milk_1000ml;
	}
	public float getPrice_homogenized_Milk_250ml() {
		return price_homogenized_Milk_250ml;
	}
	public float getPrice_homogenized_Milk_500ml() {
		return price_homogenized_Milk_500ml;
	}
	public float getPrice_homogenized_Milk_1000ml() {
		return price_homogenized_Milk_1000ml;
	}
	public float getPrice_curd_250ml() {
		return price_homogenized_Milk_250ml;
	}
	public float getPrice_curd_500ml() {
		return price_homogenized_Milk_500ml;
	}
	public float getPrice_curd_1000ml() {
		return price_homogenized_Milk_1000ml;
	}
	
	
	public int getQuantity_toned_Milk_250ml() {
		return quantity_toned_Milk_250ml;
	}
	public void setQuantity_toned_Milk_250ml(int quantity_toned_Milk_250ml) {
		this.quantity_toned_Milk_250ml = quantity_toned_Milk_250ml;
	}
	public int getQuantity_toned_Milk_500ml() {
		return quantity_toned_Milk_500ml;
	}
	public void setQuantity_toned_Milk_500ml(int quantity_toned_Milk_500ml) {
		this.quantity_toned_Milk_500ml = quantity_toned_Milk_500ml;
	}
	public int getQuantity_toned_Milk_1000ml() {
		return quantity_toned_Milk_1000ml;
	}
	public void setQuantity_toned_Milk_1000ml(int quantity_toned_Milk_1000ml) {
		this.quantity_toned_Milk_1000ml = quantity_toned_Milk_1000ml;
	}
	public int getQuantity_shubam_Milk_250ml() {
		return quantity_shubam_Milk_250ml;
	}
	public void setQuantity_shubam_Milk_250ml(int quantity_shubam_Milk_250ml) {
		this.quantity_shubam_Milk_250ml = quantity_shubam_Milk_250ml;
	}
	public int getQuantity_shubam_Milk_500ml() {
		return quantity_shubam_Milk_500ml;
	}
	public void setQuantity_shubam_Milk_500ml(int quantity_shubam_Milk_500ml) {
		this.quantity_shubam_Milk_500ml = quantity_shubam_Milk_500ml;
	}
	public int getQuantity_shubam_Milk_1000ml() {
		return quantity_shubam_Milk_1000ml;
	}
	public void setQuantity_shubam_Milk_1000ml(int quantity_shubam_Milk_1000ml) {
		this.quantity_shubam_Milk_1000ml = quantity_shubam_Milk_1000ml;
	}
	public int getQuantity_homogenized_Milk_250ml() {
		return quantity_homogenized_Milk_250ml;
	}
	public void setQuantity_homogenized_Milk_250ml(
			int quantity_homogenized_Milk_250ml) {
		this.quantity_homogenized_Milk_250ml = quantity_homogenized_Milk_250ml;
	}
	public int getQuantity_homogenized_Milk_500ml() {
		return quantity_homogenized_Milk_500ml;
	}
	public void setQuantity_homogenized_Milk_500ml(
			int quantity_homogenized_Milk_500ml) {
		this.quantity_homogenized_Milk_500ml = quantity_homogenized_Milk_500ml;
	}
	public int getQuantity_homogenized_Milk_1000ml() {
		return quantity_homogenized_Milk_1000ml;
	}
	public void setQuantity_homogenized_Milk_1000ml(
			int quantity_homogenized_Milk_1000ml) {
		this.quantity_homogenized_Milk_1000ml = quantity_homogenized_Milk_1000ml;
	}
	public int getQuantity_curd_250ml() {
		return quantity_curd_250ml;
	}
	public void setQuantity_curd_250ml(int quantity_curd_250ml) {
		this.quantity_curd_250ml = quantity_curd_250ml;
	}
	public int getQuantity_curd_500ml() {
		return quantity_curd_500ml;
	}
	public void setQuantity_curd_500ml(int quantity_curd_500ml) {
		this.quantity_curd_500ml = quantity_curd_500ml;
	}
	public int getQuantity_curd_1000ml() {
		return quantity_curd_1000ml;
	}
	public void setQuantity_curd_1000ml(int quantity_curd_1000ml) {
		this.quantity_curd_1000ml = quantity_curd_1000ml;
	}
	
	
	

}
