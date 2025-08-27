package com.crm.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ElementsPage extends TestBase{

	@FindBy(xpath = "//div[text()='Elements']")
	WebElement elementText;

	//TextBox
	@FindBy(xpath = "(//li[@id='item-0'])[1]")
	WebElement clickOnTextBox;
	@FindBy(xpath = "//input[contains(@placeholder,'Full Name')]")
	WebElement fullName;
	@FindBy(xpath = "//input[contains(@placeholder,'name')]")
	WebElement userEmail;
	@FindBy(xpath = "//textarea[contains(@placeholder,'Current Address')]")
	WebElement currentAddress;
	@FindBy(xpath = "(//textarea[contains(@class,'form-control')])[2]")
	WebElement permanentAddress;
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	WebElement submitBtn;
	@FindBy(xpath = "//p[@id='name']")
	WebElement verifyName;
	@FindBy(xpath = "//p[@id='email']")
	WebElement verifyEmail;
	@FindBy(xpath = "//p[@id='currentAddress']")
	WebElement verifyCAddress;
	@FindBy(xpath = "//p[@id='permanentAddress']")
	WebElement verifyPAddress;
	




	@FindBy(xpath = "(//li[@id='item-1'])[1]")
	WebElement clickOncheckBx;

	//Constructor
	//Initializing the page objects
	public ElementsPage() {
		PageFactory.initElements(driver, this);
	}


	public String elementsText() {
		return elementText.getText();
	}

	public void clickOnTextBox() {
		clickOnTextBox.click();
	}

	public void enterFullName(String name) {
		fullName.sendKeys(name);
	}

	public void enterEmail(String email) {
		userEmail.sendKeys(email);
	}

	public void enterCurrentAddress(String cAddress) {
		currentAddress.sendKeys(cAddress);
	}

	public void enterPeramanentAddress(String pAddress) {
		permanentAddress.sendKeys(pAddress);
	}

	public void clickOnSubmitBtn() {
		submitBtn.sendKeys(Keys.PAGE_DOWN);
		submitBtn.click();
	}
	
	public String verifyFullName() {
		System.out.println(verifyName.getText());
		return verifyName.getText();
	}
	
	public String verifyUserEmail() {
		System.out.println(verifyEmail.getText());
		return verifyEmail.getText();
	}
	
	public String verifyCurrentAddress() {
		System.out.println(verifyCAddress.getText());
		return verifyCAddress.getText();
	}
	
	public String verifyPeramanentAddress() {
		System.out.println(verifyPAddress.getText());
		return verifyPAddress.getText();
	}

	public void clickOnCheckBoxText() {
		clickOncheckBx.click();
	}




}
