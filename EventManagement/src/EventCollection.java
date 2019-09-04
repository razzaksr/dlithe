import java.time.LocalDate;
import java.util.*;

public class EventCollection implements EventInterface 
{

	List<Event> evs= new ArrayList<>();
	@Override
	public void insert(Event a) {
		// TODO Auto-generated method stub
		evs.add(a);
	}

	@Override
	public void delete(Event a) throws EventNotFoundException,ParticipantNotFoundException {
		// TODO Auto-generated method stub
		if(evs.contains(a))
		{
			evs.remove(a);
		}
		else
		{
			try
			{
				throw new EventNotFoundException("Event not present");
			}
			catch(EventNotFoundException ex)
			{
				System.out.println(ex.getMessage());
			}
		}
	}

	@Override
	
		public void update(Event EventName, String PName) {
			// TODO Auto-generated method stub
			if(evs.contains(EventName))
			{
				System.out.println(PName);
				if(EventName.getPName().contains(PName))
				{evs.get(evs.indexOf(EventName)).setWinner(PName);}
			}
		}


	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println(evs);
	}

	@Override
	public void addParticipant(Event EventName, String PName)  throws EventNotFoundException,ParticipantNotFoundException {
		// TODO Auto-generated method stub
		if(evs.contains(EventName))
		{
			evs.get(evs.indexOf(EventName)).getPName().add(PName);
		}
		else
		{
			try
			{
				throw new EventNotFoundException("Event not present");
			}
			catch(EventNotFoundException ex)
			{
				System.out.println(ex.getMessage());
			}
			
		}
	}

	@Override
	public void search(String Date) {
		// TODO Auto-generated method stub
	LocalDate D1 = LocalDate.parse(Date);
	for(Event e:evs)
	{
		if(e.getDate().equals(D1))
		{
			System.out.println(e);
		}
	}
	}
	public static void main(String[] args) throws EventNotFoundException, ParticipantNotFoundException {
		Event e1 = new Event("2000-03-21", "PPT", "CSE", "5000", "vijay", "9535470585", "vijay@gmail.com", "Preston", "500");
		Event e2 = new Event("2000-03-24", "cricket", "CSE", "5000", "Anirudh", "9535470455", "anirudh@gmail.com", "vijay", "500");
		Event e3 = new Event("2000-04-25", "Kabaddi", "Cse", "5000", "Preston", "9535478653", "preston@gmail.com", "Anirudh", "500");
		Event e4 = new Event("2000-03-20", "Hackton", "CSE", "5000", "Ashwini", "9535470500", "Ashwini@gmail.com", "Pawan", "500");
		EventCollection ec = new EventCollection();
		ec.insert(e1);
		ec.insert(e2);
		ec.insert(e3);
		ec.delete(e3);
		ec.list();
	}

}
