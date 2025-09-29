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
		try {
			Assert.assertEquals(interpg.verifyInteractionTxt(), "Interactions");
			Assert.assertEquals(interpg.verifySortableTxtOnMenuBar(), "Sortable");
			interpg.clickOnSortableTxt();
			Assert.assertEquals(interpg.verifySortableTxtOnPage(), "Sortable");
			Assert.assertEquals(interpg.verifyListTxt(), "List");
			Assert.assertEquals(interpg.verifyOneInList(), "One");
			Assert.assertEquals(interpg.verifyTwoInList(), "Two");
			Assert.assertEquals(interpg.verifyThreeInList(), "Three");
			Assert.assertEquals(interpg.verifyFourInList(), "Four");
			Assert.assertEquals(interpg.verifyFiveInList(), "Five");
			Assert.assertEquals(interpg.verifySixInList(), "Six");
			Assert.assertEquals(interpg.verifyGridTxt(), "Grid");
			interpg.clickOnGridTxt();
			Assert.assertEquals(interpg.verifyFirstInGrid(), "One");
			Assert.assertEquals(interpg.verifyTwoInGrid(), "Two");
			Assert.assertEquals(interpg.verifyThreeInGrid(), "Three");
			Assert.assertEquals(interpg.verifyFourInGrid(), "Four");
			Assert.assertEquals(interpg.verifyFiveInGrid(), "Five");
			Assert.assertEquals(interpg.verifySixInGrid(), "Six");
		}catch(Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	//Selectable Tab
	@Test(priority = 2)
	public void verifySelectableTab() {
		try {
			Assert.assertEquals(interpg.verifySelectableTxtOnMenuBar(), "Selectable");
			interpg.clickOnSelectableTxtOnMenuBar();
			Assert.assertEquals(interpg.verifySelectableTxtOnPage(), "Selectable");
			Assert.assertEquals(interpg.verifyListTxtOnPage(), "List");

			Assert.assertEquals(interpg.verifyAndClickOn1stTxtOnPage(), "Cras justo odio");
			Assert.assertEquals(interpg.verifyAndClickOn2ndTxtOnPage(), "Dapibus ac facilisis in");
			Assert.assertEquals(interpg.verifyAndClickOn3rdTxtOnPage(), "Morbi leo risus");
			Assert.assertEquals(interpg.verifyAndClickOn4thTxtOnPage(), "Porta ac consectetur ac");
			Assert.assertEquals(interpg.verifyGridTxtOnPage(), "Grid");
			interpg.clickOnGridTxtOnPage();
			Assert.assertEquals(interpg.verifyAndClick1stBoxTxtOnPage(), "One");
			Assert.assertEquals(interpg.verifyAndClick2ndBoxTxtOnPage(), "Two");
			Assert.assertEquals(interpg.verifyAndClick3rdBoxTxtOnPage(), "Three");
			Assert.assertEquals(interpg.verifyAndClick4thBoxTxtOnPage(), "Four");
			Assert.assertEquals(interpg.verifyAndClick5thBoxTxtOnPage(), "Five");
			Assert.assertEquals(interpg.verifyAndClick6thBoxTxtOnPage(), "Six");
			Assert.assertEquals(interpg.verifyAndClick7thBoxTxtOnPage(), "Seven");
			Assert.assertEquals(interpg.verifyAndClick8thBoxTxtOnPage(), "Eight");
			Assert.assertEquals(interpg.verifyAndClick9thBoxTxtOnPage(), "Nine");
		}catch(Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}




	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
