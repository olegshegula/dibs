package com.dibs.applogic2;

import org.openqa.selenium.WebDriver;

import com.dibs.applogic.ApplicationManager;
import com.dibs.applogic.NavigationHelper;
import com.dibs.applogic.UserHelper;
import com.dibs.util.Browser;
import com.dibs.util.PropertyLoader;
import com.dibs.webdriver.WebDriverFactory;

public class ApplicationManager2 implements ApplicationManager {

	private UserHelper userHelper;
	private NavigationHelper navHelper;
	private ClickLinkHelper2 clicklinkHelper;

	private WebDriver driver;
	private String baseUrl;

	public ApplicationManager2() {
		baseUrl = PropertyLoader.loadProperty("site.url");
		String gridHubUrl = PropertyLoader.loadProperty("grid2.hub");

		Browser browser = new Browser();
		browser.setName(PropertyLoader.loadProperty("browser.name"));
		browser.setVersion(PropertyLoader.loadProperty("browser.version"));
		browser.setPlatform(PropertyLoader.loadProperty("browser.platform"));

		String username = PropertyLoader.loadProperty("user.username");
		String password = PropertyLoader.loadProperty("user.password");

		driver = WebDriverFactory.getInstance(gridHubUrl, browser, username,
				password);
		driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		userHelper = new UserHelper2(this);

		navHelper = new NavigationHelper2(this);
		clicklinkHelper = new ClickLinkHelper2(this);

		//getNavigationHelper().openMainPage();
		
		
	}

	@Override
	public ClickLinkHelper2 getClickLinkHelper() {
		return clicklinkHelper;
	}

	@Override
	public UserHelper getUserHelper() {
		return userHelper;
	}

	@Override
	public NavigationHelper getNavigationHelper() {
		return navHelper;
	}

	protected WebDriver getWebDriver() {
		return driver;
	}

	protected String getBaseUrl() {
		return baseUrl;
	}

	@Override
	public void stop() {
		if (driver != null) {
			driver.quit();
		}
	}
}
