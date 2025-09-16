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

	@Test(priority = 3)
	public void verifySliderTab() {
		try {

			Assert.assertEquals(widpg.verifySliderTextOnMenuBar(), "Slider");
			widpg.clickOnsliderTab();
			Assert.assertEquals(widpg.verifySliderTextOnPage(), "Slider");
			widpg.slideTheHorizontalScroll();
			Assert.assertEquals(widpg.verifyResultValue(), "58");

		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	@Test(priority = 4)
	public void verifyProgressBar() {
		try {
			Assert.assertEquals(widpg.verifyProgressBarTextOnMenuBar(), "Progress Bar");	
			widpg.clickOnProgressBartextonMenu();
			Assert.assertEquals(widpg.verifyProgressBarTextOnPage(), "Progress Bar");
			widpg.clickOnStartBtn();
			widpg.clickOnStopBtn();
			Assert.assertEquals(widpg.verifyRunningProgressBar(), "50%");
			System.out.println("verifyRunningProgressBar: " + widpg.verifyRunningProgressBar());
			widpg.clickOnAgainStartBtn();
			Assert.assertEquals(widpg.verifyCompletedProgressBarTxt(), "100%");
			widpg.clickOnResetBtn();
		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}


	@Test(priority = 5)
	public void verifyTabs() {
		try {
			Assert.assertEquals(widpg.verifyTabsTxtOnMenuBar(), "Tabs");
			widpg.clickOnTabsTxtOnMenuBar();
			Assert.assertEquals(widpg.verifyTabsTxtOnPage(), "Tabs");
			Assert.assertEquals(widpg.verifyWhatTxt(), "What");
			Assert.assertEquals(widpg.verifyOriginTxt(), "Origin");
			widpg.clickOnOrigin();
			Assert.assertEquals(widpg.verifyUseTxt(), "Use");
			widpg.clickOnUse();
			Assert.assertEquals(widpg.verifyMoreText(), "More");

		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}


	@Test(priority = 6)
	public void verifyToolTips() {
		try {
			Assert.assertEquals(widpg.verifyToolTiptextOnMenu(), "Tool Tips");
			widpg.clickOnToolTipTxt();
			Assert.assertEquals(widpg.verifyTooltipTxtOnPage(), "Tool Tips");
			widpg.hoverMouseOnBtn();
			System.out.println("verifyBtnHoverText: " + widpg.verifyBtnHoverText());
			Assert.assertEquals(widpg.verifyBtnHoverText(), "You hovered over the Button");
			widpg.hoverMouseOnInputField();
			System.out.println("verifyInputFieldTooltiptxt:" + widpg.verifyInputFieldTooltiptxt());
			Assert.assertEquals(widpg.verifyInputFieldTooltiptxt(), "You hovered over the text field");

		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	//Getting timeout exception
//	@Test(priority = 7)
//	public void verifyMenu() {
//		try {
//			Assert.assertEquals(widpg.verifyMenuTxtOnMenuBar(), "Menu");
//			
//			
//			
//		}catch (Exception e) {
//			System.out.println("Element not found within timeout: " + e.getMessage());
//		}
//	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
