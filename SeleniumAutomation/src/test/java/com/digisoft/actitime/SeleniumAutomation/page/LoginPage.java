package com.digisoft.actitime.SeleniumAutomation.page;

import com.digisoft.actitime.SeleniumAutomation.utils.DriverUtils;

public class LoginPage extends DriverUtils {
	 // Variables to store element IDs
    public String username_byid = "username";  // ID for username field
    public String password_byname = "pwd";       // ID for password field
    public String login_byid = "loginButton";  // ID for login button

    
    // Method to enter userName
    public void enterUsername(String username) {
        System.out.println("Entering the username: " + username);
        // Assuming 'type' method in DriverUtils accepts (locatorType, locator, value)
        type("id", username_byid, username);  // Using 'id' as locator type
    }

    // Method to enter password
    public void enterPassword(String password) {
        System.out.println("Entering the password: " + password);
        type("name", password_byname, password);  // Using 'id' as locator type
    }

    // Method to click on login button
    public void clickLoginButton() {
        System.out.println("Clicking on login button");
        click("id", login_byid);  // Using 'id' as locator type
    }

    // Method to perform login action
    public void login(String username, String password) {
    	System.out.println("Login using " + username +  " and " + password );
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }
}

	
	

	


