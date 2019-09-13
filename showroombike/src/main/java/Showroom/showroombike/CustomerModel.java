package Showroom.showroombike;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class CustomerModel {
	@Id
	private int  cust_no;
	private String name;
	private String address;
	private int phoneno;
	//@OneToMany
	//@JoinColumn(name="quantity")
	//private ShowroomModel quantity;
	
	
	public int getCust_no() {
		return cust_no;
	}
	public void setCust_no(int cust_no) {
		this.cust_no = cust_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	
	@Override
	public String toString() {
		return "CustomerModel [cust_no=" + cust_no + ", name=" + name + ", address=" + address + ", phoneno=" + phoneno
				+ ", ]";
	}
	public CustomerModel(int cust_no, String name, String address, int phoneno) {
		super();
		this.cust_no = cust_no;
		this.name = name;
		this.address = address;
		this.phoneno = phoneno;
		
	}
	
	public CustomerModel() {}
	
	
	
	

}
