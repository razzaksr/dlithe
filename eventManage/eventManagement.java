package eventManage;
import java.util.ArrayList;
import java.io.*;
import java.time.LocalDate;
import java.util.*;
class eventManagement implements operate{
	List<event> ev = new ArrayList<>();
	
	
	@Override
	public void insert(event eventName) {
		// TODO Auto-generated method stub
            ev.add(eventName);
	}
	@Override
	public void delete(event eventName) {
		// TODO Auto-generated method stub
		if(ev.contains(eventName))
		{
			ev.remove(eventName);
		}
		else
		{
			System.out.println("Event Not found");
		}
	}
	@Override
	public void create(String Name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(event winner) {
		// TODO Auto-generated method stub
		if(ev.contains(winner)) {
			System.out.println("Winner" + winner);
		}
	}
	@Override
	public void search(LocalDate date) {
		// TODO Auto-generated method stub
		 int index = Collections.binarySearch(ev, date);       
         System.out.println("Date "+ index);  
	}
	@Override
	public void addParticpants(String name, String address, long phone) {
		// TODO Auto-generated method stub
		ev.add(name);
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details");
		
		ev.update(ev.winner);
		
	}
	
}
