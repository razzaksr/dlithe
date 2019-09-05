package sample;

import java.time.LocalDate;
import java.util.*;
public class inteface1 {
private String EventName;
private LocalDate Date;
private String Dept;
private String Coord;
private String C_ContactInfo;
private String Prize;
private String P_Name;
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
public inteface1() {}
inteface1(String EventName,LocalDate Date,String Dept,String Coord,String C_ContactInfo,String Prize)
{
	this.EventName=EventName;
	this.Date=Date;
	this.Dept=Dept;
	this.Coord=Coord;
	this.C_ContactInfo=C_ContactInfo;
	this.Prize=Prize;
}
void Display()
{
	System.out.println("Event Name : "+EventName);
	System.out.println("Date : "+Date);
	System.out.println("Dept : "+Dept);
	System.out.println("Co-ordinator Name : "+Coord);
	System.out.println("Co-ordinator Num : "+C_ContactInfo);
	System.out.println("Prize Pool : "+Prize);
}
public String toString() {
	return "EventManagement [EventName=" + EventName + ", Date=" + Date + ", Dept=" + Dept + ", Coord=" + Coord
			+ ", C_ContactInfo=" + C_ContactInfo + ", Prize=" + Prize + "]";
}
public static void main(String args[])
{
	/*EventManagement E1=new EventManagement("Cricket","11/10/2019","2.30PM","CSE","Madhu","9876543210","5000");
	E1.Display();*/
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
	inteface1 E2=new inteface1 (EName,LDate,Dept,Coord,Enum,EPrize);
	System.out.println(EName+" "+LDate+" "+Dept+" "+Coord+" "+Enum+" "+EPrize);
	E2.setEventName(EName);
	E2.setDate(LDate);
	E2.setDept(Dept);
	E2.setCoord(Coord);
	E2.setC_ContactInfo(Enum);
	E2.setPrize(EPrize);


	
}

}