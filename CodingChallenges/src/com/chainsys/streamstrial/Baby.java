package com.chainsys.streamstrial;

public class Baby {
    private String babySoap;
    private String babyPowder;
    private  double rupees;
    
    
	public Baby(String babySoap, String babyPowder, double rupees) {
		super();
		this.babySoap = babySoap;
		this.babyPowder = babyPowder;
		this.rupees = rupees;
	}
	public String getBabySoap() {
		return babySoap;
	}
	public void setBabySoap(String babySoap) {
		this.babySoap = babySoap;
	}
	public String getBabyPowder() {
		return babyPowder;
	}
	public void setBabyPowder(String babyPowder) {
		this.babyPowder = babyPowder;
	}
	public double getRupees() {
		return rupees;
	}
	public void setRupees(double rupees) {
		this.rupees = rupees;
	}
	@Override
	public String toString() {
		return "Baby [babySoap=" + babySoap + ", babyPowder=" + babyPowder + ", rupees=" + rupees + "]";
	}
  
  
  
}
