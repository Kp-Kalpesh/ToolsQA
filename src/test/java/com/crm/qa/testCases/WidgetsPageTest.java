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

	//Accordian
	@Test(priority = 1)
	public void verifyWidgetsAccordianTab() {
		try {
			Assert.assertEquals(widpg.verifyWidgetTextOnMenuBar(), prop.getProperty("actTxt"));
			Assert.assertEquals(widpg.verifyAccordianTextOnMenuBar(), prop.getProperty("actAccoTxt"));
			widpg.clickAccordianTextOnMenuBar();
			Assert.assertEquals(widpg.verifyaccordianTextOnPage(), prop.getProperty("actAccoTxt"));
			Assert.assertEquals(widpg.verifyBoxOneText(), prop.getProperty("boxOneTxt"));
			Assert.assertEquals(widpg.veifyBox2Text(), prop.getProperty("boxTwotxt"));
			widpg.clickOnBox2Text();
			Assert.assertEquals(widpg.verifybox3Text(), prop.getProperty("boxThreeTxt"));
			widpg.clickOnBox3Text();

		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	//Auto Complete
	@Test(priority = 2)
	public void verifyAutoCompleteTab() {
		try {
			Assert.assertEquals(widpg.verifyAutoCompleteTextOnMenuBar(), prop.getProperty("acTxt"));
			widpg.clickOnAutoCompleteTab();
			Assert.assertEquals(widpg.verifyOnAutoCompleteTextOnPage(), prop.getProperty("acTxt"));
			widpg.enterMultipleColors(prop.getProperty("multiColor"));
			widpg.enterSingleColorName(prop.getProperty("singleColor"));
		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	//Slider
	@Test(priority = 3)
	public void verifySliderTab() {
		try {

			Assert.assertEquals(widpg.verifySliderTextOnMenuBar(), prop.getProperty("sliderTxt"));
			widpg.clickOnsliderTab();
			Assert.assertEquals(widpg.verifySliderTextOnPage(), prop.getProperty("sliderTxt"));
			widpg.slideTheHorizontalScroll();
			Assert.assertEquals(widpg.verifyResultValue(), prop.getProperty("resultValue"));

		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	//Progress Bar
	@Test(priority = 4)
	public void verifyProgressBar() {
		try {
			Assert.assertEquals(widpg.verifyProgressBarTextOnMenuBar(), prop.getProperty("pbText"));	
			widpg.clickOnProgressBartextonMenu();
			Assert.assertEquals(widpg.verifyProgressBarTextOnPage(), prop.getProperty("pbText"));
			widpg.clickOnStartBtn();
			widpg.clickOnStopBtn();
			Assert.assertEquals(widpg.verifyRunningProgressBar(), prop.getProperty("runningPB"));
			System.out.println("verifyRunningProgressBar: " + widpg.verifyRunningProgressBar());
			widpg.clickOnAgainStartBtn();
			Assert.assertEquals(widpg.verifyCompletedProgressBarTxt(), prop.getProperty("completedPB"));
			widpg.clickOnResetBtn();
		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	//Tabs
	@Test(priority = 5)
	public void verifyTabs() {
		try {
			Assert.assertEquals(widpg.verifyTabsTxtOnMenuBar(), prop.getProperty("actTbtxt"));
			widpg.clickOnTabsTxtOnMenuBar();
			Assert.assertEquals(widpg.verifyTabsTxtOnPage(), prop.getProperty("actTbtxt"));
			Assert.assertEquals(widpg.verifyWhatTxt(), prop.getProperty("wTxt"));
			Assert.assertEquals(widpg.verifyOriginTxt(), prop.getProperty("oTxt"));
			widpg.clickOnOrigin();
			Assert.assertEquals(widpg.verifyUseTxt(), prop.getProperty("uTxt"));
			widpg.clickOnUse();
			Assert.assertEquals(widpg.verifyMoreText(), prop.getProperty("mTxt"));

		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	//Tooltip
	@Test(priority = 6)
	public void verifyToolTips() {
		try {
			Assert.assertEquals(widpg.verifyToolTiptextOnMenu(), prop.getProperty("ttTxt"));
			widpg.clickOnToolTipTxt();
			Assert.assertEquals(widpg.verifyTooltipTxtOnPage(), prop.getProperty("ttTxt"));
			widpg.hoverMouseOnBtn();
			System.out.println("verifyBtnHoverText: " + widpg.verifyBtnHoverText());
			Assert.assertEquals(widpg.verifyBtnHoverText(), prop.getProperty("ttMessage_1"));
			widpg.hoverMouseOnInputField();
			System.out.println("verifyInputFieldTooltiptxt:" + widpg.verifyInputFieldTooltiptxt());
			Assert.assertEquals(widpg.verifyInputFieldTooltiptxt(), prop.getProperty("ttMessage_2"));

		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	//Menu
	@Test(priority = 7)
	public void verifyMenu() {
		try {
			Assert.assertEquals(widpg.verifyMenuTxtOnMenuBar(), prop.getProperty("actmenutxt"));
			widpg.clickOnMenuTxtOnMenuBar();
			Assert.assertEquals(widpg.verifyMenuTxtOnPage(), prop.getProperty("actmenutxt"));
			Assert.assertEquals(widpg.verifyMainItem1(), prop.getProperty("MI_1"));
			Assert.assertEquals(widpg.verifyMainItem2(), prop.getProperty("MI_2"));
			Assert.assertEquals(widpg.verifySubItem1(), prop.getProperty("SI"));
			Assert.assertEquals(widpg.verifySubItem2(), prop.getProperty("SI"));
			Assert.assertEquals(widpg.verifySubList(), prop.getProperty("SSL"));
			Assert.assertEquals(widpg.verifySubListitem1(), prop.getProperty("SSI_1"));
			Assert.assertEquals(widpg.verifySubListItem2(), prop.getProperty("SSI_2"));
			Assert.assertEquals(widpg.verifyMainItem3(), prop.getProperty("MI_3"));

		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	//Select Menu
	@Test(priority = 8)
	public void verifiedSelectMenu() {
		try {
			Assert.assertEquals(widpg.verifySelectMenuTextOnSideBar(), prop.getProperty("smTxt"));
			widpg.clickOnSelectMenuTab();
			Assert.assertEquals(widpg.verifySelectMenuOnPage(), prop.getProperty("smTxt"));
			widpg.selectDataInSelectDrpDwn(prop.getProperty("selectDpData"));
			Assert.assertEquals(widpg.verifySelectedDataInSelectDrpDwn(), prop.getProperty("selectDpData"));
			widpg.selectDataInSelectOneDrpDwn(prop.getProperty("selectData"));
			Assert.assertEquals(widpg.verifySelectdataInSelectOneDrpDwn(), prop.getProperty("selectData"));
			widpg.selectDataInColorDrpDwn();
			widpg.selectMultipleDataInDrpDwn(prop.getProperty("enterColor_1"), prop.getProperty("enterColor_2"), prop.getProperty("enterColor_3"));
		}catch(Exception e)
		{
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
