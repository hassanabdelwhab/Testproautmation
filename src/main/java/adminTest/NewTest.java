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
	  
	  BrowserActions.navigateToURL(driver, "https://opensource-demo.orangehrmlive.com/");//Open website
	  ElementActions.typeAppend(driver, By.id("txtUsername"), "Admin");                 // Enter user name 
	  ElementActions.typeAppend(driver, By.id("txtPassword"), "admin123");              // Enter pass word
	  ElementActions.click(driver, By.id("btnLogin"));                                  // Click at login
	  ElementActions.click(driver, By.xpath("//b[contains(.,'Admin')]"));               //click at admin
	  ElementActions.click(driver, By.id("menu_admin_UserManagement"));                 // click at UserManagement
	  ElementActions.click(driver,By.id("menu_admin_viewSystemUsers"));                 // click at users
	  ElementActions.click(driver, By.id("btnAdd"));                                    //click At add
	  ElementActions.type(driver,By.id("systemUser_employeeName_empName"), "Hassan Mohammed Abdelwhab");   //Enter Employee Name
	  ElementActions.type(driver,By.id("systemUser_userName"), "Hassan2");				//Enter user name
	  ElementActions.type(driver, By.id("systemUser_password"), "OrangeHrm@123");			// Enter Pass
	  ElementActions.type(driver, By.id("systemUser_confirmPassword"), "OrangeHrm@123");   //Enter confirm pass
	  ElementActions.click(driver, By.id("btnSave")); 									//click at save 	
	  ElementActions.type(driver, By.id("searchSystemUser_userName"), "Hassan2");        //search by name 
	  ElementActions.click(driver, By.id("searchBtn"));  								// click at search 
	  ElementActions.click(driver, By.xpath("//a[contains(.,'Hassan2')]")); 			//open searh result 
	  Assertions.assertElementAttribute(driver, By.id("systemUser_userName"), ElementAttributeType.TEXT,"Hassan2"); //check name as enter or not  
	  
	  

  }

	
}

