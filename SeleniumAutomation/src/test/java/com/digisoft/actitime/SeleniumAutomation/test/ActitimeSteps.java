package com.digisoft.actitime.SeleniumAutomation.test;

import com.digisoft.actitime.SeleniumAutomation.page.LoginPage;
import com.digisoft.actitime.SeleniumAutomation.utils.DriverUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActitimeSteps extends DriverUtils {

	LoginPage lp = null;

	@Given("user is launch the browser")
	public void user_is_launch_the_browser() {
		System.out.println("***** Hey im inside the browser *****");
		initDriver();
		lp = new LoginPage();
		driver.get("http://localhost/login.do");
	}
	
	@When("^user enter (.*) and (.*)$")
	public void user_enter_admin_and_manager(String name, String password) throws InterruptedException {
		Thread.sleep(2000);
		lp.enterUsername(name);
		lp.enterPassword(password);

	}

	@When("click on the login button")
	public void click_on_the_login_button() {
		lp.clickLoginButton();

	}

	@Then("user should navigate to homepage")
	public void user_should_navigate_to_homepage() {
		System.out.println("##### Hey im inside the homepage  #####");
	}

}
