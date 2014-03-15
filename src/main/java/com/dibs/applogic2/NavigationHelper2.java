package com.dibs.applogic2;

import com.dibs.applogic.NavigationHelper;

public class NavigationHelper2 extends DriverBasedHelper implements
		NavigationHelper {

	private String baseUrl;

	public NavigationHelper2(ApplicationManager2 manager) {
		super(manager.getWebDriver());
		this.baseUrl = manager.getBaseUrl();
	}

	@Override
	public void openMainPage() {
		driver.get(baseUrl);
		pages.mainPage.ensurePageLoaded() ;
	}

	@Override
	public void openRelativeUrl(String url) {
		driver.get(baseUrl + url);
	}


	

	// @Override
	// public void gotoUserCabinetPage() {
	// pages.internalPage.ensurePageLoaded().clickUserCabinetPage();

	// }

}
