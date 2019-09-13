package Showroom.showroombike;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class ShowroomModel {
	
	@Id
	private int quantity;
	private String Enginetype;
	private int enginedisplacement;
	private String brake;
	@ManyToOne
	@JoinColumn(name="production_id")
	private BikeModel production_id;
	
	
	public BikeModel getProduction_id() {
		return production_id;
	}
	public void setProduction_id(int Production_id ) {
		this.production_id = production_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getEnginetype() {
		return Enginetype;
	}
	public void setEnginetype(String enginetype) {
		Enginetype = enginetype;
	}
	public int getEnginedisplacement() {
		return enginedisplacement;
	}
	public void setEnginedisplacement(int enginedisplacement) {
		this.enginedisplacement = enginedisplacement;
	}
	public String getBrake() {
		return brake;
	}
	public void setBrake(String brake) {
		this.brake = brake;
	}
	@Override
	public String toString() {
		return "ShowroomModel [quantity=" + quantity + ", Enginetype=" + Enginetype + ", enginedisplacement="
				+ enginedisplacement + ", brake=" + brake + ", production_id=" + production_id + "]";
	}
	
public ShowroomModel(int quantity, String enginetype, int enginedisplacement, String brake,
			BikeModel production_id) {
		super();
		this.quantity = quantity;
		Enginetype = enginetype;
		this.enginedisplacement = enginedisplacement;
		this.brake = brake;
		this.production_id = production_id;
	}
public ShowroomModel(int Production_id) {
	Production_id = Production_id;
}
public  ShowroomModel() {}
}
