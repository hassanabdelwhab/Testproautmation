package adminTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.browser.BrowserFactory;
import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Assertions;
import com.shaft.validation.Assertions.ElementAttributeType;

public class NewTest {
  @Test
  public void mainmethoed() {
	  WebDriver driver = BrowserFactory.getBrowser();                                  //Get Browser
	  
	  BrowserActions.navigateToURL(driver,"http://automationpractice.com/index.php?"); //Open website
	  ElementActions.click(driver, By.partialLinkText("Sign in"));                     // click at sign in
	  waitForLazyLoading();
	  ElementActions.type(driver, By.id("email_create"), "automationtest66@fb2e.site");  // Type email
	  ElementActions.click(driver, By.xpath("//*[@id=\"SubmitCreate\"]/span"));         //Click at Create account 
	  waitForLazyLoading();
	  ElementActions.click(driver, By.id("uniform-id_gender1"));                        // select a Title
	  ElementActions.type(driver, By.id("customer_firstname"), "Hassan");               // Enter First Name
	  ElementActions.type(driver, By.id("customer_lastname"), "Abdelwhab");             // Enter Last Name
	  ElementActions.type(driver, By.id("passwd"), "Selenium@123");                       // Enter Password
	  ElementActions.type(driver, By.id("company"), "Obeikan"); 	                    // Enter Company
	  ElementActions.type(driver, By.id("address1"), "15th st");                        // Enter Address
	  ElementActions.type(driver, By.id("city"), "Tuscaloosa");                         // Enter city
	  waitForLazyLoading();
	  ElementActions.click(driver, By.xpath("//div[@class='selector'][@id='uniform-id_state']"));  // click State 
	  waitForLazyLoading();
	  ElementActions.click(driver, By.xpath("//option[contains(.,'Alaska')]"));          //select Alaska city
	  ElementActions.typeAppend(driver, By.id("postcode"), "99501");                    //Enter Post code
	  ElementActions.type(driver, By.id("phone_mobile"), "01004208223");                //Enter Phone number
	  ElementActions.click(driver, By.xpath("//*[@id=\"submitAccount\"]"));             // Click Register
	  
	  
	  Assertions.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", ElementActions.getText(driver, By.xpath("//p[@class='info-account']")));
	  Assertions.assertElementAttribute(driver, By.xpath("//p[@class='info-account']"), ElementAttributeType.TEXT, "Welcome to your account. Here you can manage all of your personal information and orders.");
	  
	  

  }

private void waitForLazyLoading() {
	// TODO Auto-generated method stub
	
}

	
}

