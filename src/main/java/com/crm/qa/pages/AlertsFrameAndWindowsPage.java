package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class AlertsFrameAndWindowsPage extends TestBase{

	Actions act;
	String mainWindow;
	private TestUtil tstU;



	@FindBy(xpath = "//div[text()='Alerts, Frame & Windows']")
	WebElement clickAlertFramesAndWindows;
	@FindBy(xpath ="(//li[@id='item-0'])[3]")
	WebElement bwsWintextOnMenuBar;
	@FindBy(xpath = "//h1[contains(text(),'Browser Windows')]")
	WebElement browserWindowstxt;	
	@FindBy(xpath = "//button[contains(text(),'New Tab')]")
	WebElement newTab;	
	@FindBy(xpath = "//h1[contains(text(),'This is a sample page')]")
	WebElement newTabBtnMessage;
	@FindBy(xpath = "(//button[contains(text(),'New Window')])[1]")
	WebElement newWindow;	
	@FindBy(xpath = "//h1[text()='This is a sample page']")
	WebElement newWindowBtnMessage;
	@FindBy(xpath = "//button[contains(text(),'New Window Message')]")
	WebElement newWindowMessage;
	@FindBy(xpath = "(//body)[1]")
	WebElement newWindowMessageBtnText;


	//Constructor(Initializing the page objects)
	public AlertsFrameAndWindowsPage() {
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
		mainWindow = driver.getWindowHandle();
		tstU = new TestUtil();	
	}

	public String verifyAlertsTabText() {
		return clickAlertFramesAndWindows.getText();
	}

	public String verifyBwsWinTxtOnMenuBar() throws InterruptedException {
		Thread.sleep(2000);
		return bwsWintextOnMenuBar.getText();
	}

	public void clickOnBwsWinOnMenu() {
		bwsWintextOnMenuBar.click();
	}

	public String verifyBrowseWidnowTxt() {
		return browserWindowstxt.getText();
	}

	public void clickOnNewTab() {
		newTab.click();
		tstU.windowHandleCode();		
	}

	public String verifyNewTabMessage() throws InterruptedException {
		String newTbMessage = newTabBtnMessage.getText();
		driver.close();
		tstU.switchToMainwindow();
		return newTbMessage;
	}

	public void clickOnNewWindow() {
		newWindow.click();
		tstU.windowHandleCode();		
	}

	public String verifyNewWindowMessage() {
		String actNewWindowMessage = newWindowBtnMessage.getText();
		driver.close();
		tstU.switchToMainwindow();
		return actNewWindowMessage;
	}

	public void clickOnNewWindowMessageBtn() {
		newWindowMessage.click();
		tstU.windowHandleCode();	
	}

	public void verifyNewWindowMessageText() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, (10));

		try {
			WebElement element = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("(//body)[1]"))
					);
			String actTextNew = element.getText();
			System.out.println("actTextNew: " + actTextNew);

		} catch (TimeoutException e) {
			System.out.println("Element was not found within the timeout period.");
			// Optional: Take screenshot or log error
		}
		//		String actNewwindowMessageTxt = newWindowMessageBtnText.getText();
		driver.close();
		tstU.switchToMainwindow();
		//		return actTextNew;s
	}
}
