package sample;

import java.time.LocalDate;
import java.util.ArrayList;

public class manage implements interfacee {
	ArrayList<inteface1> eve=new ArrayList<inteface1>();//Creating arraylist    
	@Override
	public void insert(inteface1 in) {
		// TODO Auto-generated method stub
		eve.add(in);
	}

	@Override
	public void delet() throws EventNotFoundException {
		// TODO Auto-generated method stub
		if(eve.contains(in))
		{
			eve.remove(in);
		}
		else
		{
			try
			{
				throw new EventNotFoundException("event not found");
			}
			catch(EventNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void update(inteface1 in, String p_name) {
		// TODO Auto-generated method stub
		if(eve.contains(in))
		{
			System.out.println(p_name);
			if(in.getp_name().contains(p_name))
			{
				event.get(event.indexOf(eve).setwinner(p_name));
			}
		}
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
	System.out.println(eve);
		
	}

	@Override
	public void addparticipent(inteface1 in, String p_name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(String date) {
		// TODO Auto-generated method stub
		LocalDate d1=LocalDate.parse(date);
		if(eve.contains(d1))
		{
			System.out.println(eve);
		}
	}

	@Override
	public void delete(inteface1 in) throws EventNotFoundException, participantsNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addparticipent(inteface1 in, String p_name)
			throws EventNotFoundException, participantsNotFoundException {
		// TODO Auto-generated method stub
		
	}

	//@Override
	/*public void delet(event ev, String p_name) {
		// TODO Auto-generated method stub
		
	}*/

}
}
