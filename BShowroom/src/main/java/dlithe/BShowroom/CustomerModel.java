package dlithe.BShowroom;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CustomerModel 
{
	@Id
	private int CId;
	private String CName;
	private String Contact;
	private LocalDate Date;
	@ManyToOne
	@JoinColumn(name="BNo")
	private SRModel BNo;
	
	public int getCId() {
		return CId;
	}
	public void setCId(int cId) {
		CId = cId;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	public SRModel getBNo() {
		return BNo;
	}
	public void setBNo(SRModel bNo) {
		BNo = bNo;
	}
	@Override
	public String toString() {
		return "CustomerModel [CId=" + CId + ", CName=" + CName + ", Contact=" + Contact + ", Date=" + Date + ", BNo="
				+ BNo + "]";
	}
	public CustomerModel(int cId, String cName, String contact, String date, SRModel bNo) {
		super();
		CId = cId;
		CName = cName;
		Contact = contact;
		Date = LocalDate.parse(date);
		this.BNo = bNo;
	}
	
	public CustomerModel() {}
	
}
