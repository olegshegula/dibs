package com.dibs.pagesall;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;

public class SolutionsPage extends MainPage{

	public SolutionsPage(PageManager pages) {
		super(pages);
		
	}

	
	public SolutionsPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By.xpath("//*[@id='node-3180']//h2[text()='Payment solution examples']")));
		return this;
	}
}
