package eventManage;
import java.time.*;
import java.io.*; 
import java.util.*;
public interface operate {
	public  void insert(event eventName);
	public  void delete(event eventName);
	public  void create( Name);
	public  void update(event winner);
	public  void search(LocalDate date);
	public  void addParticpants(String name, String address, long phone);
	
	

}

