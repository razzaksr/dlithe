package Showroom.showroombike;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class CustomerImplementation
 {
	SessionFactory factory = null;
	Session session =null;
	

public void CreateCustomer()
{
	/*ShowroomModel sm1=new ShowroomModel(10);
    ShowroomModel sm2=new ShowroomModel(11);
	ShowroomModel sm3=new ShowroomModel(12);
	ShowroomModel sm4=new ShowroomModel(13);
	ShowroomModel sm5=new ShowroomModel(14);*/
	
	factory = new Configuration().configure().buildSessionFactory();
	session = factory.openSession();
	session.beginTransaction();
	
	CustomerModel cm1=new CustomerModel(20,"Manju","Bangalore",890989090);
	CustomerModel cm2=new CustomerModel(22,"yashodha","Chennai",890945673);
	CustomerModel cm3=new CustomerModel(23,"Jatly","Mangalore",907890970);
	CustomerModel cm4=new CustomerModel(24,"Santhosh","pune",987656733);
	CustomerModel cm5=new CustomerModel(25,"Mariala","Shivmoga",890956780);
	
	
}
public void end()
{
	session.getTransaction().commit();
	session.close();
}
}