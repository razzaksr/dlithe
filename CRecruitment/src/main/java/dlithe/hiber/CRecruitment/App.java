package dlithe.hiber.CRecruitment;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class App 
{
	SessionFactory factory = null;
	Session session =null;
	
	public App()
	{
		System.out.println("Welcome to Recruitment Process");
    	factory = new Configuration().configure().buildSessionFactory();
    	session = factory.openSession();
    	session.beginTransaction();
	}
	
	Corporate c =new Corporate();
	
	public void create()
	{
		  Corporate c1 = new Corporate("Infi", "Java Developer", 3, 3, "Nishita, Pawan, Sohan"); 
		  Corporate c2 = new Corporate("Hero", "Developer", 2, 1, "Preston"); 
		  Corporate c3 = new Corporate("Neslet", "Analyst", 2, 2, "Mahananda, Likith"); 
		  Corporate c4 = new Corporate("Yardley", "Designer", 2, 2, "Vijeetha, Mahantesh"); 
		  session.save(c1); session.save(c2);
		  session.save(c3); session.save(c4);
	}
	
	public void read()
	{
		Corporate c=(Corporate)session.get(Corporate.class, "Honda");
		System.out.println(c);
	}
	
	public void update()
	{
		Corporate c=(Corporate)session.get(Corporate.class, "Infosys");
		c.setExpected(2); 
		session.update(c);
	}
	
	public void delete()
	{
		 Corporate c=(Corporate)session.get(Corporate.class, "Honda");
		 session.delete(c);
	}
	
	public void list()
	{
		Query q = session.createQuery("select People from Corporate");
    	List<Corporate> pool = q.list();
    	System.out.println(pool);
	}
	
	public void find()
	{
		System.out.println();
    	System.out.println();
    	Query q=session.createQuery("from Corporate where role='Analyst' and HiredCount=Expected");
    	List<Corporate> qu = q.list();
    	System.out.println(qu);
    	
	}

	public void end()
	{
		session.getTransaction().commit();
    	session.close();
	}
	
    public static void main( String[] args )
    {   
    	App a = new App();
    	a.create();
    	a.read();
    	a.update();
    	a.delete();
    	a.list();
    	a.find();
    	Result res=JUnitCore.runClasses(TestRead.class);
    	List<Failure> fails=res.getFailures();
    	for(Failure fail:fails) {System.out.println(fail.toString());}
    	System.out.println(res.wasSuccessful());
    	a.end();
    }
}
