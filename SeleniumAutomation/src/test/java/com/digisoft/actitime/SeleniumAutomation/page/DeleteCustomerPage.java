package com.digisoft.actitime.SeleniumAutomation.page;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.digisoft.actitime.SeleniumAutomation.utils.DriverUtils;

public class DeleteCustomerPage extends DriverUtils {
	
	
			// Variables to store element locators for the delete process
			public String customersettings_byclass = "editButton available";
			public String clickaction_byclass = "action";
			public String clickdelete_byclass = "title";
			public String comfirmdelete_byid="customerPanel_deleteConfirm_submitBtn";
			
			//Method to navigate to the customer
			public void navigateToCustomerList() throws InterruptedException {
				click("class", customersettings_byclass);
				Thread.sleep(2000);
				click("class", clickaction_byclass); 
				click("class", clickdelete_byclass);
				
			}
			
			// Delete the customer
			public void deleteCustomer(String Customer) {
				click("id",comfirmdelete_byid);
			}
			
			//Validation for no longer appears in the list
			public void  isCustomerDeleted(String Customer) {
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement successMsgElement = wait.until(ExpectedConditions.visibilityOf(getElement("xpath", "//div[@class='toast']")));
				System.out.println("Success message displayed : " + successMsgElement.getText());
				wait.until(ExpectedConditions.invisibilityOf(getElement("xpath", "//div[@class='toast']")));
				System.out.println("Pop-up disapeared successfully");
				
				
			}

	}


