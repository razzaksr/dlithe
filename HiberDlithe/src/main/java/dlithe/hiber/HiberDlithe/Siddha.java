package dlithe.hiber.HiberDlithe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctors")
public class Siddha 
{
	@Column(name="name")
	private String docName;
	@Column(name="address")
	private String docAddress;
	@Column(name="contact")
	private Long docContact;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer docId;
	public Siddha() {}
	public Siddha(String a,String b,Long c)
	{docName=a;docAddress=b;docContact=c;}
	public String toString()
	{return docName+" "+docAddress+" "+docContact+" "+docId+"\n";}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getDocAddress() {
		return docAddress;
	}
	public void setDocAddress(String docAddress) {
		this.docAddress = docAddress;
	}
	public Long getDocContact() {
		return docContact;
	}
	public void setDocContact(Long docContact) {
		this.docContact = docContact;
	}
	public Integer getDocId() {
		return docId;
	}
	public void setDocId(Integer docId) {
		this.docId = docId;
	}
}
