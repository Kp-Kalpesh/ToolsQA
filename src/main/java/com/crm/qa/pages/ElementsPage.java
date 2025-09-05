package com.crm.qa.pages;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class ElementsPage extends TestBase{
	private TestUtil tstU;
	private Actions act;


	@FindBy(xpath = "//div[text()='Elements']")
	WebElement elementText;

	//TextBox
	@FindBy(xpath = "(//li[@id='item-0'])[1]")
	WebElement clickOnTextBox;
	@FindBy(xpath = "//input[contains(@placeholder,'Full Name')]")
	WebElement fullName;
	@FindBy(xpath = "//input[contains(@placeholder,'name')]")
	WebElement userEmail;
	@FindBy(xpath = "//textarea[contains(@placeholder,'Current Address')]")
	WebElement currentAddress;
	@FindBy(xpath = "(//textarea[contains(@class,'form-control')])[2]")
	WebElement permanentAddress;
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	WebElement submitBtn;
	@FindBy(xpath = "//p[@id='name']")
	WebElement verifyName;
	@FindBy(xpath = "//p[@id='email']")
	WebElement verifyEmail;
	@FindBy(xpath = "//p[@id='currentAddress']")
	WebElement verifyCAddress;
	@FindBy(xpath = "//p[@id='permanentAddress']")
	WebElement verifyPAddress;

	//Check Box
	@FindBy(xpath = "(//li[@id='item-1'])[1]")
	WebElement clickOncheckBxText;
	@FindBy(xpath = "//label//span[contains(@class,'rct-checkbox')]")
	WebElement clickOncheckBx;
	@FindBy(xpath = "(//div[contains(@id,'result')]//span)[1]")
	WebElement verifyChexbxCheck;


	//Radio button
	@FindBy(xpath = "(//li[@id='item-2'])[1]")
	WebElement clickOnRadioBtnText;
	@FindBy(xpath = "//label[contains(@for,'yesRadio')]")
	WebElement clickOnYesRadioBtn;
	@FindBy(xpath = "//p[contains(@class,'mt-3')]")
	WebElement verifyYesText;
	@FindBy(xpath = "//label[contains(@for,'impressiveRadio')]")
	WebElement clickOnImpressiveRadioBtn;
	@FindBy(xpath = "//p[contains(text(),'You have selected ')]")
	WebElement verifyImpressiveText;

	//Web Tables
	@FindBy(xpath = "(//li[contains(@id,'item-3')])[1]")
	WebElement clickOnWebTables;
	@FindBy(xpath = "//button[contains(@id,'addNewRecordButton')]")
	WebElement addBtn;
	@FindBy(xpath = "//input[contains(@placeholder,'First Name')]")
	WebElement firstName;
	@FindBy(xpath = "//input[contains(@placeholder,'Last Name')]")
	WebElement lastName;
	@FindBy(xpath = "//input[contains(@id,'userEmail')]")
	WebElement email;
	@FindBy(xpath = "//input[contains(@id,'age')]")
	WebElement age;
	@FindBy(xpath = "//input[contains(@id,'salary')]")
	WebElement salary;
	@FindBy(xpath = "//input[contains(@id,'department')]")
	WebElement department;
	@FindBy(xpath = "//button[contains(@id,'submit')]")
	WebElement CreateButton;
	@FindBy(xpath = "//input[contains(@id,'searchBox')]")
	WebElement searchBox;
	@FindBy(xpath = "(//div[@class='rt-td'])[1]")
	WebElement verifyFName;
	@FindBy(xpath = "(//div[@class='rt-td'])[2]")
	WebElement verifyLName;
	@FindBy(xpath = "(//div[@class='rt-td'])[3]")
	WebElement verifyAge;
	@FindBy(xpath = "(//div[@class='rt-td'])[4]")
	WebElement verifyCreateNewEmail;
	@FindBy(xpath = "(//div[@class='rt-td'])[5]")
	WebElement verifySalary;
	@FindBy(xpath = "(//div[@class='rt-td'])[6]")
	WebElement verifyDepartment;
	@FindBy(xpath = "//span[@title='Edit']")
	WebElement editIcon;
	@FindBy(xpath = "//input[contains(@id,'firstName')]")
	WebElement editFName;
	@FindBy(xpath = "//input[contains(@id,'lastName')]")
	WebElement editLName;
	@FindBy(xpath = "//input[contains(@id,'userEmail')]")
	WebElement editEmail;
	@FindBy(xpath = "//input[contains(@id,'age')]")
	WebElement editAge;
	@FindBy(xpath = "//input[contains(@id,'salary')]")
	WebElement editSalary;
	@FindBy(xpath = "//input[contains(@id,'department')]")
	WebElement editDepartment;
	@FindBy(xpath = "//button[contains(@id,'submit')]")
	WebElement clickOnUpdate;
	// verify all fileds data after update data 
	@FindBy(xpath = "//span[@title='Delete']")
	WebElement deleteIcon;

	//Buttons
	@FindBy(xpath = "(//li[contains(@id,'item-4')])[1]")
	WebElement ButtonsText;
	@FindBy(xpath = "//button[contains(@id,'doubleClickBtn')]")
	WebElement DoubleClickMeBtn;
	@FindBy(xpath = "//p[contains(@id,'doubleClickMessage')]")
	WebElement doubleClickMessage;
	@FindBy(xpath = "//button[contains(@id,'rightClickBtn')]")
	WebElement RightClickMeBtn;
	@FindBy(xpath = "//p[contains(@id,'rightClickMessage')]")
	WebElement RightClickMessage;
	@FindBy(xpath = "(//button[contains(text(),'Click Me')])[3]")
	WebElement ClickMeBtn;	
	@FindBy(xpath = "//p[contains(@id,'dynamicClickMessage')]")
	WebElement ClickMeMessage;

	//Links
	@FindBy(xpath = "(//li[contains(@id,'item-5')])[1]")
	WebElement clickOnLinkText;
	@FindBy(xpath="//a[contains(@id,'simpleLink')]")
	WebElement homeLink;
	@FindBy(xpath="//div//a[text()='Created']")
	WebElement createdLink;
	@FindBy(xpath="//div//a[text()='No Content']")
	WebElement noContentLink;
	@FindBy(xpath="//div//a[text()='Moved']")
	WebElement movedLink;
	@FindBy(xpath="//div//a[text()='Bad Request']")
	WebElement badRequestLink;
	@FindBy(xpath="//div//a[text()='Unauthorized']")
	WebElement unAuthorizedLink;
	@FindBy(xpath="//div//a[text()='Forbidden']")
	WebElement forbiddenLink;
	@FindBy(xpath="//div//a[text()='Not Found']")
	WebElement notFoundLink;
	@FindBy(xpath="(//div//p)[10]")
	WebElement responseOfEveryLink;

	//	Broken Links - Images
	@FindBy(xpath = "(//li[contains(@id,'item-6')])[1]")
	WebElement clickOnBrokenLinks;
	@FindBy(xpath = "(//img[@src='/images/Toolsqa.jpg'])[2]")
	WebElement toolsQAImage;
	@FindBy(xpath = "//a[text()='Click Here for Valid Link']")
	WebElement validLink;
	@FindBy(xpath = "//a[text()='Click Here for Broken Link']")
	WebElement brokenLink;
	@FindBy(xpath="//h3[text()='Status Codes']")
	WebElement statusCode;

	@FindBy(xpath = "//div[text()='Forms']")
	WebElement Forms;



	//Constructor
	//Initializing the page objects
	public ElementsPage() {
		PageFactory.initElements(driver, this);
		tstU = new TestUtil();		
		act = new Actions(driver);
	}


	public String elementsText() {
		return elementText.getText();
	}

	//TextBox
	public void clickOnTextBox() {
		clickOnTextBox.click();
	}

	public void enterFullName(String name) {
		fullName.sendKeys(name);
	}

	public void enterEmail(String email) {
		userEmail.sendKeys(email);
	}

	public void enterCurrentAddress(String cAddress) {
		currentAddress.sendKeys(cAddress);
	}

	public void enterPeramanentAddress(String pAddress) {
		permanentAddress.sendKeys(pAddress);
	}

	public void clickOnSubmitBtn() {
		submitBtn.sendKeys(Keys.PAGE_DOWN);
		submitBtn.click();
	}

	public String verifyFullName() {
		System.out.println(verifyName.getText());
		return verifyName.getText();
	}

	public String verifyUserEmail() {
		System.out.println(verifyEmail.getText());
		return verifyEmail.getText();
	}

	public String verifyCurrentAddress() {
		System.out.println(verifyCAddress.getText());
		return verifyCAddress.getText();
	}

	public String verifyPeramanentAddress() {
		System.out.println(verifyPAddress.getText());
		return verifyPAddress.getText();
	}


	//CheckBox
	public String verifyCheckBoxText() {
		return clickOncheckBxText.getText();
	}

	public void clickOnTextBoxText() {
		clickOncheckBxText.click();
	}

	public void clickOnCheckBox() {
		clickOncheckBx.click();
	}

	public String verifyCheckboxResultText() {
		System.out.println(verifyChexbxCheck.getText());
		return verifyChexbxCheck.getText();
	}


	//RadioButtons
	public String verifyRadioBtnText() {
		return clickOnRadioBtnText.getText();
	}

	public void clickOnRadioBtnText() {
		clickOnRadioBtnText.click();
	}

	public void clickOnYes() {
		clickOnYesRadioBtn.click();
	}

	public String verifyYesText() {
		System.out.println(verifyYesText.getText());
		return verifyYesText.getText();
	}

	public void clickOnImpressive() {
		clickOnImpressiveRadioBtn.click();
	}

	public String verifyImpressiveText() {
		System.out.println(verifyImpressiveText.getText());
		return verifyImpressiveText.getText();
	}

	//Web Tables
	public String verifyWebTablesText() {
		return clickOnWebTables.getText();
	}

	public void clickOnwebtable() {
		clickOnWebTables.click();
	}

	public void clickOnAddBtn() {
		addBtn.click();
	}

	public void enterFirstName(String fNAme) {
		firstName.sendKeys(fNAme);
	}

	public void enterLastName(String lNAme) {
		lastName.sendKeys(lNAme);
	}

	public void enterWebTableEmail(String Uemail) {
		email.sendKeys(Uemail);
	}

	public void enterAge(String Uage) {
		age.sendKeys(Uage);
	}

	public void enterSalary(String Usalary) {
		salary.sendKeys(Usalary);
	}

	public void enterDepartment(String depart) {
		department.sendKeys(depart);
	}

	public void clickOnSubmit() {

		CreateButton.click();
	}

	public void enterNameSearchBox(String userName) {
		tstU.waits();
		searchBox.click();
		searchBox.sendKeys(userName);
	}

	public String verifyFName() {
		return verifyFName.getText();
	}

	public String verifyLName() {
		return verifyLName.getText();
	}

	public String verifyAge() {
		return verifyAge.getText();
	}

	public String verifyCreateEmail() {
		return verifyCreateNewEmail.getText();
	}

	public String verifySalary() {
		return verifySalary.getText();
	}

	public String verifyDepartment() {
		return verifyDepartment.getText();
	}

	public void clickOnEditIcon() {
		editIcon.click();
	}

	public void editFName(String UpFName) {
		editFName.click();
		editFName.sendKeys(Keys.CONTROL, "A");
		editFName.sendKeys(Keys.BACK_SPACE);
		editFName.sendKeys(UpFName);
	}

	public void editLName(String UpLName) {
		editLName.click();
		editLName.sendKeys(Keys.CONTROL, "A");
		editLName.sendKeys(Keys.BACK_SPACE);
		editLName.sendKeys(UpLName);
	}

	public void editAge(String UpAge) {
		editAge.click();
		editAge.sendKeys(Keys.CONTROL, "A");
		editAge.sendKeys(Keys.BACK_SPACE);
		editAge.sendKeys(UpAge);
	}

	public void editEmail(String UpEmail) {
		editEmail.click();
		editEmail.sendKeys(Keys.CONTROL, "A");
		editEmail.sendKeys(Keys.BACK_SPACE);
		editEmail.sendKeys(UpEmail);
	}

	public void editSalary(String UpSal) {
		editSalary.click();
		editSalary.sendKeys(Keys.CONTROL, "A");
		editSalary.sendKeys(Keys.BACK_SPACE);
		editSalary.sendKeys(UpSal);
	}

	public void editDepartment(String UpDepart) {
		editDepartment.click();
		editDepartment.sendKeys(Keys.CONTROL, "A");
		editDepartment.sendKeys(Keys.BACK_SPACE);
		editDepartment.sendKeys(UpDepart);
	}

	public void clickOnUpdateBtn() {
		clickOnUpdate.click();
	}

	public void removeDataInSearchBoxAndEnterNew(String UpdatedName) {
		searchBox.click();
		searchBox.sendKeys(Keys.CONTROL, "A");
		searchBox.sendKeys(Keys.BACK_SPACE);
		searchBox.sendKeys(UpdatedName);
	}

	//verify updated user data
	public String verifyUpdatedFName() {
		return verifyFName.getText();
	}

	public String verifyUpdatedLName() {
		return verifyLName.getText();
	}

	public String verifyUpdatedAge() {
		return verifyAge.getText();
	}

	public String verifyUpdatedEmail() {
		return verifyCreateNewEmail.getText();
	}

	public String verifyUpdatedSalary() {
		return verifySalary.getText();
	}

	public String verifyUpdatedDepartment() {
		return verifyDepartment.getText();
	}

	public void deleteCreatedUser() {
		deleteIcon.click();
	}


	//Buttons
	public String verifyButtonText() {
		return ButtonsText.getText();
	}

	public void clickOnButtonText() {
		ButtonsText.click();
	}

	public void doubleClickMe() throws InterruptedException {
		Thread.sleep(2000);
		act.doubleClick(DoubleClickMeBtn).perform();
	}

	public String doubleClickMessage() {
		return doubleClickMessage.getText();
	}

	public void rightClickBtn() throws InterruptedException {
		Thread.sleep(2000);
		act.contextClick(RightClickMeBtn).perform();
	}

	public String verifyRightClickMessage() {
		return RightClickMessage.getText(); 
	}

	public void singleClickBtn() {
		ClickMeBtn.click();
		//		act.click(ClickMeBtn).perform();
	}

	public String singleClickMessage() {
		return ClickMeMessage.getText();
	}


	//Links
	public String verifyLinksTextInMenu() {
		return clickOnLinkText.getText();
	}

	public void clickOnLinks() {
		clickOnLinkText.click();
	}

	public String verifyHomeText() {
		return homeLink.getText();
	}

	public void clickOnHomeLink() {
		homeLink.click();

		//window handle code
		Set<String> windowHandles = driver.getWindowHandles();
		String mainWindow = driver.getWindowHandle();

		// Iterate through the window handles
		for(String windowHandle : windowHandles)
		{
			// Switch to each window
			if(!windowHandle.equals(mainWindow))
			{
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		System.out.println("Title of new window: " + driver.getTitle());
		// Switch back to the main window
		//		driver.close();
		driver.switchTo().window(mainWindow);
	}

	public void clickOnCreatedLink() {
		tstU.waits();	
		createdLink.click();	
		createdLink.sendKeys(Keys.PAGE_DOWN);
	}

	public String verifyCreatedLinkResonse() {
		return responseOfEveryLink.getText();
	}

	public void clickOnNoContentLink() {
		noContentLink.click();
	}

	public String verifyNoContentLinkResonse() throws InterruptedException {
		Thread.sleep(2000);
		return responseOfEveryLink.getText();
	}

	public void clickOnMovedLink() {
		movedLink.click();
	}

	public String verifyMovedLinkResonse() throws InterruptedException {
		Thread.sleep(2000);
		return responseOfEveryLink.getText();
	}

	public void clickOnBadRequestLink() throws InterruptedException {
		badRequestLink.click();
	}

	public String verifyBadRequestLinkResonse() throws InterruptedException {
		Thread.sleep(2000);
		return responseOfEveryLink.getText();
	}

	public void clickOnUnAuthorizedLink() {
		unAuthorizedLink.click();
	}

	public String verifyUnAuthorizedLinkResonse() throws InterruptedException {
		Thread.sleep(2000);
		return responseOfEveryLink.getText();
	}

	public void clickOnForbiddenLink() {
		forbiddenLink.click();
	}

	public String verifyForbiddenLinkResonse() throws InterruptedException {
		Thread.sleep(2000);
		return responseOfEveryLink.getText();
	}

	public void clickOnNotFoundLink() {
		notFoundLink.click();
	}

	public String verifyNotFoundLinkResonse() throws InterruptedException {
		Thread.sleep(2000);
		return responseOfEveryLink.getText();
	}


	//Broken Links

	public String verifyBrokenLinkOnMenuText() {
		return clickOnBrokenLinks.getText();
	}

	public void verifyClickOnBrokenLinks() {
		clickOnBrokenLinks.click();
	}

	public boolean displayedToolsQALogo() {
		return toolsQAImage.isDisplayed();
	}

	public void clickOnValidLinkText() {
		validLink.click();
		driver.navigate().back();
	}

	public void clickBrokenLinkText() {
		brokenLink.sendKeys(Keys.PAGE_DOWN);
		brokenLink.click();
	}

	public String getStatusCode() {
		String getStusCode = statusCode.getText();
		driver.navigate().back();
		return getStusCode;
	}


	//Forms
	public FormsPage clickOnFormsBtn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Forms.click();
		return new FormsPage();
	}


}


