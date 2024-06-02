package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	@Test(groups= {"Smoke"})
	public void demo()
	{
		System.out.println("hello");
	}
	/*@Parameters({"URL"})
	@Test
	public void sri (String urlname)                               
	{
		System.out.println("weblogin home");
		System.out.println(urlname);
	}*/
	
	public void secondtest()
{
		System.out.println("bai");
		
}
	
}
