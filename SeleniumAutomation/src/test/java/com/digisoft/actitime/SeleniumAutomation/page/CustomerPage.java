package com.digisoft.actitime.SeleniumAutomation.page;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.digisoft.actitime.SeleniumAutomation.utils.DriverUtils;

public class CustomerPage extends DriverUtils {
	
	// Variables to store element IDs or other locators

		public String taskmenu_byxpath = "//*[@id='topnav']/tbody/tr/td[3]";

		public String addnew_byclass = "addNewButton";

		public String createCustomerButton_byxpath = "/html/body/div[12]/div[1]";

		public String createcreationform_byclass="innerContent";

		public String createcustomername_byid = "customerLightBox_nameField";

		public String customerdescbox_byid = "customerLightBox_descriptionField";

		public String createcustomer_id = "customerLightBox_commitBtn";



		// Method to navigate to Create Customer page

		public void navigateToCreateCustomer() {

			click("xpath", taskmenu_byxpath);

			click("class", addnew_byclass);

			click("xpath", createCustomerButton_byxpath);

		}

		

		//Method to check form is created

		public boolean CustomerCreatedform()

		{

			//return getElement("class", createcreationform_byclass).isDisplayed();

			  System.out.println("Validating Customer creation page.");

		        String pageTitle = driver.getTitle();

		        if (pageTitle.contains("Create Customer")) {

		            System.out.println("Customer creation page loaded successfully.");
		            return true;

		        } else {

		            System.out.println("Failed to load the Customer creation page.");
		            return false;

		        }

		}



		// Method to fill customer details and save

		public void createCustomer(String customer_name, String customer_Desc) {

			type("id", createcustomername_byid, customer_name);

			type("id", customerdescbox_byid, customer_Desc);

			click("id", createcustomer_id);

		}





		public void validateSuccessMessage() {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

			

			WebElement successMsgElement = wait.until(ExpectedConditions.visibilityOf(getElement("xpath", "//div[@class='toast']")));

			

			System.out.println("Success message displayed : " + successMsgElement.getText());

			

			wait.until(ExpectedConditions.invisibilityOf(getElement("xpath", "//div[@class='toast']")));

			

			System.out.println("Pop-up disapeared successfully");

		}



	}
	


