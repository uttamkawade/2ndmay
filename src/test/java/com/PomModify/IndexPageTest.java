package com.PomModify;

import java.io.FileInputStream;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.IndexPage;
import com.pages.Registerpage;

import jxl.Sheet;
import jxl.Workbook;

public class IndexPageTest {
	WebDriver driver;
	IndexPage ip;
	Registerpage rp; 
	

	@BeforeSuite
	public void setUp() {
		driver= TestBase.initialization();
		ip= new IndexPage(driver);

	}
   @AfterSuite
   public void closepage(){
	   driver.close();
   }
   
   @Test(priority =1)
   public void indextestcase()  throws Exception {
	  
	   ip.verifyboldtext();
	   ip.verifyImage();
	   ip.verifytext();
	   Thread.sleep(2000);
	 
   }
   
   @Test(dataProvider = "signinData")
  	public void registersignin(String name,String mobile,String email,String password) throws Exception{
	   rp= ip.clickRegisterLink();
	   rp.entername(name);
	   rp.entermobile(mobile);
	   rp.enteremail(email);
	   rp.enterpass(password);
	   rp.clickbutton();
	  
  	  	  Alert al =driver.switchTo().alert();   //Alert Test case
  	  	  Thread.sleep(1000);
  	  	  System.out.println(al.getText());
  	  	  al.accept();
  	  	  
  	  	 Thread.sleep(1000);
  	  	 driver.navigate().back();
  	  	  
  	  	 
  }
      @DataProvider
  	  public Object[][] signinData() throws Exception {
  		FileInputStream fis =new FileInputStream("newReg.xls");
  		Workbook workbook = Workbook.getWorkbook(fis);
  		Sheet sh = workbook.getSheet("Register");
  		String dataArr[][]= new String[sh.getRows()-1][sh.getColumns()];
  		for(int i=1;i<sh.getRows();i++) {
  			for(int j=0;j<sh.getColumns();j++) {
  				String data=sh.getCell(j,i).getContents();	
  				dataArr[i-1][j]=data;
  			}
  		}
  		return dataArr;
      }
   }
	

