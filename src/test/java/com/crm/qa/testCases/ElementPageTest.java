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
		Assert.assertEquals(actEleText, prop.getProperty("actText"));
	}

	//TextBox
	@Test(priority = 2)
	public void verifyClickOnTextBox() {
		try {
			elepg.clickOnTextBox();
			elepg.enterFullName(prop.getProperty("FullName"));
			elepg.enterEmail(prop.getProperty("Email"));
			elepg.enterCurrentAddress(prop.getProperty("CurrentAddress"));
			elepg.enterPeramanentAddress(prop.getProperty("PermanentAddress"));
			elepg.clickOnSubmitBtn();
			String actName = elepg.verifyFullName();
			Assert.assertEquals(actName, prop.getProperty("actFullName"));

			String actEmail = elepg.verifyUserEmail();
			Assert.assertEquals(actEmail, prop.getProperty("actEmail"));

			String actCAddress = elepg.verifyCurrentAddress();
			Assert.assertEquals(actCAddress, prop.getProperty("actCurrentAddress"));

			String actPAddress = elepg.verifyPeramanentAddress();
			Assert.assertEquals(actPAddress, prop.getProperty("actPermanentAddress"));
		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
			Assert.fail("Test failed due to TimeoutException.");
		} 
	}


	//CheckBox
	@Test(priority = 3)
	public void verifyClickOnCheckBox() {
		try {
			String actCheckBxTxt = elepg.verifyCheckBoxText();
			Assert.assertEquals(actCheckBxTxt, prop.getProperty("chkbx"));

			elepg.clickOnTextBoxText();
			elepg.clickOnCheckBox();
			String actCheckbxResult = elepg.verifyCheckboxResultText();
			Assert.assertEquals(actCheckbxResult, prop.getProperty("selectedMessage"));
		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
			Assert.fail("Test failed due to TimeoutException.");
		} 
	}

	//Radio Button
	@Test(priority = 4)
	public void chekRadioButtons() {
		try {
			String actText = elepg.verifyRadioBtnText();
			Assert.assertEquals(actText, prop.getProperty("RButton"));

			elepg.clickOnRadioBtnText();
			elepg.clickOnYes();
			String actYesText = elepg.verifyYesText();
			Assert.assertEquals(actYesText, prop.getProperty("yesText"));

			elepg.clickOnImpressive();
			String actImpText = elepg.verifyImpressiveText();
			Assert.assertEquals(actImpText, prop.getProperty("impressText"));		
		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
			Assert.fail("Test failed due to TimeoutException.");
		}
	} 

	//Web Table
	@Test(priority = 5)
	public void webTablesFlow()  {

		try {
			String actWebtableText = elepg.verifyWebTablesText();
			Assert.assertEquals(actWebtableText, prop.getProperty("actTableName"));

			elepg.clickOnwebtable();
			elepg.clickOnAddBtn();
			elepg.enterFirstName(prop.getProperty("FirstName"));
			elepg.enterLastName(prop.getProperty("LastName"));
			elepg.enterWebTableEmail(prop.getProperty("UEmail"));
			elepg.enterAge(prop.getProperty("Age"));
			elepg.enterSalary(prop.getProperty("Salary"));
			elepg.enterDepartment(prop.getProperty("Department"));
			elepg.clickOnSubmit();
			elepg.enterNameSearchBox(prop.getProperty("FirstName"));

			//verified create new user
			String actFName = elepg.verifyFName();
			Assert.assertEquals(actFName, prop.getProperty("FirstName"));

			String actLName = elepg.verifyLName();
			Assert.assertEquals(actLName, prop.getProperty("LastName"));

			String actAge = elepg.verifyAge();
			Assert.assertEquals(actAge ,prop.getProperty("Age"));

			String actUserEmail = elepg.verifyCreateEmail();
			Assert.assertEquals(actUserEmail, prop.getProperty("UEmail"));

			String actSal = elepg.verifySalary();
			Assert.assertEquals(actSal, prop.getProperty("Salary"));

			String actDept = elepg.verifyDepartment();
			Assert.assertEquals(actDept, prop.getProperty("Department"));

			//update created user
			elepg.clickOnEditIcon();
			elepg.editFName(prop.getProperty("UpdatedFName"));
			elepg.editLName(prop.getProperty("UpdatedLName"));
			elepg.editAge(prop.getProperty("UpdatedAge"));
			elepg.editEmail(prop.getProperty("UpdatedEmail"));		
			elepg.editSalary(prop.getProperty("UpdatedSalary"));
			elepg.editDepartment(prop.getProperty("UpdatedDepartment"));
			elepg.clickOnUpdateBtn();
			elepg.removeDataInSearchBoxAndEnterNew(prop.getProperty("UpdatedFName"));

			//verify updated user data
			String actUpdatedFName = elepg.verifyUpdatedFName();
			Assert.assertEquals(actUpdatedFName, prop.getProperty("UpdatedFName"));

			String actUpdatedLName = elepg.verifyUpdatedLName();
			Assert.assertEquals(actUpdatedLName, prop.getProperty("UpdatedLName"));

			String actUpdatedAge = elepg.verifyUpdatedAge();
			Assert.assertEquals(actUpdatedAge, prop.getProperty("UpdatedAge"));

			String actUpdatedEmail = elepg.verifyUpdatedEmail();
			Assert.assertEquals(actUpdatedEmail, prop.getProperty("UpdatedEmail"));

			String actUpdatedSal = elepg.verifyUpdatedSalary();
			Assert.assertEquals(actUpdatedSal, prop.getProperty("UpdatedSalary"));

			String actUpdatedDepart = elepg.verifyUpdatedDepartment();
			Assert.assertEquals(actUpdatedDepart, prop.getProperty("UpdatedDepartment"));

			elepg.deleteCreatedUser();

		} catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
			//			Assert.fail("Test failed due to TimeoutException.");
		} 
	}

	//Buttons
	@Test(priority = 6)
	public void validateButtonTextOnMenu() {
		try {
			String actBtnText = elepg.verifyButtonText();
			Assert.assertEquals(actBtnText, prop.getProperty("actBText"));

			elepg.clickOnButtonText();
			elepg.doubleClickMe();
			String actDoubleClickMessage = elepg.doubleClickMessage();
			Assert.assertEquals(actDoubleClickMessage, prop.getProperty("doubleClickText"));

			elepg.rightClickBtn();
			String actRightClickMessage = elepg.verifyRightClickMessage();
			Assert.assertEquals(actRightClickMessage, prop.getProperty("rightClickText"));

			elepg.singleClickBtn();
			String actSingleClickMesage = elepg.singleClickMessage();
			Assert.assertEquals(actSingleClickMesage, prop.getProperty("dynamicClickText"));
		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}	
	}

	//Links
	@Test(priority = 7)
	public void verifiedWindowAndAllLinks() {
		try {
			String actLinkText = elepg.verifyLinksTextInMenu();
			Assert.assertEquals(actLinkText, prop.getProperty("actLinkTxt"));

			elepg.clickOnLinks();
			String actHomeText = elepg.verifyHomeText();
			Assert.assertEquals(actHomeText, prop.getProperty("acthomeTxt"));

			elepg.clickOnHomeLink();
			elepg.clickOnCreatedLink();
			Assert.assertEquals(elepg.verifyCreatedLinkResonse(), prop.getProperty("CreatedLink"));
			elepg.clickOnNoContentLink();
			Assert.assertEquals(elepg.verifyNoContentLinkResonse(), prop.getProperty("NoContentLink"));
			elepg.clickOnMovedLink();
			Assert.assertEquals(elepg.verifyMovedLinkResonse(), prop.getProperty("MovedLink"));
			elepg.clickOnBadRequestLink();
			Assert.assertEquals(elepg.verifyBadRequestLinkResonse(), prop.getProperty("BadRequestLink"));
			elepg.clickOnUnAuthorizedLink();
			Assert.assertEquals(elepg.verifyUnAuthorizedLinkResonse(), prop.getProperty("UnAuthorizedLink"));
			elepg.clickOnForbiddenLink();
			Assert.assertEquals(elepg.verifyForbiddenLinkResonse(), prop.getProperty("ForbiddenLink"));
			elepg.clickOnNotFoundLink();
			Assert.assertEquals(elepg.verifyNotFoundLinkResonse(), prop.getProperty("NotFoundLink"));

		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	//BrokenLinks
	@Test(priority = 8)
	public void verifyBrokenLinks() {
		try {
			Assert.assertEquals(elepg.verifyBrokenLinkOnMenuText(), prop.getProperty("bLink"));
			elepg.verifyClickOnBrokenLinks();
			boolean flag = elepg.displayedToolsQALogo();
			Assert.assertTrue(flag);
			elepg.clickOnValidLinkText();
			elepg.clickBrokenLinkText();
			Assert.assertEquals(elepg.getStatusCode(), prop.getProperty("sCodes"));

		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
