package com.crm.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class FormsPage extends TestBase{
	//	private TestUtil tstU;
	//	private Actions act;

	//use Pagefactory
	@FindBy(xpath = "//div[text()='Forms']")
	WebElement Forms;

	@FindBy(xpath = "(//li[@class='btn btn-light '])[10]")
	WebElement practiceForm;








	//Constructor(Initializing the page objects)
	public FormsPage() {
		PageFactory.initElements(driver, this);
		//		tstU = new TestUtil();		
		//		act = new Actions(driver);
	}

	public String verifyFormsText() {
		Forms.sendKeys(Keys.PAGE_DOWN);
		return Forms.getText();
	}

	public void clickOnFormsText() {
		Forms.click();
	}

	public String verifyPracticeFormText() {
		return practiceForm.getText();		
	}

	public void clickOnPracticeFormText() {
		practiceForm.click();
	}
}


