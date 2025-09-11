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
import com.crm.qa.pages.WidgetsPage;

public class WidgetsPageTest extends TestBase{

	HomePage homepg;
	ElementsPage elepg;
	FormsPage frmPg;
	AlertsFrameAndWindowsPage altpg;
	WidgetsPage widpg;

	public WidgetsPageTest() {
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
	}


	@Test(priority = 1)
	public void verifyWidgetsAccordianTab() {
		try {
			Assert.assertEquals(widpg.verifyWidgetTextOnMenuBar(), "Widgets");
			Assert.assertEquals(widpg.verifyAccordianTextOnMenuBar(), "Accordian");
			widpg.clickAccordianTextOnMenuBar();
			Assert.assertEquals(widpg.verifyaccordianTextOnPage(), "Accordian");
			Assert.assertEquals(widpg.verifyBoxOneText(), "What is Lorem Ipsum?");
			Assert.assertEquals(widpg.veifyBox2Text(), "Where does it come from?");
			widpg.clickOnBox2Text();
			Assert.assertEquals(widpg.verifybox3Text(), "Why do we use it?");
			widpg.clickOnBox3Text();

		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	@Test(priority = 2)
	public void verifyAutoCompleteTab() {
		try {
			Assert.assertEquals(widpg.verifyAutoCompleteTextOnMenuBar(), "Auto Complete");
			widpg.clickOnAutoCompleteTab();
			Assert.assertEquals(widpg.verifyOnAutoCompleteTextOnPage(), "Auto Complete");
			widpg.enterMultipleColors("Red");
			widpg.enterSingleColorName("White");


		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
