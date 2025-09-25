package com.crm.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AlertsFrameAndWindowsPage;
import com.crm.qa.pages.ElementsPage;
import com.crm.qa.pages.FormsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.InteractionPage;
import com.crm.qa.pages.WidgetsPage;

public class InteractionPageTest extends TestBase{

	HomePage homepg;
	ElementsPage elepg;
	FormsPage frmPg;
	AlertsFrameAndWindowsPage altpg;
	WidgetsPage widpg;
	InteractionPage interpg;



	public InteractionPageTest() {
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
	}

	@Test(priority = 1)
	public void verifyInteractionText() {
		Assert.assertEquals(interpg.verifyInteractionTxt(), "Interactions");
	}
	
	


	@AfterMethod
	public void tearDown() {
//		driver.quit();
	}
}
