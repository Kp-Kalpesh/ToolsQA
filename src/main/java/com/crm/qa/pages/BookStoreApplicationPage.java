package com.crm.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class BookStoreApplicationPage extends TestBase{
	private Actions act;
	private Alert alt;

	@FindBy(xpath = "//div[text()='Book Store Application']")
	WebElement bookStoreApplication;
	@FindBy(xpath = "//span[text()='Profile']")
	WebElement profile;
	@FindBy(xpath = "//label[@id='notLoggin-label']")
	WebElement profileMessage;
	@FindBy(xpath = "//a[text()='register']")
	WebElement registerTxtOnLoginPage;
	@FindBy(xpath = "//h1[text()='Register']")
	WebElement registerTxtOnPage;
	@FindBy(xpath = "//h4[text()='Register to Book Store']")
	WebElement registerToBookStore;
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstNameField;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastNameField;
	@FindBy(xpath = "//input[@placeholder='UserName']")
	WebElement userNameField;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement passwordField;
	@FindBy(xpath = "(//div[@role='presentation'])[2]")
	WebElement captchaCheckBx;
	@FindBy(xpath = "//button[text()='Register']")
	WebElement registerBtn;
	@FindBy(xpath = "//button[text()='Back to Login']")
	WebElement backtoLoginBtn;
	//	@FindBy(xpath = "")
	//	WebElement profileMessage;
	//	@FindBy(xpath = "")
	//	WebElement profileMessage;
	//	@FindBy(xpath = "")
	//	WebElement profileMessage;
	//	@FindBy(xpath = "")
	//	WebElement profileMessage;
	//	@FindBy(xpath = "")
	//	WebElement profileMessage;
	//	@FindBy(xpath = "")
	//	WebElement profileMessage;
	//	@FindBy(xpath = "")
	//	WebElement profileMessage;
	//	@FindBy(xpath = "")
	//	WebElement profileMessage;
	//	@FindBy(xpath = "")
	//	WebElement profileMessage;
	//	@FindBy(xpath = "")
	//	WebElement profileMessage;
	//	@FindBy(xpath = "")
	//	WebElement profileMessage;
	//	@FindBy(xpath = "")
	//	WebElement profileMessage;
	//	@FindBy(xpath = "")
	//	WebElement profileMessage;




	//constructor
	public BookStoreApplicationPage() {
		PageFactory.initElements(driver, this);
		act = new Actions(driver);

	}

	//Actions
	public String verifyTabTextOnMenuBar() {
		return bookStoreApplication.getText();
		
	}

	public String veridyProfileTxtOnMenuBar() throws InterruptedException {
		Thread.sleep(2000);
		return profile.getText();
	}

	public void clickOnProfileTxtOnMenuBar() throws InterruptedException {
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.click(profile).perform();
//		profile.click
	}

	public String verifyLoginPageMessage() {
		return profileMessage.getText();
	}

	public String verifyRegisterTxtOnLoginPage() {
		return registerTxtOnLoginPage.getText();
	}

	public void clickOnRegisterTxt() {
		registerTxtOnLoginPage.click();
	}

	public String verifyRegisterTxtOnPage() {
		return registerTxtOnPage.getText();
	}

	public String verifyRegisterToBookStoreTxt() {
		return registerToBookStore.getText();
	}

	public boolean displayedFNameInputField() {
		return firstNameField.isDisplayed();
	}

	public void enterFName() {
		firstNameField.sendKeys("Kalpesh");
	}

	public boolean displayedLNameInputField() {
		return lastNameField.isDisplayed();
	}

	public void enterLname() {
		lastNameField.sendKeys("Patil");
	}

	public boolean displayedUNameField() {
		return userNameField.isDisplayed();
	}

	public void enterUName() {
		userNameField.sendKeys("Kalpesh.p");
	}

	public boolean displayedPasswordField() {
		return passwordField.isDisplayed();
	}

	public void enterPassword() {
		passwordField.sendKeys("Kalpesh@123");
	}

	public void checkOnChkBx() {
		captchaCheckBx.click();
	}

	public void clickOnRegisterBtn() {
		registerBtn.click();
		alt = driver.switchTo().alert();
		alt.accept();
	}

	public void clickOnBacktoLoginBtn() {
		backtoLoginBtn.click();
	}





}
