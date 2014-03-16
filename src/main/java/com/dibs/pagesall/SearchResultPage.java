package com.dibs.pagesall;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends MainPage {

	public SearchResultPage(PageManager pages) {
		super(pages);

	}

	@FindBy(xpath = "(//*[@id='content']//a)[1]")
	private WebElement customerSupportLink;

	public void CustomerSupportLinkClick() {
		customerSupportLink.click();
	}

	public SearchResultPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By
				.xpath("//h1[text()='Search results']")));
		return this;
	}
}
