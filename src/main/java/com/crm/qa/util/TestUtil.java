package com.crm.qa.util;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{
	WebDriverWait wt;
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;

	public void switchToFrame() {
		driver.switchTo().frame(0);
	}

	public void waits() {
		wt = new WebDriverWait(driver, 10); 

	}

}
