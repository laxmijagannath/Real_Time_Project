package com.digisoft.actitime.SeleniumAutomation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/****
 * @author LAXMI Global variables is a class which will hold all the required
 *         global variables
 */

public class GlobalVariables {
	public static final String REPORTS = "/reports";
	public static final String USERNAME = "admin";
	public static final String PASSWORD = "manager";

	public static WebDriver driver;

	public void initDriver() {
		// driver=new DriverUtils().getDriver("chrome");
		if (DriverUtils.getDriver() == null) {
			DriverUtils.setDriver(new EdgeDriver());
	}
	}
}
