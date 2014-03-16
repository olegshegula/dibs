package com.dibs.pagesall;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AnyPage {

	public MainPage(PageManager pages) {
		super(pages);

	}

	@FindBy(xpath = "//*[@id='prefooter']//a[text()='Solutions']")
	private WebElement solutionsLink;

	public void clickOnSolutionsFooterLink() {
		solutionsLink.click();
	}

}
