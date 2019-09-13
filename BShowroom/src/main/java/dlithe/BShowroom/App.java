package dlithe.BShowroom;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //SRImplementation sri = new SRImplementation();
       // sri.CreateShowroom();
        //sri.UpdateShowroom();
       // sri.DeleteShowroom();
       // sri.ListShowroom();
       // sri.end();
    	
    	CustomerImplementation ci = new CustomerImplementation();
    	//ci.CreateCustomer();
    	//ci.UpdateCustomer();
    	//ci.DeleteCustomer();
    	ci.ListCustomer();
    	ci.end();
    }
}
