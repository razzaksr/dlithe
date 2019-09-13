package dlithe.BShowroom;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CustomerImplementation 
{
	SessionFactory factory= null;
	Session session=null;
	
	public void end()
	{
		session.getTransaction().commit();
		session.close();
	}
	
	public void CreateCustomer()
	{
		factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		session.beginTransaction();
		
		SRModel s1 = new SRModel(1);
		SRModel s2 = new SRModel(2);
		SRModel s3 = new SRModel(3);
		SRModel s4 = new SRModel(4);
		SRModel s5 = new SRModel(5);
		SRModel s6 = new SRModel(6);
		SRModel s7 = new SRModel(7);
	
		
		CustomerModel m1 = new CustomerModel(1, "Preston", "9980653737", "2019-09-11", s1);
		CustomerModel m2 = new CustomerModel(2, "Pawan", "8660324905", "2019-08-12", s2);
		CustomerModel m3 = new CustomerModel(3, "Jagan", "8845796210", "2019-06-21", s3);
		CustomerModel m4 = new CustomerModel(4, "Raghav", "9965821034", "2019-08-31", s4);
		CustomerModel m5 = new CustomerModel(5, "Anirudh", "7785699890", "2019-09-10", s5);
		CustomerModel m6 = new CustomerModel(6, "Anish", "9965220013", "2019-09-01", s6);
		CustomerModel m7 = new CustomerModel(7, "Akshay", "9988554289", "2019-07-05", s7);
		session.save(m1);session.save(m2);session.save(m3);session.save(m4);
		session.save(m5);session.save(m6);session.save(m7);
	}
	
	public void UpdateCustomer()
	{
		factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		session.beginTransaction();
		
		CustomerModel c1 =(CustomerModel)session.get(CustomerModel.class, 4);
		c1.setCName("Vijaykumar");
		session.update(c1);
	}
	
	public void DeleteCustomer()
	{
		factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		session.beginTransaction();
		
		CustomerModel c1 =(CustomerModel)session.get(CustomerModel.class, 7);
		session.delete(c1);
	}
	
	public void ListCustomer()
	{
		factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		session.beginTransaction();
		
		Query q = session.createQuery("from CustomerModel");
		List<CustomerModel> pool = q.list();
		System.out.println(pool);
		
	}

}
