package com.crm.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ElementsPage;
import com.crm.qa.pages.HomePage;

public class ElementPageTest extends TestBase{
	HomePage homepg;
	ElementsPage elepg;

	public ElementPageTest() {
		//Invoking Parent Class Constructors
		super();
	}


	@BeforeMethod
	public void setUp() {
		initialization();
		homepg = new HomePage();
		elepg = homepg.clickOnElements();
	}


	@Test(priority = 1)
	public void verifyElementsTextTest() {
		String actEleText = elepg.elementsText();
		Assert.assertEquals(actEleText, "Elements");
	}


	@Test(priority = 2)
	public void verifyClickOnTextBox() {
		elepg.clickOnTextBox();
		elepg.enterFullName(prop.getProperty("FullName"));
		elepg.enterEmail(prop.getProperty("Email"));
		elepg.enterCurrentAddress(prop.getProperty("CurrentAddress"));
		elepg.enterPeramanentAddress(prop.getProperty("PermanentAddress"));
		elepg.clickOnSubmitBtn();

		String actName = elepg.verifyFullName();
		Assert.assertEquals(actName, "Name:Robert John Desouza");

		String actEmail = elepg.verifyUserEmail();
		Assert.assertEquals(actEmail, "Email:robert.d@gmail.com");

		String actCAddress = elepg.verifyCurrentAddress();
		Assert.assertEquals(actCAddress, "Current Address :Suite 677 30575 Winfred Highway, Venusfort, KS 24304");

		String actPAddress = elepg.verifyPeramanentAddress();
		Assert.assertEquals(actPAddress, "Permananet Address :Suite 840 1045 Johnson Radial, Lake Renaldofurt, ND 60105-0717");
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
