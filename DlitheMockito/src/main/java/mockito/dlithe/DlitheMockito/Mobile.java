package mockito.dlithe.DlitheMockito;

public class Mobile
{
	private String model, brand;
	private int qty, price;
	public Mobile() {}
	public Mobile(String a, String b, int c, int d) 
	{model=a;brand=b;qty=c;price=d;}
	public String toString() {return model+" "+brand+" "+qty+" "+price+"\n";}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
