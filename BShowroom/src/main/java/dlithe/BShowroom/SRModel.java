package dlithe.BShowroom;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SRModel 
{
	@Id
	private int BNo;
	private String BName;
	private String Model;
	private double Price;
	private double Milage;
	public int getBNo() {
		return BNo;
	}
	public void setBNo(int bNo) {
		BNo = bNo;
	}
	public String getBName() {
		return BName;
	}
	public void setBName(String bName) {
		BName = bName;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public double getMilage() {
		return Milage;
	}
	public void setMilage(double milage) {
		Milage = milage;
	}
	@Override
	public String toString() {
		return "SRModel [BNo=" + BNo + ", BName=" + BName + ", Model=" + Model + ", Price=" + Price + ", Milage="
				+ Milage + "]";
	}
	public SRModel(int bNo, String bName, String model, double price, double milage) {
		super();
		BNo = bNo;
		BName = bName;
		Model = model;
		Price = price;
		Milage = milage;
	}
	
	public SRModel() {}
	
	public SRModel(int bNo) 
	{
		BNo = bNo;
	}

}
