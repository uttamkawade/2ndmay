package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
WebDriver driver;

    //WebElement

   @FindBy(id="email")
   private WebElement username;
   
   
   @FindBy(id="password")
   private WebElement pass;
   
   @FindBy(xpath="//button")
   private WebElement Button;
   
  
	public  Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//methods
	

	
	public void enterUsername(String text) {
		username.sendKeys(text);
	}
	
	public void enterPassword(String text) {
		pass.sendKeys(text);
	}
	public void clickLoginButton() {
		Button.click();
	}
	
	public DashboardPage validLogin(){              // for valid login 
		enterUsername("kiran@gmail.com");           //linking between two coassociate pages
		enterPassword("123456");
		clickLoginButton();
		return new DashboardPage(driver);
	}

}
