package com.dibs.pagesall;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageManager {

	private WebDriver driver;

	public LoginPage loginPage;

	public PageManager(WebDriver driver) {
		this.driver = driver;
		loginPage = initElements(new LoginPage(this));

	}

	private <T extends Page> T initElements(T page) {
		// PageFactory.initElements(driver, page);
		// PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10),
		// page);
		PageFactory.initElements(
				new DisplayedElementLocatorFactory(driver, 30), page);
		return page;
	}

	public WebDriver getWebDriver() {
		return driver;
	}

}
