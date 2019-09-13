package Showroom.showroombike;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class BikeModel {
 

@Id
private int production_id;
 private int cc;
 private String model;
 private String fueltype;
 private int milage;
 private String biketype;
 //@ManyToOne
 //@JoinColumn(name="quantity")
 //public ShowroomModel quantity;
 
 


public int getProduction_id() {
	return production_id;
}
public void setProduction_id(int production_id) {
	this.production_id = production_id;
}
public int getCc() {
	return cc;
}
public void setCc(int cc) {
	this.cc = cc;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getFueltype() {
	return fueltype;
}
public void setFueltype(String fueltype) {
	this.fueltype = fueltype;
}
public int getMilage() {
	return milage;
}
public void setMilage(int milage) {
	this.milage = milage;
}
public String getBiketype() {
	return biketype;
}
public void setBiketype(String biketype) {
	this.biketype = biketype;
}

public BikeModel(int production_id, int cc, String model, String fueltype, int milage, String biketype) {
	super();
	this.production_id = production_id;
	this.cc = cc;
	this.model = model;
	this.fueltype = fueltype;
	this.milage = milage;
	this.biketype = biketype;
	
}
@Override
public String toString() {
	return "BikeModel [production_id=" + production_id + ", cc=" + cc + ", model=" + model + ", fueltype=" + fueltype
			+ ", milage=" + milage + ", biketype=" + biketype + ", ]";
}
public BikeModel() {}
public BikeModel(int production_id) {
	super();
	this.production_id = production_id;
}
 
 

}
