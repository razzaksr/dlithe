package dlithe.hiber.CRecruitment;

import org.junit.Assert;
import org.junit.Test;

public class TestRead
{
	Corporate c = new Corporate();
	App a = new App();
	@Test
	public void testcreate()
	{
		Assert.assertNotNull(c.getCampus());
	}
	
	@Test
	public void testread()
	{
		Assert.assertNotNull(c.getRole());
	}
	
	@Test
	public void testupdate()
	{
		Assert.assertEquals(c.getExpected(), c);
	}
	
	@Test
	public void delete()
	{
		Assert.assertNull(c.getCampus());
	}
	
	@Test
	public void list()
	{
		Assert.assertNotNull(c);
	}
	
}
