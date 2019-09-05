package dlithe.hiber.CRecruitment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Entity
@Table
public class Corporate 
{
	@Id
	private String Campus;
	private String Role;
	private int Expected;
	private int HiredCount;
	private String People;
	
	
	public String getCampus() {
		return Campus;
	}
	public void setCampus(String campus) {
		Campus = campus;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public int getExpected() {
		return Expected;
	}
	public void setExpected(int expected) {
		Expected = expected;
	}
	public int getHiredCount() {
		return HiredCount;
	}
	public void setHiredCount(int hiredCount) {
		HiredCount = hiredCount;
	}
	public String getPeople() {
		return People;
	}
	public void setPeople(String people) {
		People = people;
	}
	
	
	
	@Override
	public String toString() {
		return "Corporate [Campus=" + Campus + ", Role=" + Role + ", Expected=" + Expected + ", HiredCount="
				+ HiredCount + ", People=" + People + "]";
	}
	
	
	
	public Corporate() {}
	
	
	public Corporate(String campus, String role, int expected, int hiredCount, String people) {
		super();
		Campus = campus;
		Role = role;
		Expected = expected;
		HiredCount = hiredCount;
		People = people;
	}
	
}
