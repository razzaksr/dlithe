package dlithe.BShowroom;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SRImplementation 
{
	SessionFactory factory= null;
	Session session=null;
	
	public void end()
	{
		session.getTransaction().commit();
		session.close();
	}
	
	public void CreateShowroom()
	{
		factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		session.beginTransaction();
		
		SRModel s1 = new SRModel(1, "Suzuki Gixxer", "SF250", 197000.00, 30.00);
		SRModel s2 = new SRModel(2, "Suzuki Gixxer", "250", 159000.00, 26.10);
		SRModel s3 = new SRModel(3, "Suzuki Intruder", "150", 103000.00, 44.00);
		SRModel s4 = new SRModel(4, "Suzuki Gixxer", "SF Fi", 103000.00, 48.00);
		SRModel s5 = new SRModel(5, "Suzuki Intruder", "150 Fi", 110000.00, 20.00);
		SRModel s6 = new SRModel(6, "Suzuki GSX", "S750", 752000.00, 42.00);
		SRModel s7 = new SRModel(7, "Suzuki GSX", "S1000F", 1279000.00, 25.00);
		SRModel s8 = new SRModel(8, "Suzuki", "RM-Z450", 837000.00, 30.00);
		session.save(s1);session.save(s2);session.save(s3);session.save(s4);
		session.save(s5);session.save(s6);session.save(s7);session.save(s8);
	}
	
	public void UpdateShowroom()
	{
		factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		session.beginTransaction();
		
		SRModel s1 =(SRModel)session.get(SRModel.class, 1);
		s1.setPrice(200000.00);
		session.update(s1);
	}
	
	public void DeleteShowroom()
	{
		factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		session.beginTransaction();
		
		SRModel s1 =(SRModel)session.get(SRModel.class, 8);
		session.delete(s1);
	}
	
	public void ListShowroom()
	{
		factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		session.beginTransaction();
		
		Query q = session.createQuery("from SRModel");
		List<SRModel> pool = q.list();
		System.out.println(pool);
		
	}
}
