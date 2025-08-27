package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{


	//use Pagefactory
	@FindBy(xpath = "(//div[@class ='avatar mx-auto white'])[1]")
	WebElement elements;

	@FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
	WebElement toolsQALogo;

	//Constructor
	//Initializing the page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}


	//Actions:
	public String validateHomePageTitle(){
		return driver.getTitle();
	}


	public boolean validateToolsQALogo(){
		return toolsQALogo.isDisplayed();
	}

	public ElementsPage clickOnElements(){
		elements.click();
		return new ElementsPage();
	}




}
