package com.dibs.pagesall;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerSupportPage extends MainPage {

	public CustomerSupportPage(PageManager pages) {
		super(pages);

	}

	@FindBy(xpath = "(//*[@id='node-1031']//span[1])[@class='skype_c2c_text_span']")
	private WebElement supportPhone;

	@FindBy(xpath = "//*[@id='hero']//h3")
	private WebElement pageTitle;

	@FindBy(xpath = "//*[@id='node-1031']//p[1]")
	private WebElement openhours;

	public String getPhone() {
		return supportPhone.getText();
	}

	public String getOpenHours() {

		return openhours.getText();
	}

	public String getTitle() {

		return pageTitle.getText();
	}

	public CustomerSupportPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By
				.xpath("//h3[text()='We answer all your questions']")));
		return this;
	}

}
