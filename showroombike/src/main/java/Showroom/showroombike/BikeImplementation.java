package Showroom.showroombike;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class BikeImplementation {
	SessionFactory factory = null;
	Session session =null;

public void CreateBike()
{
	
	factory = new Configuration().configure().buildSessionFactory();
	session = factory.openSession();
	session.beginTransaction();

	BikeModel bm1=new BikeModel(1,400,"Jawa","petrol",20,"caferacer");
	BikeModel bm2=new BikeModel(2,200,"Jawa fortytwo","petrol",15,"american bobber");
	BikeModel bm3=new BikeModel(3,150,"thunderbird","petrol",25,"tracker");
	BikeModel bm4=new BikeModel(4,350,"bullet","petrol",25,"scrambler");
	BikeModel bm5=new BikeModel(5,220,"harley","petrol",10,"europen bobber");
	session.save(bm1);session.save(bm2);session.save(bm3);session.save(bm4);session.save(bm5);
	
	
}
public void UpdateBike()
{
	factory = new Configuration().configure().buildSessionFactory();
	session = factory.openSession();
	session.beginTransaction();
	BikeModel b = (BikeModel)session.get(BikeModel.class, 1);
	b.setModel("chooper");
	session.update(b);

	
}
public void DeleteBike()
{
	factory = new Configuration().configure().buildSessionFactory();
	session = factory.openSession();
	session.beginTransaction();
	
	BikeModel b = (BikeModel)session.get(BikeModel.class, 2);
	session.delete(b);
}
public void ListBike() {
	factory = new Configuration().configure().buildSessionFactory();
	session = factory.openSession();
	session.beginTransaction();
	Query q = session.createQuery("select biketype from BikeModel");
	List<BikeModel> pool = q.list();
	System.out.println(pool);
}

public void end()
{
	session.getTransaction().commit();
	session.close();
}
}