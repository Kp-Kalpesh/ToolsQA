package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class FormsPage extends TestBase{
	//	private TestUtil tstU;
	private Actions act;
	//	private Select se;
	JavascriptExecutor js;


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
	@FindBy(xpath = "//label[@for='gender-radio-1']")
	WebElement genderRadio;
	@FindBy(xpath = "//input[contains(@placeholder,'Mobile Number')]")
	WebElement mobNumber;
	@FindBy(xpath = "//input[contains(@id,'dateOfBirthInput')]")
	WebElement dob;
	@FindBy(xpath = "//input[@id='uploadPicture']")
	WebElement uploadPic;

	@FindBy(xpath = "//select//option[text()='August']")
	WebElement selectMonth;
	@FindBy(xpath = "//option[text()='1998']")
	WebElement selectYr;
	@FindBy(xpath = "(//div[text()='3'])[1]")
	WebElement selectDate;

	@FindBy(xpath = "//input[@id='subjectsInput']")
	WebElement subjectField;
	@FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
	WebElement hobbiesChkBx;
	@FindBy(xpath = "(//textarea[contains(@placeholder,'Current Address')])[1]")
	WebElement currentAddress;
	@FindBy(xpath = "(//div[contains(text(),'Select State')])[1]")
	WebElement selectStateDrpDwn;
	@FindBy(xpath = "(//div[contains(@class,' css-1hwfws3')])[3]")
	WebElement selectCityDrpDwn;
	@FindBy(xpath = "//button[contains(@id,'submit')]")
	WebElement submitBtn;
	@FindBy(xpath = "//div[@id='example-modal-sizes-title-lg']")
	WebElement submittedData;
	@FindBy(xpath = "(//tbody//tr/td)[2]")
	WebElement FullName;
	@FindBy(xpath = "//button[@id='closeLargeModal']")
	WebElement closeBtn;
	@FindBy(xpath = "//div[text()='Alerts, Frame & Windows']")
	WebElement clickAlertFramesAndWindows;


	//Constructor(Initializing the page objects)
	public FormsPage() {
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
		js = (JavascriptExecutor) driver;
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

	public String verifyRegisterFormText() {
		return studentRegiFormText.getText();
	}

	public void enterFName(String fName) {
		firstName.sendKeys(fName);
	}

	public void enterLName(String lName) {
		lastName.sendKeys(lName);
	}

	public void enterEmail(String uEmail) {
		email.sendKeys(uEmail);
	}

	public void selectGenderRadioBtn() throws InterruptedException {
		Thread.sleep(1000);
		genderRadio.click();
	}

	public void enterMobileNumber(String mNum) {
		mobNumber.sendKeys(mNum);
	}

	//	public void selectDOB() throws InterruptedException {
	//		
	//	}

	public void enterSubject(String sub) throws InterruptedException {
		Thread.sleep(2000);
		subjectField.sendKeys(sub);
		subjectField.sendKeys(Keys.ENTER);
		subjectField.sendKeys(Keys.PAGE_DOWN);
	}

	public void selectHobbiesChkBx() throws InterruptedException {
		Thread.sleep(2000);
		hobbiesChkBx.click();
	}

	public void selectPicture(String selPicUrl) {
		uploadPic.sendKeys(selPicUrl);
	}

	public void enterCurrentAddress(String cAddress) {
		currentAddress.sendKeys(cAddress);
	}

	public void selectState(String uState) throws InterruptedException {
		selectStateDrpDwn.click();		
		act.sendKeys(selectStateDrpDwn, uState).perform();
		act.sendKeys(Keys.ENTER).perform();
	}

	public void selectCity(String userCity) throws InterruptedException {
		selectCityDrpDwn.click();
		act.sendKeys(selectCityDrpDwn, userCity).perform();
		act.sendKeys(Keys.ENTER).perform();
	}

	public void submitFormBtn() {
		submitBtn.click();
	}

	public String verifySubmittedForm() throws InterruptedException {
		Thread.sleep(500);
		return submittedData.getText();
	}

	public String verifyUserName() throws InterruptedException {
		Thread.sleep(500);
		return FullName.getText();
	}

	public void clickOnClose() {
		closeBtn.click();
	}

	public AlertsFrameAndWindowsPage clickOnAlertsFramesAndwindowsTab() {		
		js.executeScript("window.scrollBy(0,500)");
		clickAlertFramesAndWindows.click();
		return new AlertsFrameAndWindowsPage();
	}
}


