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

	@FindBy(xpath = "//span[text()='Practice Form']")
	WebElement practiceForm;
	@FindBy(xpath = "//h5[text()='Student Registration Form']")
	WebElement studentRegiFormText;
	@FindBy(xpath = "//input[contains(@placeholder,'First Name')]")
	WebElement firstName;
	@FindBy(xpath = "//input[contains(@placeholder,'Last Name')]")
	WebElement lastName;
	@FindBy(xpath = "//input[contains(@placeholder,'name@example.com')]")
	WebElement email;
	@FindBy(xpath = "(//input[contains(@name,'gender')])[1]")
	WebElement genderRadio;
	@FindBy(xpath = "//input[contains(@placeholder,'Mobile Number')]")
	WebElement mobNumber;
	@FindBy(xpath = "//input[contains(@id,'dateOfBirthInput')]")
	WebElement dob;
	@FindBy(xpath = "//div[contains(@class,'subjects-auto-complete__value')]")
	WebElement subjectField;
	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[1]")
	WebElement hobbiesChkBx;
	@FindBy(xpath = "(//textarea[contains(@placeholder,'Current Address')])[1]")
	WebElement currentAddress;
	@FindBy(xpath = "(//div[contains(text(),'Select State')])[1]")
	WebElement selectStateDrpDwn;
	@FindBy(xpath = "(//div[contains(@class,' css-1hwfws3')])[3]")
	WebElement selectCityDrpDwn;
	@FindBy(xpath = "//button[contains(@id,'submit')]")
	WebElement submitBtn;



	//Constructor(Initializing the page objects)
	public FormsPage() {
		PageFactory.initElements(driver, this);
		//		tstU = new TestUtil();		
		//		act = new Actions(driver);
	}

	public String verifyFormsText() {
		//		Forms.sendKeys(Keys.PAGE_DOWN);
		return Forms.getText();
	}

	public String verifyPracticeFormText() throws InterruptedException {
		Thread.sleep(2000);
		return practiceForm.getText();		
	}

	public void clickOnPracticeFormText() {
		practiceForm.click();
	}
}


