import java.time.LocalDate;
import java.util.*;
public class EventManagement{
private String EventName;
private LocalDate Date;
private String Dept;
private String Coord;
private String C_ContactInfo;
private String Prize;
private List<String> P_Name;
private String W_Name;
public void setEventName(String EventName) 
{
    this.EventName = EventName;
}
public String getEventName() 
{
    return this.EventName;
}
public void setDate(LocalDate Date) 
{
    this.Date = Date;
}
public LocalDate getDate() 
{
    return this.Date;
}
public void setDept(String Dept) 
{
    this.Dept = Dept;
}
public String getDept() 
{
    return this.Dept;
}
public void setCoord(String Coord) 
{
    this.Coord = Coord;
}
public String getCoord() 
{
    return this.Coord;
}
public void setC_ContactInfo(String C_ContactInfo) 
{
    this.C_ContactInfo = C_ContactInfo;
}
public String getC_ContactInfo() 
{
    return this.C_ContactInfo;
}
public void setPrize(String Prize) 
{
    this.Prize = Prize;
}
public String getPrize() 
{
    return this.Prize;
}
public void setP_Name(List<String> P_Name) 
{
    this.P_Name = P_Name;
}
public List<String> getP_Name() 
{
    return this.P_Name;
}public void setW_Name(String W_Name) 
{
    this.W_Name= W_Name;
}
public String getW_Name() 
{
    return this.W_Name;
}
EventManagement(String EventName,String Date,String Dept,String Coord,String C_ContactInfo,String Prize)
{	
	this.EventName=EventName;
	this.Date=LocalDate.parse(Date);
	this.Dept=Dept;
	this.Coord=Coord;
	this.C_ContactInfo=C_ContactInfo;
	this.Prize=Prize;
}
public String toString() {
	return "EventName=" + EventName + " Date=" + Date + ", Dept=" + Dept + ", Coord=" + Coord
			+ ", C_ContactInfo=" + C_ContactInfo + ", Prize=" + Prize ;
}
/*public static void main(String args[])
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter the event Name:");
	String EName=Sc.nextLine();
	System.out.println("Enter the event Date:");
	String EDate=Sc.nextLine();
	System.out.println("Enter the Department");
	String Dept=Sc.nextLine();
	System.out.println("Enter the event Co-0rdinator Name:");
	String Coord=Sc.nextLine();
	System.out.println("Enter the event Co-ordinator Number:");
	String Enum=Sc.nextLine();
	System.out.println("Enter the event Prize:");
	String EPrize=Sc.nextLine();
	LocalDate LDate=LocalDate.parse(EDate);
	EventManagement E2=new EventManagement(EName,LDate,Dept,Coord,Enum,EPrize);
	System.out.println(E2);
}*/
}