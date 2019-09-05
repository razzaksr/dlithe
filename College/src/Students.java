import java.util.*;

public class Students
{
	private String CName;
	private double CGPA;
	private List<String> Skills=new ArrayList<String>();
		
		
	private String Email;
	
	
	public String getCName() {
		return this.CName;
	}
	public void setCName(String cName) {
		this.CName = cName;
	}
	public double getCGPA() {
		return this.CGPA;
	}
	public void setCGPA(double cGPA) {
		this.CGPA = cGPA;
	}
	public List<String> getSkills() {
		return this.Skills;
	}
	public void setSkills(List<String> skills) {
		this.Skills = skills;
	}
	public String getEmail() {
		return this.Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	
	public Students () {}
	
	
	public Students(String cName, float cGPA, List<String> skills, String email) {
		super();
		CName = cName;
		CGPA = cGPA;
		Skills = skills;
		Email = email;
	}
	@Override
	public String toString() {
		return "Students [CName=" + CName + ", CGPA=" + CGPA + ", Skills=" + Skills + ", Email=" + Email + "]";
	}
	


}
