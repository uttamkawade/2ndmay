package com.PomModify;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.AddUserPage;
import com.pages.DashboardPage;
import com.pages.Loginpage;
import com.pages.UserPage;

public class AdduserTest {
	WebDriver driver;
	Loginpage lp;
	DashboardPage dp;
	UserPage up;
	AddUserPage ap;
	
	

	@BeforeSuite
	public void setUp() {
		driver= TestBase.initialization();
		lp= new Loginpage(driver);

	}
   @AfterSuite
   public void closepage(){
	   driver.close();
	  
   }
   
   @Test(priority= 2)
   public void adduser() throws Exception{
	   dp=lp.validLogin();     // By using linking achieve this
	   up=dp.clickUser();
	   ap=up.clickAdduser();
	   ap.enterUname("Uttam Kawde");
	   ap.entermobile("7218991947");
	   ap.enteremail("kuttamkawade@gmail.com");
	   ap.entercourse("java");
	   ap.clickGender("Male");
	   ap.selectByState("Maharashtra");
	   ap.enterpass("123456");
	   ap.clicksubmiit();
	   Thread.sleep(1000);
	   Alert alert =driver.switchTo().alert();
	   alert.accept();
	 
   }
}
