package com.sonata.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product {
	@Id
	long pId;
	String pName;
	double pPrice;
	Product(){
		
	}
	public Product(int pId, String pName, double pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
	}
	public long getpId() {
		return pId;
	}
	public void setpId(long l) {
		this.pId = l;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
	
}
