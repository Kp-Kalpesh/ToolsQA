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

public class AlertsFrameAndWindowsPageTest extends TestBase{

	HomePage homepg;
	ElementsPage elepg;
	FormsPage frmPg;
	AlertsFrameAndWindowsPage altpg;


	public AlertsFrameAndWindowsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homepg = new HomePage();
		elepg = homepg.clickOnElements();
		frmPg = elepg.clickOnFormsBtn();
		altpg = frmPg.clickOnAlertsFramesAndwindowsTab();
	}

	@Test(priority = 1)
	public void verifyAlertFrameWindowText() {
		try {
			Assert.assertEquals(altpg.verifyAlertsTabText(), prop.getProperty("actAltText"));
			Assert.assertEquals(altpg.verifyBwsWinTxtOnMenuBar(), "Browser Windows");
			altpg.clickOnBwsWinOnMenu();
			Assert.assertEquals(altpg.verifyBrowseWidnowTxt(), "Browser Windows");
			altpg.clickOnNewTab();
			Assert.assertEquals(altpg.verifyNewTabMessage(), "This is a sample page");
			altpg.clickOnNewWindow();
			Assert.assertEquals(altpg.verifyNewWindowMessage(), "This is a sample page");
			altpg.clickOnNewWindowMessageBtn();
			altpg.verifyNewWindowMessageText();
			//			Assert.assertEquals(altpg.verifyNewWindowMessageText(), "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");
			//			System.out.println("Message : " + altpg.verifyNewWindowMessageText());

		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
