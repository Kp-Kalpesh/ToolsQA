package com.crm.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ElementsPage;
import com.crm.qa.pages.FormsPage;
import com.crm.qa.pages.HomePage;

public class FormsPageTest extends TestBase{
	HomePage homepg;
	ElementsPage elepg;
	FormsPage frmPg;


	public FormsPageTest() {
		super();
	}


	@BeforeMethod
	public void setUp() {
		initialization();
		homepg = new HomePage();
		elepg = homepg.clickOnElements();
		frmPg = elepg.clickOnFormsBtn();
	}


	@Test(priority = 1)
	public void verifyFormsText() {
		try {
			String actFormText = frmPg.verifyFormsText();
			Assert.assertEquals(actFormText, "Forms");

			String actPracticeFormtext = frmPg.verifyPracticeFormText();
			Assert.assertEquals(actPracticeFormtext, "Practice Form");
			frmPg.clickOnPracticeFormText();

		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}


	@Test(priority = 2)
	public void verifySubmitForm() {
		try {
			frmPg.clickOnPracticeFormText();
			frmPg.enterFName(prop.getProperty("formFname"));
			frmPg.enterLName(prop.getProperty("formLname"));
			frmPg.enterEmail(prop.getProperty("formEmail"));
			frmPg.selectGenderRadioBtn();
			frmPg.enterMobileNumber(prop.getProperty("formMobNumber"));
			//						frmPg.selectDOB();
			frmPg.enterSubject(prop.getProperty("forSubject"));
			frmPg.selectHobbiesChkBx();
			frmPg.enterCurrentAddress(prop.getProperty("formCurrentAddress"));
			frmPg.selectState(prop.getProperty("userState"));
			frmPg.selectCity(prop.getProperty("userCity"));
			frmPg.submitFormBtn();
			Assert.assertEquals(frmPg.verifySubmittedForm(), prop.getProperty("actSubmittedForm"));
			Assert.assertEquals(frmPg.verifyUserName(), prop.getProperty("actUserName"));
			frmPg.clickOnClose();

		}catch (Exception e) {
			System.out.println("Element not found within timeout: " + e.getMessage());
		}
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
