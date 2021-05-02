package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddUserPage {
	WebDriver driver;
	
	
	@FindBy(id="username")
	private WebElement uname;
	
	@FindBy(id="mobile")
	private WebElement mobile;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="course")
	private WebElement course;
	
	@FindBy(id="Male")
	private WebElement male;
	
	@FindBy(id="Female")
	private WebElement female;
	
	@FindBy(xpath="//select")
	private WebElement state;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(xpath="//button")
	private WebElement button;
	
	
	public AddUserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUname(String Text){
		uname.sendKeys(Text);
	}
	
	public void entermobile(String Text){
		mobile.sendKeys(Text);
	}
	public void enteremail(String Text){
		email.sendKeys(Text);
	}
	public void entercourse(String Text){
		course.sendKeys(Text);
	}
	
	//gender click
	public void clickGender(String gender){
		if(gender.equals("Male"))
			male.click();
		else
			female.click();
	}
	
	//select state
	public void selectByState(String statename){
		Select select = new Select(state);
		select.selectByVisibleText(statename);
	}
	
	public void enterpass(String Text){
		pass.sendKeys(Text);
	}
	
	public void clicksubmiit(){
		button.click();
	}
	
	
	
	
	
}
