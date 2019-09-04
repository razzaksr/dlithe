import org.junit.Assert;
import org.junit.Test;


public class TestSearch 
{
	@Test
	public void testAdd()
	{
		EventCollection e=new EventCollection();
		Event ev=new Event();ev.setWinner("Mohamed");
		e.evs.add(ev);
		Assert.assertEquals("Razak", e.evs.get(e.evs.indexOf(ev)).getWinner());
	}
}
