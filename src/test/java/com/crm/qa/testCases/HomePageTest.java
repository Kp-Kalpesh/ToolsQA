package com.crm.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ElementsPage;
import com.crm.qa.pages.HomePage;

public class HomePageTest extends TestBase{
	HomePage homepg;
	ElementsPage elepg;

	public HomePageTest() {
		//Invoking Parent Class Constructors
		super();
	}


	@BeforeMethod
	public void setUp() {
		initialization();
		homepg = new HomePage();
	}


	@Test(priority = 1)
	public void HomePageTitleTest() {
		String actTitle = homepg.validateHomePageTitle();
		Assert.assertEquals(actTitle, prop.getProperty("HomeActualTitle"));
	}

	@Test(priority = 2)
	public void toolsQALogoTest() throws InterruptedException {
		boolean flag = homepg.validateToolsQALogo();
		Assert.assertTrue	(flag);
	}


	@Test(priority = 3)
	public void verifyClickOnElementsTest() {
		elepg = homepg.clickOnElements();
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}



}
