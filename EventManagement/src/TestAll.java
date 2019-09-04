import org.junit.Assert;
import org.junit.Test;


public class TestAll 
{
	@Test
	public void testSimple()
	{
		Event e=new Event();e.setEventName("Workshop");
		Assert.assertEquals("Workshop", e.getEventName());		
	}
	@Test
	public void testToString()
	{
		Event e=new Event();
		e.setPrize("9800");e.setCoName("Vijay");
		Assert.assertEquals("9800 Vijay", e.toString());
	}
	@Test
	public void testEmpty()
	{
		EventCollection eve=new EventCollection();
		Assert.assertNotNull(eve.evs);
	}
	@Test
	public void testSome()
	{
		EventCollection eve=new EventCollection();
		Event e=new Event();
		e.setPrize("9800");e.setCoName("Vijay");
		eve.evs.add(e);
		Assert.assertTrue(eve.evs.contains(e));
	}
}