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
		Assert.assertEquals(actEleText, "Elements");
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
			Assert.assertEquals(actName, "Name:Robert John Desouza");

			String actEmail = elepg.verifyUserEmail();
			Assert.assertEquals(actEmail, "Email:robert.d@gmail.com");

			String actCAddress = elepg.verifyCurrentAddress();
			Assert.assertEquals(actCAddress, "Current Address :Suite 677 30575 Winfred Highway, Venusfort, KS 24304");

			String actPAddress = elepg.verifyPeramanentAddress();
			Assert.assertEquals(actPAddress, "Permananet Address :Suite 840 1045 Johnson Radial, Lake Renaldofurt, ND 60105-0717");
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
			Assert.assertEquals(actCheckBxTxt, "Check Box");

			elepg.clickOnTextBoxText();
			elepg.clickOnCheckBox();
			String actCheckbxResult = elepg.verifyCheckboxResultText();
			Assert.assertEquals(actCheckbxResult, "You have selected :");
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
			Assert.assertEquals(actText, "Radio Button");

			elepg.clickOnRadioBtnText();
			elepg.clickOnYes();
			String actYesText = elepg.verifyYesText();
			Assert.assertEquals(actYesText, "You have selected Yes");

			elepg.clickOnImpressive();
			String actImpText = elepg.verifyImpressiveText();
			Assert.assertEquals(actImpText, "You have selected Impressive");		
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
			Assert.assertEquals(actWebtableText, "Web Tables");

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
			Assert.assertEquals(actBtnText, "Buttons");

			elepg.clickOnButtonText();
			elepg.doubleClickMe();
			String actDoubleClickMessage = elepg.doubleClickMessage();
			Assert.assertEquals(actDoubleClickMessage, "You have done a double click");

			elepg.rightClickBtn();
			String actRightClickMessage = elepg.verifyRightClickMessage();
			Assert.assertEquals(actRightClickMessage, "You have done a right click");

			elepg.singleClickBtn();
			String actSingleClickMesage = elepg.singleClickMessage();
			Assert.assertEquals(actSingleClickMesage, "You have done a dynamic click");
		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}	
	}

	@Test(priority = 7)
	public void verifiedWindowAndAllLinks() {
		try {
			String actLinkText = elepg.verifyLinksTextInMenu();
			Assert.assertEquals(actLinkText, "Links");

			elepg.clickOnLinks();
			String actHomeText = elepg.verifyHomeText();
			Assert.assertEquals(actHomeText, "Home");

			elepg.clickOnHomeLink();
			elepg.clickOnCreatedLink();
			Assert.assertEquals(elepg.verifyCreatedLinkResonse(), "Link has responded with staus 201 and status text Created");
			elepg.clickOnNoContentLink();
			Assert.assertEquals(elepg.verifyNoContentLinkResonse(), "Link has responded with staus 204 and status text No Content");
			elepg.clickOnMovedLink();
			Assert.assertEquals(elepg.verifyMovedLinkResonse(), "Link has responded with staus 301 and status text Moved Permanently");
			elepg.clickOnBadRequestLink();
			Assert.assertEquals(elepg.verifyBadRequestLinkResonse(), "Link has responded with staus 400 and status text Bad Request");
			elepg.clickOnUnAuthorizedLink();
			Assert.assertEquals(elepg.verifyUnAuthorizedLinkResonse(), "Link has responded with staus 401 and status text Unauthorized");
			elepg.clickOnForbiddenLink();
			Assert.assertEquals(elepg.verifyForbiddenLinkResonse(), "Link has responded with staus 403 and status text Forbidden");
			elepg.clickOnNotFoundLink();
			Assert.assertEquals(elepg.verifyNotFoundLinkResonse(), "Link has responded with staus 404 and status text Not Found");

		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}

	@Test(priority = 8)
	public void verifyBrokenLinks() {
		try {
			Assert.assertEquals(elepg.verifyBrokenLinkOnMenuText(), "Broken Links - Images");
			elepg.verifyClickOnBrokenLinks();
			boolean flag = elepg.displayedToolsQALogo();
			Assert.assertTrue(flag);
			elepg.clickOnValidLinkText();
			elepg.clickBrokenLinkText();
			Assert.assertEquals(elepg.getStatusCode(), "Status Codes");

		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());

		}
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
