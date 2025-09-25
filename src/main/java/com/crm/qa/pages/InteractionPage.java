package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class InteractionPage extends TestBase{
	
	@FindBy(xpath = "//div[text()='Interactions']")
	WebElement interactionTextOnMenuBar;
	
	
	
	//Constructor
	public InteractionPage() {
		PageFactory.initElements(driver, this);
	}

	
	public String verifyInteractionTxt() {
		return interactionTextOnMenuBar.getText();
	}
	
	
	
}
