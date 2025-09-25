package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class InteractionPage extends TestBase{

	@FindBy(xpath = "//div[text()='Interactions']")
	WebElement interactionTextOnMenuBar;
	@FindBy(xpath = "(//li[@id='item-0'])[5]")
	WebElement sortableTextOnMenuBar;
	@FindBy(xpath = "(//li[@id='item-0'])[5]")
	WebElement clickOnSortableTextOnMenuBar;
	@FindBy(xpath = "//h1[text()='Sortable']")
	WebElement sortableTextOnPage;
	@FindBy(xpath = "//a[text()='List']")
	WebElement verifyListText;
	@FindBy(xpath = "(//div[text()='One'])[1]")
	WebElement verifyOneList;
	@FindBy(xpath = "(//div[text()='Two'])[1]")
	WebElement verifyTwoList;
	@FindBy(xpath = "(//div[text()='Three'])[1]")
	WebElement verifyThreeList;
	@FindBy(xpath = "(//div[text()='Four'])[1]")
	WebElement verifyFourList;
	@FindBy(xpath = "(//div[text()='Five'])[1]")
	WebElement verifyFiveList;
	@FindBy(xpath = "(//div[text()='Six'])[1]")
	WebElement verifySixList;
	@FindBy(xpath = "//a[text()='Grid']")
	WebElement verifyGridText;
	@FindBy(xpath = "//a[text()='Grid']")
	WebElement clickOnGridText;
	@FindBy(xpath = "(//div[text()='One'])[2]")
	WebElement verifyOneGrid;
	@FindBy(xpath = "(//div[text()='Two'])[2]")
	WebElement verifyTwoGrid;
	@FindBy(xpath = "(//div[text()='Three'])[2]")
	WebElement verifyThreeGrid;
	@FindBy(xpath = "(//div[text()='Four'])[2]")
	WebElement verifyFourGrid;
	@FindBy(xpath = "(//div[text()='Five'])[2]")
	WebElement verifyFiveGrid;
	@FindBy(xpath = "(//div[text()='Six'])[2]")
	WebElement verifySixGrid;	




	//Constructor
	public InteractionPage() {
		PageFactory.initElements(driver, this);
	}


	public String verifyInteractionTxt() {
		return interactionTextOnMenuBar.getText();
	}

	public String verifySortableTxtOnMenuBar() {
		return sortableTextOnMenuBar.getText();
	}

	public void clickOnSortableTxt() {
		clickOnSortableTextOnMenuBar.click();
	}

	public String verifySortableTxtOnPage() {
		return sortableTextOnPage.getText();
	}

	public String verifyListTxt() {
		return verifyListText.getText();
	}

	public String verifyOneInList() {
		return verifyOneList.getText();
	}

	public String verifyTwoInList() {
		return verifyTwoList.getText();
	}

	public String verifyThreeInList() {
		return verifyThreeList.getText();
	}

	public String verifyFourInList() {
		return verifyFourList.getText();
	}

	public String verifyFiveInList() {
		return verifyFiveList.getText();
	}

	public String verifySixInList() {
		return verifySixList.getText();
	}

	public String verifyGridTxt() {
		return verifyGridText.getText();
	}

	public void clickOnGridTxt() {
		clickOnGridText.click();
	}

	public String verifyFirstInGrid() {
		return verifyOneGrid.getText();
	}

	public String verifyTwoInGrid() {
		return verifyTwoGrid.getText();
	}

	public String verifyThreeInGrid() {
		return verifyThreeGrid.getText();
	}

	public String verifyFourInGrid() {
		return verifyFourGrid.getText();
	}

	public String verifyFiveInGrid() {
		return verifyFiveGrid.getText();
	}

	public String verifySixInGrid() {
		return verifySixGrid.getText();
	}

}
