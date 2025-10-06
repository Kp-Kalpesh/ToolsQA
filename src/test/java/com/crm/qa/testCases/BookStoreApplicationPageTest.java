package com.crm.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AlertsFrameAndWindowsPage;
import com.crm.qa.pages.BookStoreApplicationPage;
import com.crm.qa.pages.ElementsPage;
import com.crm.qa.pages.FormsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.InteractionPage;
import com.crm.qa.pages.WidgetsPage;

public class BookStoreApplicationPageTest extends TestBase{

	HomePage homepg;
	ElementsPage elepg;
	FormsPage frmPg;
	AlertsFrameAndWindowsPage altpg;
	WidgetsPage widpg;
	InteractionPage interpg;
	BookStoreApplicationPage bookstrapg;


	public BookStoreApplicationPageTest() {
		super();
	}


	@BeforeMethod
	public void setup() {
		initialization();
		homepg = new HomePage();
		elepg = homepg.clickOnElements();
		frmPg = elepg.clickOnFormsBtn();
		altpg = frmPg.clickOnAlertsFramesAndwindowsTab();
		widpg = altpg.clickOnWidgetsTab();
		interpg = widpg.clickOnInteractionTab();
		bookstrapg = interpg.clickOnBookStoreApp();

	}


	//The code is Register user but it will get the captcha and we 
	//can't able to automate the captcha so u need to write a whole script for login user
	@Test(priority = 1)
	public void verifyBookStoreApplication() {
		try {
			Assert.assertEquals(bookstrapg.verifyTabTextOnMenuBar(), "Book Store Application");
			Assert.assertEquals(bookstrapg.veridyProfileTxtOnMenuBar(), "Profile");
			bookstrapg.clickOnProfileTxtOnMenuBar();
			Assert.assertEquals(bookstrapg.verifyLoginPageMessage(), "Currently you are not logged into the Book Store application, please visit the login page to enter or register page to register yourself.");
			Assert.assertEquals(bookstrapg.verifyRegisterTxtOnLoginPage(), "login");
			bookstrapg.clickOnLoginTxt();
			Assert.assertEquals(bookstrapg.verifyLoginTxtOnPage(), "Login");
			Assert.assertEquals(bookstrapg.verifyLoginToBookStoreTxt(), "Login in Book Store");
			Assert.assertTrue(bookstrapg.displayedUNameField(), "The User name field is not displayed");
			bookstrapg.enterUName();
			Assert.assertTrue(bookstrapg.displayedPasswordField(), "The Password field is not displayed");
			bookstrapg.enterPassword();
			bookstrapg.clickOnLoginBtn();



		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}




}
