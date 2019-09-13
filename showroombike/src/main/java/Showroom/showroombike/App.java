package Showroom.showroombike;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome" );
        BikeImplementation b=new BikeImplementation();
        b.CreateBike();
        //b.UpdateBike();
        //b.DeleteBike();
        //b.ListBike();
        ShowroomImplementation i=new ShowroomImplementation();
        i.Createshowroom();
       // i.Updateshowroom();
      //i.Deleteshowroom();
        //i.Listshowroom();
        i.end();
        b.end();
      // CustomerImplementation c=new CustomerImplementation();
        //c.CreateCustomer();
        //c.end();
    }
}
