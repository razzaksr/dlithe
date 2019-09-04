import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.*;
public class Manage implements E1 {
List<EventManagement> Event=new ArrayList<>();

@Override
public void Insert(EventManagement E1) {
	// TODO Auto-generated method stub
	Event.add(E1);
}
@Override
public void Delete(EventManagement E1) throws EventNotFoundException, ParticipantNotFoundException {
	// TODO Auto-generated method stub
	if(Event.contains(E1))
	{
	Event.remove(E1);
	}
	else
	{
		try
		{
		
			throw new EventNotFoundException("Event Not Present");
		}
		catch(EventNotFoundException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
public void Update(EventManagement EName, String P_Name)  {
	// TODO Auto-generated method stub
if(Event.contains(EName))
{
	System.out.println(P_Name);
	if(EName.getP_Name().contains(P_Name))
	{
		Event.get(Event.indexOf(EName)).setW_Name(P_Name);
	}
}
}

@Override
public void List() {
	// TODO Auto-generated method stub
	System.out.println(Event);
}

@Override
public void Search(String Date) {
	// TODO Auto-generated method stub
	LocalDate D1=LocalDate.parse(Date);
	for(EventManagement E1 : Event)
	{
		if(E1.getDate().equals(D1))
		{
			System.out.println(E1);
		}
	}
	
}

@Override
public void Addparticipant(EventManagement EName, String P_Name) throws EventNotFoundException,ParticipantNotFoundException{
	// TODO Auto-generated method stub	
	if(Event.contains(EName))
	{
		Event.get(Event.indexOf(EName)).getP_Name().add(P_Name);
	}
	else
	{
		try
		{
		
			throw new EventNotFoundException("Event Not Present");
		}
		catch(EventNotFoundException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
public static void main(String args[]) throws EventNotFoundException, ParticipantNotFoundException
{
	Scanner Sc=new Scanner(System.in);
	EventManagement S1=new EventManagement("Drag Race","2019-10-11","MECH","Babu","8976543210","20000");
	EventManagement S2=new EventManagement("Cric","2019-10-10","CSE","Abhi","9876543210","5000");
	EventManagement S3=new EventManagement("Chess","2019-10-10","CSE","Manu","1234567890","2000");
	EventManagement S4=new EventManagement("Volley","2019-10-11","ISE","Dhanu","7418529630","10000");	
	Manage M=new Manage();
	M.Insert(S1);
	M.Insert(S2);
	M.Insert(S3);
	M.Delete(S1);
}
}