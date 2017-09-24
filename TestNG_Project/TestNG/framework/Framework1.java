package framework;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Framework1 {

	@BeforeSuite
	
	public void beforesuite()
	{
		System.out.println("I am the first");
		
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("I am the last");
		
	}
	
	
	
}
