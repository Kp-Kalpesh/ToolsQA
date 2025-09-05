package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	public ElementsPage clickOnElements() {
		WebDriverWait wait = new WebDriverWait(driver, (10));

		try {
			WebElement element = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class ='avatar mx-auto white'])[1]")));
			element.click();
		} catch (TimeoutException e) {
			System.out.println("Element was not found within the timeout period.");
			// Optional: Take screenshot or log error
		}
//		elements.click();
		return new ElementsPage();
	}




}
