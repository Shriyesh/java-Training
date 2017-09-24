package framework;

import org.testng.annotations.Test;

public class Framework2 {
	@Test(groups={"Priority1"})
	public void testcase2()
	{
		System.out.println("Test case 2");
		
	}
	
	@Test(dependsOnMethods={"testcase2"})
	public void testcase1()
	{
		System.out.println("Test case 1");
		
	}

	@Test(enabled=false)
	public void testcase3()
	{
		System.out.println("Test case 3");
		
	}	
}
