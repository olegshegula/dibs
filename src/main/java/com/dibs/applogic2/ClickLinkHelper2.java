package com.dibs.applogic2;

import com.dibs.applogic.ClickLinkHelper;

public class ClickLinkHelper2 extends DriverBasedHelper implements ClickLinkHelper {
	

	public ClickLinkHelper2(ApplicationManager2 manager) {
		super(manager.getWebDriver());
		
	}

	@Override
	public void clickOnSolutionsFooterLink() {
		pages.mainPage.clickOnSolutionsFooterLink();
		
	}

	
}
