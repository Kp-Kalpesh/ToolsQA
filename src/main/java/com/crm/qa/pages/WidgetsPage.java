package com.crm.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class WidgetsPage extends TestBase{
	Actions act;


	@FindBy(xpath = "//div[text()='Widgets']")
	WebElement WidgetTab;
	@FindBy(xpath = "(//li[@id='item-0'])[4]")
	WebElement accordianTextOnMenuBar;
	@FindBy(xpath = "//h1[text()='Accordian']")
	WebElement accordianTextOnPage;
	@FindBy(xpath = "//div[@id='section1Heading']")
	WebElement box1Text;
	@FindBy(xpath = "//div[@id='section2Heading']")
	WebElement box2Text;
	@FindBy(xpath = "//div[@id='section3Heading']")
	WebElement box3text;

	@FindBy(xpath = "(//li[@id='item-1'])[3]")
	WebElement autoCompleteTab;
	@FindBy(xpath = "//h1[text()='Auto Complete']")
	WebElement autoCompleteTextOnPage;
	@FindBy(xpath = "//input[@id='autoCompleteMultipleInput']")
	WebElement multipleColorNames;
	@FindBy(xpath = "//input[@id='autoCompleteSingleInput']")
	WebElement singleColorNames;

	@FindBy(xpath = "(//li[@id='item-3'])[3]")
	WebElement sliderTabOnMenuBar;
	@FindBy(xpath = "//h1[text()='Slider']")
	WebElement sliderTextonPage;
	@FindBy(xpath = "//input[@type='range']")
	WebElement sliderHorScroll;
	@FindBy(xpath = "//div[@class='range-slider__tooltip__label']")
	WebElement silderValue;

	@FindBy(xpath = "(//li[@id='item-4'])[3]")
	WebElement ProgressBarTextOnMenuBar;
	@FindBy(xpath = "//h1[text()='Progress Bar']")
	WebElement ProgressTextOnPage;
	@FindBy(xpath = "//button[@id='startStopButton']")
	WebElement startStopBtn;
	@FindBy(xpath = "//button[@id='resetButton']")
	WebElement resetBtn;
	@FindBy(xpath = "//div[@class='progress-bar bg-success']")
	WebElement getProgressBarText;



	//Constructor
	public WidgetsPage() {
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}

	//Actions
	//Accordian
	public String verifyWidgetTextOnMenuBar() {
		return WidgetTab.getText();
	}

	public String verifyAccordianTextOnMenuBar() throws InterruptedException {
		Thread.sleep(3000);
		return accordianTextOnMenuBar.getText();
	}

	public void clickAccordianTextOnMenuBar() {
		accordianTextOnMenuBar.click();
	}

	public String verifyaccordianTextOnPage() {
		return accordianTextOnPage.getText();
	}

	public String verifyBoxOneText() {
		return box1Text.getText();
	}

	public String veifyBox2Text() {
		return box2Text.getText();
	}

	public void clickOnBox2Text() {
		box2Text.click();
	}

	public String verifybox3Text() {
		return box3text.getText();
	}

	public void clickOnBox3Text() {
		box3text.click();
	}

	//Auto Completed
	public String verifyAutoCompleteTextOnMenuBar() throws InterruptedException {
		Thread.sleep(3000);
		return autoCompleteTab.getText();
	}

	public void clickOnAutoCompleteTab() {
		autoCompleteTab.click();
	}

	public String verifyOnAutoCompleteTextOnPage() {
		return autoCompleteTextOnPage.getText();
	}

	public void enterMultipleColors(String Red) throws InterruptedException {
		Actions act = new Actions(driver);
		try {
			act.click(multipleColorNames).perform();
			act.sendKeys(multipleColorNames, Red).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();
			act.sendKeys(Keys.TAB).perform();

		} catch (Exception e) {
			System.err.println("Test failed due to: " + e.getClass().getName() + " - " + e.getMessage());
			e.printStackTrace();
			Assert.fail("Test failed due to: " + e.getMessage());
		}
	}

	public void enterSingleColorName(String white) throws InterruptedException {
		act.sendKeys(singleColorNames, white).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
	}

	//Slider
	public String verifySliderTextOnMenuBar() throws InterruptedException {
		Thread.sleep(2000);
		return sliderTabOnMenuBar.getText();
	}

	public void clickOnsliderTab() {
		sliderTabOnMenuBar.click();
	}

	public String verifySliderTextOnPage() {
		return sliderTextonPage.getText();
	}

	public void slideTheHorizontalScroll() throws InterruptedException {
		Thread.sleep(1000);
		act.clickAndHold(sliderHorScroll).moveByOffset(50, 0).release().perform();
	}

	public String verifyResultValue() {
		return silderValue.getText();
	}

}
