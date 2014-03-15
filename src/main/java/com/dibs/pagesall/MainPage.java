package com.dibs.pagesall;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
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

	public MainPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By
				.xpath("//a[text()='Online payments']")));
		return this;
	}

}
