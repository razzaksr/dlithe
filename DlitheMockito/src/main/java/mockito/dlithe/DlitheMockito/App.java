package mockito.dlithe.DlitheMockito;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Result res=JUnitCore.runClasses(TestClass.class);
        List<Failure> fails=res.getFailures();
        for(Failure fa:fails) {System.out.println(fa.toString());}
        System.out.println(res.wasSuccessful());
    }
}
