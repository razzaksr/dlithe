import java.util.List;

import org.junit.internal.runners.statements.Fail;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class Report 
{
	public static void main(String[] args) 
	{
		Result res=JUnitCore.runClasses(MergeAll.class);
		List<Failure> fail=res.getFailures();
		for(Failure f:fail)
		{
			System.out.println(f.toString());
		}
		System.out.println(res.wasSuccessful());
	}
}
