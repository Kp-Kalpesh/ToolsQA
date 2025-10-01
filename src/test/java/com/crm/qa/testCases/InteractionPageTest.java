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

	//Sortable
	@Test(priority = 1)
	public void verifyInteractionText() {
		try {
			Assert.assertEquals(interpg.verifyInteractionTxt(), prop.getProperty("actIntertxt"));
			Assert.assertEquals(interpg.verifySortableTxtOnMenuBar(), prop.getProperty("actSortTxt"));
			interpg.clickOnSortableTxt();
			Assert.assertEquals(interpg.verifySortableTxtOnPage(), prop.getProperty("actSortTxt"));
			Assert.assertEquals(interpg.verifyListTxt(), prop.getProperty("list"));
			Assert.assertEquals(interpg.verifyOneInList(), prop.getProperty("List_1"));
			Assert.assertEquals(interpg.verifyTwoInList(), prop.getProperty("List_2"));
			Assert.assertEquals(interpg.verifyThreeInList(), prop.getProperty("List_3"));
			Assert.assertEquals(interpg.verifyFourInList(), prop.getProperty("List_4"));
			Assert.assertEquals(interpg.verifyFiveInList(), prop.getProperty("List_5"));
			Assert.assertEquals(interpg.verifySixInList(), prop.getProperty("List_6"));
			Assert.assertEquals(interpg.verifyGridTxt(), prop.getProperty("actGrid"));
			interpg.clickOnGridTxt();
			Assert.assertEquals(interpg.verifyFirstInGrid(), prop.getProperty("Grid_1"));
			Assert.assertEquals(interpg.verifyTwoInGrid(), prop.getProperty("Grid_2"));
			Assert.assertEquals(interpg.verifyThreeInGrid(), prop.getProperty("Grid_3"));
			Assert.assertEquals(interpg.verifyFourInGrid(), prop.getProperty("Grid_4"));
			Assert.assertEquals(interpg.verifyFiveInGrid(), prop.getProperty("Grid_5"));
			Assert.assertEquals(interpg.verifySixInGrid(), prop.getProperty("Grid_6"));
		}catch(Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	//Selectable Tab
	@Test(priority = 2)
	public void verifySelectableTab() {
		try {
			Assert.assertEquals(interpg.verifySelectableTxtOnMenuBar(), prop.getProperty("slTxt"));
			interpg.clickOnSelectableTxtOnMenuBar();
			Assert.assertEquals(interpg.verifySelectableTxtOnPage(), prop.getProperty("slTxt"));
			Assert.assertEquals(interpg.verifyListTxtOnPage(), prop.getProperty("Slist"));

			Assert.assertEquals(interpg.verifyAndClickOn1stTxtOnPage(), prop.getProperty("clickOn1st"));
			Assert.assertEquals(interpg.verifyAndClickOn2ndTxtOnPage(), prop.getProperty("clickOn2nd"));
			Assert.assertEquals(interpg.verifyAndClickOn3rdTxtOnPage(), prop.getProperty("clickOn3rd"));
			Assert.assertEquals(interpg.verifyAndClickOn4thTxtOnPage(), prop.getProperty("clickOn4th"));
			Assert.assertEquals(interpg.verifyGridTxtOnPage(), prop.getProperty("sGrid"));
			interpg.clickOnGridTxtOnPage();
			Assert.assertEquals(interpg.verifyAndClick1stBoxTxtOnPage(), prop.getProperty("clic1stBxTxt"));
			Assert.assertEquals(interpg.verifyAndClick2ndBoxTxtOnPage(), prop.getProperty("clic2stBxTxt"));
			Assert.assertEquals(interpg.verifyAndClick3rdBoxTxtOnPage(), prop.getProperty("clic3rdBxTxt"));
			Assert.assertEquals(interpg.verifyAndClick4thBoxTxtOnPage(), prop.getProperty("clic4thBxTxt"));
			Assert.assertEquals(interpg.verifyAndClick5thBoxTxtOnPage(), prop.getProperty("clic5thBxTxt"));
			Assert.assertEquals(interpg.verifyAndClick6thBoxTxtOnPage(), prop.getProperty("clic6thBxTxt"));
			Assert.assertEquals(interpg.verifyAndClick7thBoxTxtOnPage(), prop.getProperty("clic7thBxTxt"));
			Assert.assertEquals(interpg.verifyAndClick8thBoxTxtOnPage(), prop.getProperty("clic8thBxTxt"));
			Assert.assertEquals(interpg.verifyAndClick9thBoxTxtOnPage(), prop.getProperty("clic9thBxTxt"));
		}catch(Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	//Resizable
	@Test(priority = 3)
	public void verifyResizableTab() throws InterruptedException {
		try {
			Assert.assertEquals(interpg.verifyResizableTxtOnMenu(), prop.getProperty("reszTxt"));
			interpg.clickOnResizableTxtOnMenuBar();
			Assert.assertEquals(interpg.verifyResizableTxtOnPage(), prop.getProperty("reszTxt"));
			Assert.assertEquals(interpg.verifyMessageOfRisizableBox(), prop.getProperty("reszBxMessage"));
			interpg.expandBoxSize();
		}catch(Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	//Droppable
	@Test(priority = 4)
	public void verifyDropableTab() throws InterruptedException {
		try {
			Assert.assertEquals(interpg.verifyDropableTxtOnMenuBar(), prop.getProperty("drpTxt"));
			interpg.clickOnDroppableTxtOnMenuBar();
			Assert.assertEquals(interpg.verifyDroppabletxtOnPage(), prop.getProperty("drpTxt"));
			Assert.assertEquals(interpg.verifySimpleTxtOnPage(), prop.getProperty("simpleTxt"));
			interpg.verifyDragAndDrop();
			Assert.assertEquals(interpg.verifyAcceptTxtOnPage(), prop.getProperty("accTxt"));
			interpg.clickOnAcceptTxt();
			interpg.verifyAcceptDragDrop();
			Assert.assertEquals(interpg.verifyPreventPropogationTxt(), prop.getProperty("ppTxt"));
			interpg.clickOnPreventPropogationTxt();
			interpg.dragBoxOfPreventPorpogation();
			Assert.assertEquals(interpg.verifyRevertDraggableText(), prop.getProperty("rdTxt"));
			interpg.clickOnRevertDraggableTxt();
			interpg.dragWillRevertIntoBx();
		}catch(Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}


	//Dragabble
	@Test(priority = 5)
	public void verifyDraggableTab() {
		try {
			Assert.assertEquals(interpg.verifyDragableTxtOnMenuBar(), prop.getProperty("dragTxt"));
			interpg.clickOnDragabbleTxtOnMenuBar();
			Assert.assertEquals(interpg.verifyDragTxtOnPage(), prop.getProperty("dragTxt"));
			Assert.assertEquals(interpg.verifySimpleTextOnPage(), prop.getProperty("spTxt"));
			interpg.performDragableAction();
			Assert.assertEquals(interpg.verifyAxisRestrictTxtOnPage(), prop.getProperty("ARTxt"));
			interpg.clickOnAxisRestricted();
			interpg.performedXAxis();
			interpg.performedYAxis();
			Assert.assertEquals(interpg.verifyContainerRestrictedTxtOnPage(), prop.getProperty("CRTxt"));
			interpg.clickOnContainerrestricted();
			Assert.assertEquals(interpg.verifyInnerBoxTextIsPresent(), prop.getProperty("innerBxTxt"));
			interpg.dragInnerBx();
			Assert.assertEquals(interpg.verifyTxtOnOuterBox(), prop.getProperty("outerBxTxt"));
			Assert.assertEquals(interpg.verifyCursorStyleTxtOnPage(), prop.getProperty("CSTxt"));
			interpg.clickOnCursorStyleTxt();
			Assert.assertEquals(interpg.verifyCuror_1Text(), prop.getProperty("CS_1Txt"));
			interpg.dragCursor_1();
			Assert.assertEquals(interpg.verifyCuror_2Text(), prop.getProperty("CS_2Txt"));
			interpg.dragCursor_2();
			Assert.assertEquals(interpg.verifyCuror_3Text(), prop.getProperty("CS_3Txt"));
			interpg.dragCursor_3();
		}catch(Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
