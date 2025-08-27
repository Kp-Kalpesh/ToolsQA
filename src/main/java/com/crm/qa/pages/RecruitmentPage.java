package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class RecruitmentPage extends TestBase{
	Select se;

	@FindBy(xpath = "//h6[text()='Recruitment']")
	WebElement recruitmentText;
	@FindBy(xpath = "(//button[contains(@type,'button')])[5]")
	WebElement addBtn;
	
	


	//Initializing Page Objects
	public RecruitmentPage() {
		PageFactory.initElements(driver, this);
	}

	//Actions
	public String recruitmentPageText() {
		return recruitmentText.getText();
	}

	public AddCandidatePage clickOnAddBtn() {
		addBtn.click();
		return new AddCandidatePage();
	}

}


