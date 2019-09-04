import junit.framework.Assert;

import org.junit.Test;


public class TestList 
{
	@Test
	public void testList()
	{
		EventCollection eve=new EventCollection();
		Event e=new Event();Event e1=new Event();
		eve.evs.add(e1);eve.evs.add(e);
		Assert.assertTrue(eve.evs.contains(e1));
		eve.evs.remove(e1);
		Assert.assertTrue(eve.evs.contains(e1));
	}
}
