package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {
	WebDriver driver;
	
	@FindBy(id="name")
	private WebElement name;
	
	@FindBy(id="mobile")
	private WebElement mobile;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//button")
	private WebElement button;
	
	public Registerpage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//method
	public void entername(String text){
		name.sendKeys(text);
	}

	public void entermobile(String text){
		mobile.sendKeys(text);
	}

	public void enteremail(String text){
		email.sendKeys(text);
	}
	

	public void enterpass(String text){
		password.sendKeys(text);
	}
	

	public void clickbutton(){
		button.click();
	}

}
