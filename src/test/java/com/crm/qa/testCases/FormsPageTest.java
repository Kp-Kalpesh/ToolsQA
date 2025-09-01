package com.crm.qa.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
		frmPg = elepg.clickOnFormsBtn();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
