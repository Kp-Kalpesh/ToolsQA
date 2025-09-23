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
	@FindBy(xpath = "//div[@role='progressbar']")
	WebElement runningTaskStatus;
	@FindBy(xpath = "//button[@id='resetButton']")
	WebElement resetBtn;
	@FindBy(xpath = "//div[@class='progress-bar bg-success']")
	WebElement getProgressBarText;


	//Tabs
	@FindBy(xpath = "(//li[@id='item-5'])[2]")
	WebElement tabsTextOnMenuBar;
	@FindBy(xpath = "//h1[text()='Tabs']")
	WebElement TabsTxtOnPage;
	@FindBy(xpath = "//a[text()='What']")
	WebElement verifyWhatTxt;
	@FindBy(xpath = "//a[text()='Origin']")
	WebElement verifyOriginTxt;
	@FindBy(xpath = "//a[text()='Origin']")
	WebElement clickOnOrigin;
	@FindBy(xpath = "//a[text()='Use']")
	WebElement verifyUseTxt;
	@FindBy(xpath = "//a[text()='Use']")
	WebElement clickOnUse;
	@FindBy(xpath = "//a[text()='More']")
	WebElement verifyMoreTxt;

	//ToolTips
	@FindBy(xpath = "(//li[@id='item-6'])[2]")
	WebElement toolTiptxtOnMenu;
	@FindBy(xpath = "//h1[text()='Tool Tips']")
	WebElement toolTiptxtOnPage;
	@FindBy(xpath = "//button[@id='toolTipButton']")
	WebElement hoverMeToSeeBtn;
	@FindBy(xpath = "//div[text()='You hovered over the Button']")
	WebElement btnTooltipTxt;
	@FindBy(xpath = "//input[@id='toolTipTextField']")
	WebElement hoverInputField;
	@FindBy(xpath = "//div[text()='You hovered over the text field']")
	WebElement inputFieldTooltipTxt;

	//menu
	@FindBy(xpath = "(//li[@id='item-7'])[2]")
	WebElement menuTextOnMenuBar;	
	@FindBy(xpath = "//h1[text()='Menu']")
	WebElement menuTxtOnPage;
	@FindBy(xpath = "//a[text()='Main Item 1']")
	WebElement mainItem_1;
	@FindBy(xpath = "//a[text()='Main Item 2']")
	WebElement mainItem_2;
	@FindBy(xpath = "(//a[text()='Sub Item'])[1]")
	WebElement subItem_1;
	@FindBy(xpath = "(//a[text()='Sub Item'])[2]")
	WebElement subItem_2;
	@FindBy(xpath = "//a[text()='SUB SUB LIST »']")
	WebElement subList;
	@FindBy(xpath = "//a[text()='Sub Sub Item 1']")
	WebElement subSubItem_1;
	@FindBy(xpath = "//a[text()='Sub Sub Item 2']")
	WebElement subSubItem_2;
	@FindBy(xpath = "//a[text()='Main Item 3']")
	WebElement mainItem_3;

	//Select menu
	@FindBy(xpath = "(//li[@id='item-8'])[2]")
	WebElement selectMenuTextOnMenuBar;
	
	
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

	//ProgressBar
	public String verifyProgressBarTextOnMenuBar() throws InterruptedException {
		Thread.sleep(3000);
		return ProgressBarTextOnMenuBar.getText();
	}

	public void clickOnProgressBartextonMenu() {
		ProgressBarTextOnMenuBar.click();
	}

	public String verifyProgressBarTextOnPage() {
		return ProgressTextOnPage.getText();
	}

	public void clickOnStartBtn() {
		startStopBtn.click();
	}

	public void clickOnStopBtn() throws InterruptedException {
		Thread.sleep(5000);
		startStopBtn.click();
	}

	public String verifyRunningProgressBar() {
		return runningTaskStatus.getText();
	}

	public void clickOnAgainStartBtn() throws InterruptedException {
		Thread.sleep(3000);
		startStopBtn.click();
	}

	public String verifyCompletedProgressBarTxt() throws InterruptedException {
		Thread.sleep(7000);
		return getProgressBarText.getText();
	}

	public void clickOnResetBtn() {
		resetBtn.click();
	}

	//Tabs
	public String verifyTabsTxtOnMenuBar() throws InterruptedException {
		Thread.sleep(3000);
		act.sendKeys(tabsTextOnMenuBar, Keys.PAGE_DOWN).perform();
		return tabsTextOnMenuBar.getText();
	}

	public void clickOnTabsTxtOnMenuBar() throws InterruptedException {
		Thread.sleep(1000);
		tabsTextOnMenuBar.click();
	}

	public String verifyTabsTxtOnPage() throws InterruptedException {
		Thread.sleep(1000);
		return TabsTxtOnPage.getText();
	}

	public String verifyWhatTxt() throws InterruptedException {
		Thread.sleep(1000);
		return verifyWhatTxt.getText();
	}

	public String verifyOriginTxt() throws InterruptedException {
		Thread.sleep(1000);
		return verifyOriginTxt.getText();
	}

	public void clickOnOrigin() throws InterruptedException {
		Thread.sleep(1000);
		clickOnOrigin.click();
	}

	public String verifyUseTxt() throws InterruptedException {
		Thread.sleep(1000);
		return verifyUseTxt.getText();
	}

	public void clickOnUse() throws InterruptedException {
		Thread.sleep(2000);
		clickOnUse.click();
	}

	public String verifyMoreText() throws InterruptedException {
		Thread.sleep(1000);
		return verifyMoreTxt.getText();
	}

	//Tooltips
	public String verifyToolTiptextOnMenu() throws InterruptedException {
		Thread.sleep(2000);
		act.sendKeys(tabsTextOnMenuBar, Keys.PAGE_DOWN).perform();
		return toolTiptxtOnMenu.getText();
	}

	public void clickOnToolTipTxt() throws InterruptedException {
		Thread.sleep(1000);
		toolTiptxtOnMenu.click();
	}

	public String verifyTooltipTxtOnPage() {
		return toolTiptxtOnPage.getText();
	}

	public void hoverMouseOnBtn() {
		act.click(hoverMeToSeeBtn).perform();
	}

	public String verifyBtnHoverText() throws InterruptedException {
		Thread.sleep(1000);
		return btnTooltipTxt.getText();
	}

	public void hoverMouseOnInputField() {
		act.click(hoverInputField).perform();
	}

	public String verifyInputFieldTooltiptxt() {
		return inputFieldTooltipTxt.getText();
	}

	//Menu
	public String verifyMenuTxtOnMenuBar() throws InterruptedException {
		Thread.sleep(3000);
		act.sendKeys(menuTextOnMenuBar, Keys.PAGE_DOWN);
		return menuTextOnMenuBar.getText();
	}

	public void clickOnMenuTxtOnMenuBar() {
		menuTextOnMenuBar.click();
	}

	public String verifyMenuTxtOnPage() {
		return menuTxtOnPage.getText();
	}

	public String verifyMainItem1() {
		return mainItem_1.getText();
	}

	public String verifyMainItem2() {
		return mainItem_2.getText();
	}

	public String verifySubItem1() {
		act.moveToElement(mainItem_2);
		return subItem_1.getText();
	}

	public String verifySubItem2() {
		//		act.moveToElement(mainItem_2);
		return subItem_2.getText();
	}

	public String verifySubList() {
		return subList.getText();
	}

	public String verifySubListitem1() {
		act.sendKeys(subList);
		return subSubItem_1.getText();
	}

	public String verifySubListItem2() {
		return subSubItem_2.getText();
	}

	public String verifyMainItem3() {
		return mainItem_3.getText();
	}
}
