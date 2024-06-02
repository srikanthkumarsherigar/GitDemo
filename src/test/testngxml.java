/*package test;

public class testngxml {      tESTNG FULL CONCEPT
	
	
/*	xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
	<suite name="loandepartment">
	  <test thread-count="8" name="persnalloan">
	    <classes>
	      <class name="test.day1"/>
	      <class name="test.day2"/>
	      <class name="test.day4"/>         include means 1 test case execute    
	    </classes>
	  </test> 
	  <test name="car loan">
		  <classes>
			  <class name="test.day3">
			  <methods>
				  <exclude name="mobilelogincar"/>  excludemeans remaining class except mobilelogin car have 10 testcase 9 are execute
			  </methods>
			  </class>
			  
		  </classes>
		  
		  
		  
		  
		  
		  
	  </test>
	</suite> */
	
	/* this is example for exclude more testcase like 10.20.30 like when apply .* it is exluding for exmple 
	 * you have 100 test case your clint aske exclude only mobile(which is strting letr) like 10 test cast strt with mobile letter then we get 
	 * answer 90 because excuude 10 testcase   then include dead opposite  
	 * 
	 *  
	 *  <class name="test.day3">
	  <methods>
		  <exclude name="mobile.*"/>
	  </methods>
	  </class>
	  
  </classes>*/
	
	
	
	/* 
	 * if u execte all tet case at one go to packege and test all are exected
	 */
	
	
	
	
	/* when get first execte some test case you write @Beforetest  then we get 1 execute that test case
                                                       @AfterTest execte testcase last*/

    /* when we mention @Beforesuite is execte 1st in whole project not class as by test case @aftersuite execute last in whole execution */

   /* @BeforeMethod symbole execute before every test case  in that particular class only continuesly 
    * 1 case                      @Aftermethod dead opposite aafterexecte each test case
    * 2case
    * you mention
    * 3case
    * 4case
    * 5case
    * 
    * 
    * and result
    * youmention ABeforemethod
    * 3case
    * youmention ABeforemethod
    * 4case
    * youmention ABeforemethod
    * 5case
    * youmention ABeforemethod
    * 1case
    * youmention ABeforemethod
    * 2case
    * this is like executed
    */


    /*execute alphabetoc order*/

    /*creat new another testng.xml  
    curser xml 
    rightclicl
    copy
    go to project curser
    rightclick
    paste
    give permisson and click
    finally another xml creted like testng2.xml*/


  /* when u want inside the project like 100 testcassess then u want only 4 by selected then u mention groups and run and incluse 
   * then u get only 4 testcase execute
   * example xml code loke this
   * <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="loandepartment">
  <test thread-count="8" name="regression">
	  <groups>
		  <run>
			   <include name="Smoke"/>  also write exclude executetion all out of smoke 
		  </run>
		   </groups>
    <classes>
      <class name="test.day1"/>
      <class name="test.day2"/>
      <class name="test.day4"/>
      <class name="test.day3"/>
    </classes>
   </test>
</suite> */



 /* we get alphabetic order execution  in class execute separetely mainly depend upon sysopln"a" like sypln"b"
  		so 1st execute a
  		2nd execute b
  		 testcase written is not alphabetically but execte alphabetic */

/*

when u want 1st b then execute a because b is importantn like login so use @Test(dependsOnMethods= {"webloginhomeloan"})
 
public class day4 {
	@Test
	public void webloginhomeloan()                               
	{
		System.out.println("weblogin home");
	}
	@Test
	public void mobileloginhome()
	{
		System.out.println("mobileloginhome");
	}
	@Test(dependsOnMethods= {"webloginhomeloan"})
	public void loginapihomelaon()
	{
		System.out.println("apiloginhome");
	}
	  
	  executon like 
	  mobileloginhome
       weblogin home
       apiloginhome          reverse execute
	  
	 

   */
/*

when u want not execute 1 test case then u mention 
package test;



import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {
	@Test
	public void webloginhomeloan()                               
	{
		System.out.println("weblogin home");
	}
	@Test(enabled=false)
	public void mobileloginhome()
	{
		System.out.println("mobileloginhome");
	}
	@Test(dependsOnMethods= {"webloginhomeloan"})
	public void loginapihomelaon()
	{
		System.out.println("apiloginhome");
	}
}
  execution like  webloginhome
                   apilogin home
                   
                   not wxecute mobileloginhome
                   */

  /*import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

you want some url you mention in xml like qaacdemy it should also execute in execution the testcasses like

	@Test(groups= {"Smoke"})
	public void demo()
	{
		System.out.println("hello");
	}
	@Parameters({"URL"})
	@Test
	public void sri (String urlname)                               
	{
		System.out.println("weblogin home");
		System.out.println(urlname);
	}
	@AfterSuite
	public void secondtest()
{
		System.out.println("bai");
		
		
		
		execution is hello
		weblogin home
		qaacademy
		bai 
		
		
		so cursor on testng.xml whwre u mention like   this is xml file u enterdrvalues
		<?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
		<suite name="loandepartment">
			<parameter name="URL" value="qaacademy"/>
		  <test thread-count="8" name="persnalloan">
		    <classes>
		      <class name="test.day1"/>    you should error when you write testcase in day 2 mainly depend on xml u write day 1 only
		                                   and also write multiple but u shoul follo rules like top line mention that class only should b same
		     
		    </classes>
		 
			  </test>
		</suite> */


/*LISTENERS  CONCEPT
 when u want sucessful fail the test case u want answer you use lisner in xml and in classs also then execte tstcase also fail or scess showing

   XML THIS IS
 <?xml version="1.0" encoding="UTF-8"?>
 <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
 <suite name="loandepartment">
 	
 	<listeners>
 		
 		<listener class-name="test.Listeners"/>
 	</listeners>
 	<parameter name="URL" value="qaacademy"/>
   <test thread-count="8" name="persnalloan">
     <classes> 
       <class name="test.day3"/>
      
     </classes>
  
 	  
 	  
 	  RUN THE PROGRAMME XML WITH TSTNGSUITE
 	  
   </test>
 </suite> 
 
 AND LISTENERS CLASS IS OEN CHECK THE CODE RUN THE PROGRAAMMEE*/


/*PARALLEL COSEPT   <suite name="loandepartment" parallel ="tests" thread-count ="2"> this is testng xml line
	
it is mainly used to run 100 test case in one shot for example 
i have login and run some funstions take time but when u put paralel in xml  take less time run progrme quickely*/

/* YOU WANT RESULTS IN CHROME run the programme refersh the project  
 * testoutput showed click
 * index.html double click  we get answer also rightclick 
 * properties
 * copy htmlurl paste the chrome*/
 */

