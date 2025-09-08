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

	//Alerts
	@Test(priority = 2)
	public void verifyAllAlertsMethos() {
		try {
			Assert.assertEquals(altpg.verifyAlertstextOnMenuBar(), "Alerts");

			altpg.clickOnAlertTextOnMenuBar();
			Assert.assertEquals(altpg.verifyAlertTextOnPage(), "Alerts");

			Assert.assertEquals(altpg.verifyFirstMessage(), "Click Button to see alert");
			altpg.clickOnFirstClickMe();

			Assert.assertEquals(altpg.verifySecondMesage(), "On button click, alert will appear after 5 seconds");
			altpg.clikcOnSecondClickme();

			Assert.assertEquals(altpg.verifyThirdMessage(), "On button click, confirm box will appear");
			altpg.clickOnThirdClickMe();
			Assert.assertEquals(altpg.verifyResultAfterThirdClick(), "You selected Ok");

			Assert.assertEquals(altpg.verifyFourthMessage(), "On button click, prompt box will appear");
			altpg.clickOnFourthClickMe("Kappyyy");;
			Assert.assertEquals(altpg.verifyResultAfterFourthclick(), "You entered Kappyyy");

		}catch(Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	@Test(priority = 3)
	public void verifyFramesPage() throws InterruptedException {
		try {
			Assert.assertEquals(altpg.verifyFramesOnMenubar(), "Frames");
			altpg.clickOnFramesText();
			Assert.assertEquals(altpg.verigyFramesOnPage(), "Frames");
			altpg.verifyFrameMessage();
			Assert.assertEquals(altpg.verifyFrameMessage(), "This is a sample page");
		} catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	@Test(priority = 4)
	public void verifyModalDialogs() {
		try {
			Assert.assertEquals(altpg.verifyModaldialogTextOnMenuBar(), "Modal Dialogs");
			altpg.clickOnModalDialogText();
			Assert.assertEquals(altpg.verifyModalTextOnPage(), "Modal Dialogs");
			altpg.clickOnSmallBtn();
			Assert.assertEquals(altpg.verifyTextOnSmallModal(), "Small Modal");
			altpg.clickOnCloseSmallModal();
			altpg.clickOnLargeModalBtn();
			Assert.assertEquals(altpg.verifyTextOnLargeModal(), "Large Modal");
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
