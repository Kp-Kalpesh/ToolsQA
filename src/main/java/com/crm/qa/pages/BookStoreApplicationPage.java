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
	@FindBy(xpath = "//a[text()='login']")
	WebElement LoginTxtOnLoginPage;
	@FindBy(xpath = "//h1[text()='Login']")
	WebElement LoginTxtOnPage;
	@FindBy(xpath = "//h5[text()='Login in Book Store']")
	WebElement loginToBookStore;
	@FindBy(xpath = "//input[@placeholder='UserName']")
	WebElement userNameField;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement passwordField;
	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginBtn;

	@FindBy(xpath = "//button[text()='Go To Book Store']")
	WebElement goToStore;
	@FindBy(xpath = "//label[text()='User Name : ']")
	WebElement userName;
	@FindBy(xpath = "//label[@id='userName-value']")
	WebElement actUserName;
	@FindBy(xpath = "//input[@placeholder='Type to search']")
	WebElement searchField;
	@FindBy(xpath = "//span[@id='see-book-Git Pocket Guide']//a")
	WebElement bookName;
	@FindBy(xpath = "(//div[@role='gridcell'])[3]")
	WebElement authorName;
	@FindBy(xpath = "(//div[@role='gridcell'])[4]")
	WebElement publisherName;
	@FindBy(xpath = "//button[text()='Log out']")
	WebElement logoutBtn;
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

	public String verifyLoginTxtOnLoginPage() {
		return LoginTxtOnLoginPage.getText();
	}

	public void clickOnLoginTxt() {
		LoginTxtOnLoginPage.click();
	}

	public String verifyLoginTxtOnPage() {
		return LoginTxtOnPage.getText();
	}

	public String verifyLoginToBookStoreTxt() {
		return loginToBookStore.getText();
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

	public void clickOnLoginBtn() {
		loginBtn.click();
	}

	public void clickOnGoToStoreBtn() {
		act.sendKeys(Keys.PAGE_DOWN).perform();
		goToStore.click();
	}

	public String verifyUsername() {
		return userName.getText();
	}

	public String verifyActualUserName() {
		return actUserName.getText();
	}

	public void enterDataInSearchField() {
		searchField.sendKeys("Git Pocket Guide");
	}

	public String verifyBookName() {
		return bookName.getText();
	}

	public String verifyAuthorName() {
		return authorName.getText();
	}

	public String verifyPublisherName() {
		return publisherName.getText();
	}

	public void clickOnLogoutBtn() {
		logoutBtn.click();
	}
}
