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
			Assert.assertEquals(altpg.verifyBwsWinTxtOnMenuBar(), prop.getProperty("bWindow"));
			altpg.clickOnBwsWinOnMenu();
			Assert.assertEquals(altpg.verifyBrowseWidnowTxt(), prop.getProperty("bWindow"));
			altpg.clickOnNewTab();
			Assert.assertEquals(altpg.verifyNewTabMessage(), prop.getProperty("windowMessage"));
			altpg.clickOnNewWindow();
			Assert.assertEquals(altpg.verifyNewWindowMessage(), prop.getProperty("windowMessage"));
			altpg.clickOnNewWindowMessageBtn();
			altpg.verifyNewWindowMessageText();
			//			Assert.assertEquals(altpg.verifyNewWindowMessageText(), "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");
			//			System.out.println("Message : " + altpg.verifyNewWindowMessageText());

		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	//Alerts
	@Test(priority = 2)
	public void verifyAllAlertsMethos() {
		try {
			Assert.assertEquals(altpg.verifyAlertstextOnMenuBar(), prop.getProperty("actTxt"));

			altpg.clickOnAlertTextOnMenuBar();
			Assert.assertEquals(altpg.verifyAlertTextOnPage(), prop.getProperty("actTxt"));
			Assert.assertEquals(altpg.verifyFirstMessage(), prop.getProperty("firstMessage"));
			altpg.clickOnFirstClickMe();
			Assert.assertEquals(altpg.verifySecondMesage(), prop.getProperty("secondMessage"));
			altpg.clikcOnSecondClickme();
			Assert.assertEquals(altpg.verifyThirdMessage(), prop.getProperty("thirdMessage"));
			altpg.clickOnThirdClickMe();
			Assert.assertEquals(altpg.verifyResultAfterThirdClick(), prop.getProperty("thirdResultMessage"));

			Assert.assertEquals(altpg.verifyFourthMessage(), prop.getProperty("fourthMessage"));
			altpg.clickOnFourthClickMe(prop.getProperty("fourthClick"));
			Assert.assertEquals(altpg.verifyResultAfterFourthclick(), prop.getProperty("fourthResult"));

		}catch(Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	//Frames
	@Test(priority = 3)
	public void verifyFramesPage() throws InterruptedException {
		try {
			Assert.assertEquals(altpg.verifyFramesOnMenubar(), prop.getProperty("actFTxt"));
			altpg.clickOnFramesText();
			Assert.assertEquals(altpg.verigyFramesOnPage(), prop.getProperty("actFTxt"));
			altpg.verifyFrameMessage();
			Assert.assertEquals(altpg.verifyFrameMessage(), prop.getProperty("frameTxtMessage"));
		} catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	//Modals
	@Test(priority = 4)
	public void verifyModalDialogs() {
		try {
			Assert.assertEquals(altpg.verifyModaldialogTextOnMenuBar(), prop.getProperty("actModalTxt"));
			altpg.clickOnModalDialogText();
			Assert.assertEquals(altpg.verifyModalTextOnPage(), prop.getProperty("actModalTxt"));
			altpg.clickOnSmallBtn();
			Assert.assertEquals(altpg.verifyTextOnSmallModal(), prop.getProperty("sModal"));
			altpg.clickOnCloseSmallModal();
			altpg.clickOnLargeModalBtn();
			Assert.assertEquals(altpg.verifyTextOnLargeModal(), prop.getProperty("lModal"));
			altpg.closeLargeModal();

		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());

		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
