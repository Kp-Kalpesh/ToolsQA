package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;


public class AddCandidatePage extends TestBase{

	Select se;
	Actions act;

	@FindBy(xpath = "//h6[text()='Add Candidate']")
	WebElement addCandidate;
	@FindBy(xpath = "//input[contains(@name,'firstName')]")
	WebElement firstName;
	@FindBy(xpath = "//input[contains(@name,'middleName')]")
	WebElement middleName;
	@FindBy(xpath = "//input[contains(@name,'lastName')]")
	WebElement lastName;
	@FindBy(xpath = "//div[contains(@class,'oxd-select-text oxd-select-text--active')]")
	WebElement vacancyDrpDwn;

	@FindBy(xpath = "//div[text() = 'Senior QA Lead']")
	WebElement selectVacancy;

	@FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input--active')])[5]")
	WebElement email;
	@FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input--active')])[6]")
	WebElement contactNo;
	@FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input--active')])[7]")
	WebElement keyWords;
	@FindBy(xpath = "//i[contains(@class,'oxd-icon bi-calendar oxd-date-input-icon')]")
	WebElement clickOnDatePicker;
	@FindBy(xpath = "//textarea[@placeholder='Type here']")
	WebElement notes;
	@FindBy(xpath = "(//i[contains(@class,'oxd-icon')])[9]")
	WebElement chkbx;
	@FindBy(xpath = "//button[contains(@type,'submit')]")
	WebElement saveBtn;



	//	@FindBy(xpath = "//input[contains(@placeholder,'Type for hints')]")
	//	WebElement searchFilterName;
	//	@FindBy(xpath = "//button[@type='submit']")
	//	WebElement searchBtn;
	//	@FindBy(xpath = "(//div[contains(@class,'oxd-table-cell oxd-padding-cell')])[2]//div")
	//	WebElement verifyName;
	//	@FindBy(xpath = "((//div[contains(@class,'oxd-table-cell oxd-padding-cell')])[7]//button[@type='button'])[1]")
	//	WebElement clickOneye;


	//Initializing Page Objects
	public AddCandidatePage() {
		PageFactory.initElements(driver, this);
	}


	//Actions
	public String addCandidateText() {
		return addCandidate.getText();
	}

	public void enterFirstName(String fName) {
		firstName.sendKeys(fName);
	}

	public void enterMiddleName(String mName) {
		middleName.sendKeys(mName);
	}

	public void enterLastName(String lName) {
		lastName.sendKeys(lName);
	}



	//	public void selectVacancyInDrpDwn() {
	//		vacancyDrpDwn.click();
	//
	//		WebDriverWait wait = new WebDriverWait(driver, 10);
	//
	//		List<WebElement> options = wait.until(
	//				ExpectedConditions.presenceOfAllElementsLocatedBy(
	//						By.xpath("//div[contains(@class, 'oxd-select-dropdown')]/*")
	//						)
	//				);
	//
	//		//Actions class
	//		act = new Actions(driver);
	//		act.moveToElement(vacancyDrpDwn).click().perform();
	//
	//	}




	public void enterEmail(String eMail) {
		email.click();
		email.sendKeys(eMail);
	}

	public void enterContactNo(String mobNo) {
		contactNo.click();
		contactNo.sendKeys(mobNo);
	}

	public void enterKeyword(String keyWord) {
		keyWords.click();
		keyWords.sendKeys(keyWord);
	}

	public void selectDate() {
		clickOnDatePicker.click();

		se = new Select(clickOnDatePicker);
		se.selectByIndex(5);
	}

	//		public void enterNotes(String note) {
	//			notes.sendKeys(note);
	//		}
	//
	//	public void checkChbx() {
	//		chkbx.click();
	//	}

	//	public void clickSave() {
	//		saveBtn.click();
	//	}


}
