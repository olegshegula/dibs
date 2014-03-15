package com.dibs.applogic;

public interface ApplicationManager {

	UserHelper getUserHelper();

	NavigationHelper getNavigationHelper();

	ClickLinkHelper getClickLinkHelper();

	void stop();

}
