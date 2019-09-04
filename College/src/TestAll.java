import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class TestAll 
{
	//Comparing with the name
	@Test
	public void example()
	{
		Students s=new Students();
		s.setCName("VIJAYKUMAR");
		Assert.assertEquals("VIJAYKUMAR", s.getCName());		
	}
	
	
	//checking that it includes skill python or not
	@Test
	public void testSkill()
	{
		Students s=new Students();
		s.getSkills().add("Java");s.getSkills().add("python");
		Assert.assertTrue(s.getSkills().contains("python"));
	}
	
	//checking the cgpa is >=8.9
	//This testcase will produce an error.
	@Test
	public void testCGPA()
	{
		Students s1=new Students();
		Students s2=new Students();
		Students s3=new Students();
		Students s4=new Students();
		s1.setCName("Anirudh");s1.setCGPA(8.9); Warehouse.stu.add(s1);
		s2.setCName("Pawan");s2.setCGPA(7.5);Warehouse.stu.add(s2);
		s3.setCName("Geethanjali");s3.setCGPA(9.2);Warehouse.stu.add(s3);
		s4.setCName("Preston");	s4.setCGPA(8.5);
		Warehouse.stu.add(s4); 
		for(Students s:Warehouse.stu)
		{
			Assert.assertTrue(s.getCGPA()>=8.9);
		}
	}
	
	
	// Checking the size is empty or not. 
	@Test
	public void WSize()
	{
		Assert.assertEquals(0, Warehouse.stu.size());
		
	}
	
	//desired object need to removed is present in list or not
	@Test
	public void Wdetach()
	{
		Students s1=new Students();
		s1.setCName("VIJAYKUMAR");
		//Assert.assertTrue(s1.getCName().contains("VIJAYKUMAR"));
		Assert.assertFalse(Warehouse.stu.contains(s1));
		Warehouse.stu.remove(s1);
	}
	
	//Updating the candidate value which is detached.
	@Test
	public void WdetachUpdate()
	{
		Students s1=new Students();
		s1.setCName("VIJAYKUMAR");
		//Assert.assertTrue(s1.getCName().contains("VIJAYKUMAR"));
		Assert.assertFalse(Warehouse.stu.contains(s1));
		Warehouse.stu.remove(s1);
		s1.getSkills().add("Oops");
		
	}
	
}
