package com.dibs.pagesall;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageManager {

	private WebDriver driver;	

	public MainPage mainPage;

	public SolutionsPage solutionsPage;

	public PageManager(WebDriver driver) {
		this.driver = driver;		
		mainPage = initElements(new MainPage(this));
		solutionsPage = initElements(new SolutionsPage(this));
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
