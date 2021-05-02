package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	WebDriver driver;
	@FindBy(linkText="LOGOUT")
	private WebElement logout;
	
	@FindBy(xpath="//button[text()='Add User']")
	private WebElement AddUser;
	
	public UserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public AddUserPage clickAdduser(){
		AddUser.click();
		return new AddUserPage(driver);
	}

}
