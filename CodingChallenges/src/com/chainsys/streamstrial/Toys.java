package com.chainsys.streamstrial;

public class Toys {
	private String toyName;
    private int quantity;
    private  double rupees;
	
	public String getToyName() {
		return toyName;
	}
	public void setToyName(String toyName) {
		this.toyName = toyName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getRupees() {
		return rupees;
	}
	public void setRupees(double rupees) {
		this.rupees = rupees;
	}
	
	
	@Override
	public String toString() {
		return "Toys [toyName=" + toyName + ", quantity=" + quantity + ", rupees=" + rupees + "]";
	}
	public Toys(String toyName, int quantity, double rupees) {
		super();
		this.toyName = toyName;
		this.quantity = quantity;
		this.rupees = rupees;
		
	}
	public Toys() {
		
	}
	
    
    
}
