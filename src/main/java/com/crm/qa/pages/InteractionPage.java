package com.crm.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class InteractionPage extends TestBase{

	Actions act;

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

	//Selectable
	@FindBy(xpath = "(//li[@id='item-1'])[4]")
	WebElement SelectableTxtOnMenuBar;
	@FindBy(xpath = "(//li[@id='item-1'])[4]")
	WebElement clickOnSelectableTxtOnMenuBar;
	@FindBy(xpath = "//h1[text()='Selectable']")
	WebElement SelectableTxtOnPage;
	@FindBy(xpath = "//a[text()='List']")
	WebElement ListTxtOnPage;
	@FindBy(xpath = "//li[text()='Cras justo odio']")
	WebElement clickOnTxt_1inList;
	@FindBy(xpath = "//li[text()='Dapibus ac facilisis in']")
	WebElement clickOnTxt_2inList;
	@FindBy(xpath = "//li[text()='Morbi leo risus']")
	WebElement clickOnTxt_3inList;
	@FindBy(xpath = "//li[text()='Porta ac consectetur ac']")
	WebElement clickOnTxt_4inList;
	@FindBy(xpath = "//a[text()='Grid']")
	WebElement clickOnGridTxtOnPage;
	@FindBy(xpath = "//li[text()='One']")
	WebElement clickOnOneTxtInGrid;
	@FindBy(xpath = "//li[text()='Two']")
	WebElement clickOnTwoTxtInGrid;
	@FindBy(xpath = "//li[text()='Three']")
	WebElement clickOnThreeTxtInGrid;
	@FindBy(xpath = "//li[text()='Four']")
	WebElement clickOnFourTxtInGrid;
	@FindBy(xpath = "//li[text()='Five']")
	WebElement clickOnFiveTxtInGrid;
	@FindBy(xpath = "//li[text()='Six']")
	WebElement clickOnSixTxtInGrid;
	@FindBy(xpath = "//li[text()='Seven']")
	WebElement clickOnSevenTxtInGrid;
	@FindBy(xpath = "//li[text()='Eight']")
	WebElement clickOnEightTxtInGrid;
	@FindBy(xpath = "//li[text()='Nine']")
	WebElement clickOnNineTxtInGrid;

	//Resizable
	@FindBy(xpath = "(//li[@id='item-2'])[4]")
	WebElement resizableTxtOnMenuBar;
	@FindBy(xpath = "//h1[text()='Resizable']")
	WebElement resizableTxtOnPage;
	@FindBy(xpath = "(//div[@class='text'])[1]")
	WebElement boxSizeRatio;
	@FindBy(xpath = "(//span[contains(@class,'react-resizabl')])[1]")
	WebElement cursor_1;

	//Doapable
	@FindBy(xpath = "(//li[@id='item-3'])[4]")
	WebElement dropableTxtOnMenuBar;
	@FindBy(xpath = "//h1[text()='Droppable']")
	WebElement dropableTxtOnPage;
	@FindBy(xpath = "//a[text()='Simple']")
	WebElement simpleTxtOnPage;
	@FindBy(xpath = "//div[text()='Drag me']")
	WebElement dragMeBx;
	@FindBy(xpath = "(//div[@id='droppable'])[1]")
	WebElement dropherebx;
	@FindBy(xpath = "//a[text()='Accept']")
	WebElement acceptTxtOnPage;
	@FindBy(xpath = "//div[text()='Acceptable']")
	WebElement acceptableDragBx;
	@FindBy(xpath = "(//div[@id='droppable'])[2]")
	WebElement acceptableDropBx;
	@FindBy(xpath = "//a[text()='Prevent Propogation']")
	WebElement preventPorpTxtOnPage;
	@FindBy(xpath = "//div[text()='Drag Me']")
	WebElement dragMeBx_2;
	@FindBy(xpath = "//div[@id='notGreedyInnerDropBox']")
	WebElement dropMeBx_2;
	@FindBy(xpath = "//a[text()='Revert Draggable']")
	WebElement revertDraggableTxtOnPage;
	@FindBy(xpath = "//div[text()='Will Revert']")
	WebElement willRevert;
	@FindBy(xpath = "(//div[@id='droppable'])[3]")
	WebElement dropedBx;
	@FindBy(xpath = "//div[text()='Not Revert']")
	WebElement notRevert;
	@FindBy(xpath = "//p[text()='Drop here']")
	WebElement DropBxtxt;
	@FindBy(xpath = "//p[text()='Dropped!']")
	WebElement DropBxtxt1;


	//Dragable
	@FindBy(xpath = "(//li[@id='item-4'])[4]")
	WebElement dragableTxtOnMenuBar;
@FindBy(xpath = "//h1[text()='Dragabble']")
WebElement dragabbleTxtOnpage;

	//Constructor
	public InteractionPage() {
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}


	public String verifyInteractionTxt() {
		return interactionTextOnMenuBar.getText();
	}

	public String verifySortableTxtOnMenuBar() throws InterruptedException {
		Thread.sleep(1000);
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

	public String verifyOneInList() throws InterruptedException {
		Thread.sleep(1000);
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

	public String verifyFirstInGrid() throws InterruptedException {
		Thread.sleep(2000);
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

	//Selectable Actions methods
	public String verifySelectableTxtOnMenuBar() throws InterruptedException {
		Thread.sleep(2000);
		return SelectableTxtOnMenuBar.getText();
	}

	public void clickOnSelectableTxtOnMenuBar() {
		clickOnSelectableTxtOnMenuBar.click();
	}

	public String verifySelectableTxtOnPage() {
		return SelectableTxtOnPage.getText();
	}

	public String verifyListTxtOnPage() {
		return ListTxtOnPage.getText();
	}

	public String verifyAndClickOn1stTxtOnPage() throws InterruptedException {
		Thread.sleep(1000);
		clickOnTxt_1inList.click();
		return clickOnTxt_1inList.getText();
	}

	public String verifyAndClickOn2ndTxtOnPage() throws InterruptedException {
		Thread.sleep(1000);
		clickOnTxt_2inList.click();
		return clickOnTxt_2inList.getText();
	}

	public String verifyAndClickOn3rdTxtOnPage() throws InterruptedException {
		Thread.sleep(1000);
		clickOnTxt_3inList.click();
		return clickOnTxt_3inList.getText();
	}

	public String verifyAndClickOn4thTxtOnPage() throws InterruptedException {
		Thread.sleep(1000);
		act.sendKeys(clickOnTxt_4inList, Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		clickOnTxt_4inList.click();
		return clickOnTxt_4inList.getText();
	}

	public String verifyGridTxtOnPage() {
		return clickOnGridTxtOnPage.getText();
	}

	public void clickOnGridTxtOnPage() {
		clickOnGridTxtOnPage.click();
	}

	public String verifyAndClick1stBoxTxtOnPage() {
		clickOnOneTxtInGrid.click();
		return clickOnOneTxtInGrid.getText();
	}

	public String verifyAndClick2ndBoxTxtOnPage() {
		clickOnTwoTxtInGrid.click();
		return clickOnTwoTxtInGrid.getText();
	}

	public String verifyAndClick3rdBoxTxtOnPage() {
		clickOnThreeTxtInGrid.click();
		return clickOnThreeTxtInGrid.getText();
	}

	public String verifyAndClick4thBoxTxtOnPage() {
		clickOnFourTxtInGrid.click();
		return clickOnFourTxtInGrid.getText();
	}

	public String verifyAndClick5thBoxTxtOnPage() {
		clickOnFiveTxtInGrid.click();
		return clickOnFiveTxtInGrid.getText();
	}

	public String verifyAndClick6thBoxTxtOnPage() {
		clickOnSixTxtInGrid.click();
		return clickOnSixTxtInGrid.getText();
	}

	public String verifyAndClick7thBoxTxtOnPage() {
		clickOnSevenTxtInGrid.click();
		return clickOnSevenTxtInGrid.getText();
	}

	public String verifyAndClick8thBoxTxtOnPage() {
		clickOnEightTxtInGrid.click();
		return clickOnEightTxtInGrid.getText();
	}

	public String verifyAndClick9thBoxTxtOnPage() {
		clickOnNineTxtInGrid.click();
		return clickOnNineTxtInGrid.getText();
	}

	//Resizable
	public String verifyResizableTxtOnMenu() throws InterruptedException {
		Thread.sleep(2000);
		return resizableTxtOnMenuBar.getText();
	}

	public void clickOnResizableTxtOnMenuBar() {
		resizableTxtOnMenuBar.click();
	}

	public String verifyResizableTxtOnPage() {
		return resizableTxtOnPage.getText();
	}

	public String verifyMessageOfRisizableBox() {
		return boxSizeRatio.getText();
	}

	public void expandBoxSize() throws InterruptedException {
		Thread.sleep(3000);
		act.clickAndHold(cursor_1).perform();
		Thread.sleep(2000);
		act.moveByOffset(500,300).perform();
		Thread.sleep(1000);
		act.release().perform();
		//		act.dragAndDropBy(cursor_1, 300, 200).release().build().perform();
	}

	//Dropable
	public String verifyDropableTxtOnMenuBar() throws InterruptedException {
		Thread.sleep(2000);
		return dropableTxtOnMenuBar.getText();
	}

	public void clickOnDroppableTxtOnMenuBar() throws InterruptedException {
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		dropableTxtOnMenuBar.click();
	}

	public String verifyDroppabletxtOnPage() {
		return dropableTxtOnPage.getText();
	}

	public String verifySimpleTxtOnPage() {
		return simpleTxtOnPage.getText();
	}

	public void verifyDragAndDrop() throws InterruptedException {
		Thread.sleep(2000);
		act.dragAndDrop(dragMeBx,dropherebx).perform();
	}

	public String verifyAcceptTxtOnPage() {
		return acceptTxtOnPage.getText();
	}

	public void clickOnAcceptTxt() {
		acceptTxtOnPage.click();
	}

	public void verifyAcceptDragDrop() throws InterruptedException {
		Thread.sleep(2000);
		act.dragAndDrop(acceptableDragBx, acceptableDropBx).perform();
	}

	public String verifyPreventPropogationTxt() {
		return preventPorpTxtOnPage.getText(); 
	}

	public void clickOnPreventPropogationTxt() {
		preventPorpTxtOnPage.click();
	}

	public void dragBoxOfPreventPorpogation() throws InterruptedException {
		Thread.sleep(2000);
		act.dragAndDrop(dragMeBx_2, dropMeBx_2).perform();
	}

	public String verifyRevertDraggableText() {
		return revertDraggableTxtOnPage.getText();
	}

	public void clickOnRevertDraggableTxt() {
		revertDraggableTxtOnPage.click();
	}

	public void dragWillRevertIntoBx() throws InterruptedException {
		Thread.sleep(2000);
		String actDropBxTxt = DropBxtxt.getText();
		act.dragAndDrop(willRevert, dropedBx).perform();
		Thread.sleep(2000);
		String expDropBxTxt = DropBxtxt1.getText();

		if(!expDropBxTxt.equals(actDropBxTxt))
		{
			Thread.sleep(1000);
			act.dragAndDrop(notRevert, dropedBx).perform();
		}else {
			System.out.println("The drag and drop operation is not working");
		}
	}


	//Dragabble
	public String verifyDragableTxtOnMenuBar() throws InterruptedException {
		act.sendKeys(dropableTxtOnMenuBar,Keys.PAGE_DOWN).perform();
		return dragableTxtOnMenuBar.getText();
	}

	public void clickOnDragabbleTxtOnMenuBar() throws InterruptedException {
		Thread.sleep(2000);
		dragableTxtOnMenuBar.click();
	}
	
	public String verifyDragTxtOnPage() {
		return dragabbleTxtOnpage.getText();
	}
}
