package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class IndexPage
{
	WebDriver driver;

    //WebElement

   @FindBy(partialLinkText="Register")
   private WebElement register;
   
   
   @FindBy(tagName="img")
   private WebElement image;
   
   @FindBy(xpath="//b[text()='Java By Kiran']")
   private WebElement text1;
   
   @FindBy(xpath="//p[contains(text(),'session')]")
   private WebElement text2;
   
   public IndexPage(WebDriver driver){
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }

   
   public Registerpage clickRegisterLink() {
		register.click();
		return new Registerpage(driver);
	}
   
   public void verifyImage() {
	Assert.assertTrue(image.isDisplayed());
	System.out.println("image displyed");
	}
   
   public void verifyboldtext() {
		String a =text1.getTagName();
		Assert.assertEquals(a, "b");
	System.out.println("bold text java by kiran");
		
	}
   public void verifytext() {
		String text =text2.getText();
		Assert.assertEquals(text, "Sign in to start your session");
		System.out.println("text assert");
	}

}
