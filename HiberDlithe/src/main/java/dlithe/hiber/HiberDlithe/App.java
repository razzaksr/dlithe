package dlithe.hiber.HiberDlithe;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Dlithe Siddha Clinic" );
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        session.beginTransaction();
        
        /*Siddha sid1=new Siddha("Aadharsh","Satellite, Bangalore",146823L);
        Siddha sid2=new Siddha("Mahesh","JeyNagar, Bangalore",76567890L);
        Siddha sid3=new Siddha("Vikram","Moodbidri, Mangalore",3456789L);
        Siddha sid4=new Siddha("Prem","Ujire, Dharmasthshala",987656789L);
        session.save(sid1);session.save(sid2);session.save(sid3);session.save(sid4);// insertion>> create*/
        
        //Siddha temp=(Siddha)session.get(Siddha.class, 3);// read
        //System.out.println(temp);
        //temp.setDocAddress("Bhanshankari, Bangalore");// update
        //session.update(temp);//update
        
        /*Siddha temp=(Siddha)session.get(Siddha.class, 6);// read
        session.delete(temp);// delete*/
        
        Query qry=session.createQuery("select docName from Siddha");
        List<String> pool=qry.list();
        System.out.println(pool);
        
        qry=session.createQuery("from Siddha where docAddress like '%Bangalore'");
        List<Siddha> pools=qry.list();
        for(Siddha sid:pools) {System.out.println(sid.getDocName()+" "+sid.getDocContact());}
        
        System.out.println("All ");
        qry=session.createQuery("from Siddha");
        pools=qry.list();
        for(Siddha sid:pools) {System.out.println(sid);}
        
        Scanner scan=new Scanner(System.in);
        int id1=scan.nextInt();int id2=scan.nextInt();
        
        System.out.println("Dynamic query ");
        qry=session.createQuery("from Siddha where docId between ?1 and ?2");
        qry.setInteger(1, id1);qry.setInteger(2, id2);
        pools=qry.list();
        for(Siddha sid:pools) {System.out.println(sid);}
        
        session.getTransaction().commit();
        session.close();
    }
}
