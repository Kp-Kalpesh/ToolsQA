package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class DashboardPage extends TestBase{
	
	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement dashboardText;
	
	@FindBy(xpath = "//p[text()='Time at Work']")
	WebElement timeAtWork;

	@FindBy(xpath = "//p[text()='My Actions']")
	WebElement myActions;

	@FindBy(xpath = "//p[text()='Quick Launch']")
	WebElement quickLaunch;
	
	@FindBy(xpath = "(//span[contains(@class,'oxd-text oxd-text--span oxd-main-menu-item--name')])[5]")
	WebElement recruitmentBtn;

	
	//Initializing Page Objects
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public String dashboardPageTitle() {
		return driver.getTitle();
	}
	
	
	public String dashboardText() {
		String actDashText = dashboardText.getText();
		return actDashText;
	}
	
	public String timeAtWorkText() {
		String actTimeText = timeAtWork.getText();
		return actTimeText;
	}
	
	public String myActionsText() {
		String actMyActions = myActions.getText();
		return actMyActions;
	}
	
	public String quickLaunchText() {
		String actQuickLaunch = quickLaunch.getText();
		return actQuickLaunch;
	}
	
	//Dashboard page to recruitment page
	public RecruitmentPage clickOnRecruitmentLink() {
		recruitmentBtn.click();
		return new RecruitmentPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
