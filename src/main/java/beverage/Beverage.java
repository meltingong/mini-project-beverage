package beverage;

import category.Category;
import ingredient.Ingredient;

public class Beverage {
	
	private int b_no;
	private String b_name;
	private String b_image;
	private int ca_no;
	private int i_no;
	
	public Beverage(int b_no, String b_name, String b_image, int ca_no, int i_no) {
		super();
		this.b_no = b_no;
		this.b_name = b_name;
		this.b_image = b_image;
		this.ca_no = ca_no;
		this.i_no = i_no;
	}
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_image() {
		return b_image;
	}
	public void setB_image(String b_image) {
		this.b_image = b_image;
	}
	public int getCa_no() {
		return ca_no;
	}
	public void setCa_no(int ca_no) {
		this.ca_no = ca_no;
	}
	public int getI_no() {
		return i_no;
	}
	public void setI_no(int i_no) {
		this.i_no = i_no;
	}
	@Override
	public String toString() {
		return "Beverage [b_no=" + b_no + ", b_name=" + b_name + ", b_image=" + b_image + ", ca_no=" + ca_no + ", i_no="
				+ i_no + "]\n";
	}
	
}
