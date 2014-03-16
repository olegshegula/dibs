package com.dibs.pagesall;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SolutionsPage extends MainPage {

	public SolutionsPage(PageManager pages) {
		super(pages);

	}
	
	@FindBy(xpath = "//h3/a[text()='Card Payments']")
	private WebElement cardPaymentsLink;
	
	@FindBy(xpath = "//h3/a[text()='Invoice payments']")
	private WebElement invocePaymentAtrLink;
	
	@FindBy(xpath = "//h3/a[text()='Bank Payments']")
	private WebElement bankPaymentAtrLink;
	
	@FindBy(xpath = "//*[@id='search-block-form']/div/a/i[@class='icon-search']")
	private WebElement searchBtn;
	
	@FindBy(id = "edit-search-block-form--2")
	private WebElement inputSearchField;
	
	public SolutionsPage enableInputSearchFieldClick(){
		searchBtn.click();
		return pages.solutionsPage;
	}
	
	public void searchBtnClick(){
		searchBtn.click();
		
	}
	
	public SolutionsPage setSeachField(String text){
		inputSearchField.clear();
		inputSearchField.sendKeys(text);
		return pages.solutionsPage;
	}
	
	public String getBankPaymentAtr() {
		return bankPaymentAtrLink.getAttribute("href");
	}	
	
	
	public String getCardPaymentAtr() {
		return cardPaymentsLink.getAttribute("href");
	}
	
	public String getInvocePaymentAtr() {
		return invocePaymentAtrLink.getAttribute("href");
	}

	public SolutionsPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By
				.xpath("//*[@id='node-3180']//h2[text()='Payment solution examples']")));
		return this;
	}
}
