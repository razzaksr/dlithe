package mockito.dlithe.DlitheMockito;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestClass 
{
	List<Mobile> tempStock=null;Mobile m1=null,m2=null,m3=null,m4=null;
	public TestClass()
	{
		tempStock=new ArrayList<Mobile>();
		m1=new Mobile("6.1", "Nokia", 12, 16700);
		m2=new Mobile("Note3", "Redmi", 34, 11000);
		m3=new Mobile("iPhoneXs", "Apple", 5, 153300);
		m4=new Mobile("7Pro","OnePlus",12,53000);
		tempStock.add(m1);tempStock.add(m2);tempStock.add(m3);tempStock.add(m4);
	}
	@InjectMocks
	Implementation imp=new Implementation();
	@Mock
	StockOperate dlithe;
	@Test
	public void testCreate()
	{
		List donut=null;
		Mockito.when(dlithe.create(tempStock)).thenReturn(true);
		Assert.assertTrue(dlithe.create(tempStock));
		Mockito.verify(dlithe).create(tempStock);
	}
	@Test(expected=RuntimeException.class)
	public void testSum()
	{
		Mockito.when(imp.sum(m1)).thenReturn(imp.sum(m1));
		Assert.assertEquals(dlithe.sum(m1), imp.sum(m1));
		Mockito.verify(dlithe).sum(m1);
	}
	@Test
	public void testRead()
	{Mockito.when(dlithe.read(0)).thenReturn(m1);
	Assert.assertEquals(m1, dlithe.read(0));
	}
	@Test
	public void testList()
	{
		List donut=null;
		Mockito.when(dlithe.list()).thenReturn(tempStock);
		Assert.assertEquals(tempStock, dlithe.list());
		Mockito.verify(dlithe).list();
	}
}
