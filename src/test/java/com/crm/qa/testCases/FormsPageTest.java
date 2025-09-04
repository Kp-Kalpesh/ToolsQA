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


	@Test
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

	@AfterMethod
	public void tearDown() {
		//		driver.quit();
	}

}
