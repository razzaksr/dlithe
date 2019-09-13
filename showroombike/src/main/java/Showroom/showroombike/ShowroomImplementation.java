package Showroom.showroombike;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ShowroomImplementation {
	SessionFactory factory = null;
	Session session =null;

public void Createshowroom()
{
	BikeModel bm1=new BikeModel(1);
	BikeModel bm2=new BikeModel(2);
	BikeModel bm3=new BikeModel(3);
	BikeModel bm4=new BikeModel(4);
	BikeModel bm5=new BikeModel(5);

	factory = new Configuration().configure().buildSessionFactory();
	session = factory.openSession();
	session.beginTransaction();
	
	ShowroomModel sm1=new ShowroomModel(10,"vertical",100,"disc",bm1);
	ShowroomModel sm2=new ShowroomModel(11,"horizontal",200,"antilocksdisc",bm2);
	ShowroomModel sm3=new ShowroomModel(12,"vert-hort",150,"disc",bm3);
	ShowroomModel sm4=new ShowroomModel(13,"vertical",250,"emergencydisc",bm4);
	ShowroomModel sm5=new ShowroomModel(14,"slant",100,"drumdisc",bm5);
	session.save(sm1);session.save(sm2);session.save(sm3);session.save(sm4);session.save(sm5);
}
public void Updateshowroom()
{
	
	factory = new Configuration().configure().buildSessionFactory();
	session = factory.openSession();
	session.beginTransaction();
	ShowroomModel b = (ShowroomModel)session.get(ShowroomModel.class, 10);
	b.setBrake("drum");
	session.update(b);
	
}

public void Deleteshowroom()
{
	factory = new Configuration().configure().buildSessionFactory();
	session = factory.openSession();
	session.beginTransaction();
	
	ShowroomModel s = (ShowroomModel)session.get(ShowroomModel.class, 11);
	session.delete(s);
}

public void Listshowroom() 
{
	factory = new Configuration().configure().buildSessionFactory();
	session = factory.openSession();
	session.beginTransaction();
	Query q = session.createQuery("select brake from ShowroomModel");
	List<ShowroomModel> pool = q.list();
	System.out.println(pool);
}
public void end()
{
	session.getTransaction().commit();
	session.close();
}
	
}
