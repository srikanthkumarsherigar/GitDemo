package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@Test
	public void weblogincarloan()
	{
		System.out.println("weblogin car");
	}
	@BeforeMethod
	public void sri()
	{
		System.out.println("iam execute before every test method in day 3");
	}
	@Parameters({"URL"})
	@Test
	public void sri (String urlname)                               
	{
		System.out.println("webloging home");
		System.out.println(urlname);
	}
	@Test
	public void mobilelogincar()
	{
		System.out.println("mobilelogincar");
		
	}
	@Test(groups= {"Smoke"})
	public void mobileshop()
	{
		System.out.println("mobileshop");
	}
	@Test
	public void loginapicarlaon()
	{
		System.out.println("apilogincar");  //when yo want separe class ten u remove that class in tsting.xml
	}
}
