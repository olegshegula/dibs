package com.dibs.applogic2;

import com.dibs.applogic.UserHelper;

public class UserHelper2 extends DriverBasedHelper implements UserHelper {

	public UserHelper2(ApplicationManager2 manager) {
		super(manager.getWebDriver());
	}

	// @Override
	// public void loginAs(User user) {
	// pages.loginPage.ensurePageLoaded().setUsernameField(user.getLogin())
	// .setPasswordField(user.getPassword()).clickSubmitButton();

	// }

	// @Override
	// public void logout() {
	// pages.internalPage.ensurePageLoaded().clickLogoutLink();
	// }

	// @Override
	// public boolean isLoggedIn() {
	// return pages.internalPage.waitPageLoaded();
	// }

	// @Override
	// public boolean isLoggedInAs(User user) {

	// return isLoggedIn()
	// && getLoggedUser().getLogin().equals(user.getLogin());

	// }

	// @Override
	// public boolean isNotLoggedIn() {
	// return pages.loginPage.waitPageLoaded();
	// }

	// private User getLoggedUser() {
	// UserProfilePage userProfile = pages.internalPage.ensurePageLoaded()
	// .clickUserProfilePage().ensurePageLoaded();
	// return new User().setLogin(userProfile.getUsername());

	// }

}
