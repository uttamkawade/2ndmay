package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	 WebDriver driver;
		@FindBy(linkText="LOGOUT")
		private WebElement logout;
		
		@FindBy(xpath="//span[text()='Users']")
		private WebElement User;
		
		public DashboardPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		public void clickLogout() {
			logout.click();
		}
		
		public UserPage clickUser(){
			User.click();
			return new UserPage(driver);
		}


}
