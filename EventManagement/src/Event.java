import java.time.LocalDate;
import java.util.*;

public class Event
{
	//Creating Model Class
	
	private LocalDate date;
	private String EventName;
	private String Department;
	private String Prize;
	private String CoName, CoContact, CoEmail;
	private String Winner;
	private String EventFees;
	private List<String> PName;

	private static Scanner sc;
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void setEventName(String eventname)
	{
		this.EventName = eventname;
	}
	public String getEventName()
	{
		return this.EventName;
	}
	
	public void setDepartment(String department)
	{
		this.Department = department;
	}
	public String getDepartment()
	{
		return this.Department;
	}
	
	public void setPrize(String prize)
	{
		this.Prize = prize;
	}
	public String getPrize()
	{
		return this.Prize;
	}
	
	public void setCoName(String coname)
	{
		this.CoName = coname;
	}
	public String getCoName()
	{
		return this.CoName;
	}
	
	
	public void setCoContact(String cocontact)
	{
		this.CoContact = cocontact;
	}
	public String getCoContact()
	{
		return this.CoContact;
	}
	
	
	public void setCoEmail(String coemail)
	{
		this.CoEmail = coemail;
	}
	public String getCoEmail()
	{
		return this.CoEmail;
	}
	
	
	public void setWinner(String winner)
	{
		this.Winner = winner;
	}
	public String getWinner()
	{
		return this.Winner;
	}
	
	
	public void setEventFees(String eventfees)
	{
		this.EventFees = eventfees;
	}
	public String getEventFees()
	{
		return this.EventFees;
	}
	
	public List<String> getPName() {
		return this.PName;
	}
	public void setPName(List<String> pName) {
		this.PName = pName;
	}
	
	public Event() {}
	
	public Event(String Date, String EventName, String Department, String Prize, String CoName, 
			String CoContact, String CoEmail, String Winner, String EventFees)
	{
		this.date = LocalDate.parse(Date);
		this.EventName = EventName;
		this.Department = Department;
		this.Prize = Prize;
		this.CoName = CoName;
		this.CoContact = CoContact;
		this.CoEmail = CoEmail;
		this.Winner = Winner;
		this.EventFees = EventFees;
	}
	
	
	public String toString()
	{
		return date+ " "
			    +EventName+" "
			    +Department+" "
			    +Prize+" "
			    +CoName+" "
			    +CoContact+" "
			    +CoEmail+" "
			    +Winner+" "
			    +EventFees+"\n";
	}
	
	/*
	 * public static void main(String args[]) {
	 * 
	 * sc = new Scanner(System.in); System.out.println("Enter All The Details");
	 * System.out.println("Enter Date"); String Date = sc.nextLine();
	 * 
	 * System.out.println("Enter EventName"); String EventName = sc.nextLine();
	 * 
	 * 
	 * System.out.println("Enter Department"); String Department = sc.nextLine();
	 * 
	 * 
	 * System.out.println("Enter Prize"); String Prize = sc.nextLine();
	 * 
	 * 
	 * System.out.println("Enter CoName"); String CoName = sc.nextLine();
	 * 
	 * 
	 * System.out.println("Enter CoContact"); String CoContact = sc.nextLine();
	 * 
	 * 
	 * System.out.println("Enter CoEmail"); String CoEmail = sc.nextLine();
	 * 
	 * 
	 * System.out.println("Enter Winner"); String Winner = sc.nextLine();
	 * 
	 * 
	 * System.out.println("Enter EventFees"); String EventFees = sc.nextLine();
	 * LocalDate LDate = LocalDate.parse(Date); Event ev = new Event(LDate,
	 * EventName, Department, Prize, CoName, CoContact, CoEmail, Winner, EventFees);
	 * Event rev = new Event(); rev.setDate(LDate); rev.setEventName(EventName);
	 * rev.setDepartment(Department); rev.setPrize(Prize); rev.setCoName(CoName);
	 * rev.setCoContact(CoContact); rev.setCoEmail(CoEmail); rev.setWinner(Winner);
	 * rev.setEventFees(EventFees); System.out.println(rev); System.out.println(ev);
	 * 
	 * }
	 */
}
