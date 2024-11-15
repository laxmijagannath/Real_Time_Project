package com.digisoft.actitime.SeleniumAutomation.utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtils extends GlobalVariables{
	
	/***
	 * @author LAXMI
	 * @param type -pass 0 or 1 argument,and the 1 argument is either ff,Chrome,edge only
	 * @return
	 */
	public static  WebDriver getDriver(String... type) {
		System.out.println("Creating a driver...");
		if(type.length==0) {
			System.out.println("Since no option is given,creating chrome by default");
			driver = new ChromeDriver();
		} else {
			switch(type[0]) {
			case "ff":
			driver = new FirefoxDriver();
			break;
			case "Chrome":
			driver = new ChromeDriver();
			break;
			case "Edge":
			driver = new EdgeDriver();
			break;
			}
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		System.out.println("Driver object is created successfully!!!");
		return driver;
	}
	/***
	 * @author LAXMI
	 * get element is reusable function which returns valid web element if it matches the type and value and it returns the null
	 * @param type-id,name,xpath,CSS,class,tag,linkText,partiallinkText
	 * @param value
	 * @return valid WebElement
	 */
	
	// Method to get WebElement based on type and value
	public WebElement getElement(String type,String value) {
		WebElement ele=null;
		switch(type.toLowerCase()) {
		case "id":
			ele = driver.findElement(By.id(value));
			break;
		case "name":
			ele = driver.findElement(By.name(value));
			break;
		case "xpath":
			ele = driver.findElement(By.xpath(value));
			System.out.println("Finding the password element");
			break;
		case "css":
			ele = driver.findElement(By.cssSelector(value));
			System.out.println("Finding the password element");
			break;
		case "LinkText":
			ele = driver.findElement(By.linkText(value));
			System.out.println("Finding the element type will be linktext and value");
			break;
		case "partialLinkText":
			ele = driver.findElement(By.partialLinkText(value));
			System.out.println("Finding the element type will be partiallinktext and value");
			break;
		case "classname":
			ele = driver.findElement(By.className(value));
			System.out.println("Finding the element type will be classname and value");
			break;
		case "tagName":
			ele = driver.findElement(By.tagName(value));
			System.out.println("Finding the element type will be tagName and value");
			break;
			default:
				System.out.println("Finding the element will be all locators and the values");
				// System.out.println("invalid locator type provided");
				return null;
		}
		return ele;
	}
	
	/***
	 * @author LAXMI
	 * type is reusable function which can be used to perform type operation on the text
	 * @param type-id,name,xpath,CSS,class,tag,linkText,partiallinkText
	 * @param value
	 * @return valid list of WebElement
	 */
	
	// Method to get WebElements based on String type and value
	public List<WebElement> getElements(String type,String value)
	{
		System.out.println("Finding the element using WebElements");
		List<WebElement> ele = null;
		
		switch (type.toLowerCase()) {
		case "id":

			ele = driver.findElements(By.id(value));

			 break;

		case "name":

			ele = driver.findElements(By.name(value));

			 break;

		case "xpath":

			ele = driver.findElements(By.xpath(value));

			 break;

		case "css":

			ele =  driver.findElements(By.cssSelector(value));

			 break;

		case "class":

			ele = driver.findElements(By.className(value));

			break;

		case "tag":

			ele = driver.findElements(By.tagName(value));

			break;

		case "linktext":

			ele = driver.findElements(By.linkText(value));

			break;

		case "partiallinktext":

			ele = driver.findElements(By.partialLinkText(value));

			break;

		default:

			//throw new IllegalArgumentException("Invalid locator type: " + type);

			System.out.println("Invalid locator type: " + type);

			break;

		}

		return ele;

	}

	

	/***

	 * type is a reusable function which can be used to perform type operation on the text 

	 * @param type-id,name, Xpath, CSS,class,tag,linkText,partiallinkText

	 * @param value 

	 * @author LAXMI

	 */

	// Method definition with return type void, taking three String parameters

	public void type(String type, String value, String text) {

		System.out.println("Entering " + text + " on a WEb Element with property " + type + " : " + value);

		getElement(type, value).sendKeys(text);

		//driver.findElement(By.type('value'))

	}

	/***

	 * click is a reusable function which can be used to perform click operation on the textbox

	 * @param type-id,name, xpath, CSS,class,tag,linkText,partiallinkText

	 * @param value 

	 * @author LAXMI

	 */



	// Method to perform a click action based on type and value of the locator

	public void click(String type, String value) {

		System.out.println("Clicking on the Web Element with property " + type + " : " + value);

		WebElement element = getElement(type, value);

		element.click(); // Click the located element

	}

	/***

	 * get element text is a reusable function which returns valid text of web elements if it is matches the type and value and it returns the text

	 * @param type-id,name, xpath, CSS,class,tag,linkText,partiallinkText

	 * @param value 

	 * @return valid text of web element

	 * @author LAXMI

	 */


// Method to get the text of an element based on the type and value

	public String getElementText(String type, String value) {

		WebElement element = getElement(type, value);

		String text =  element.getText();

		

		System.out.println("Text on the Element is " + text);

		return text;

	}

	/***

	 * get element attribute is a reusable function which returns valid attribute web elements if it is matches the type and value and it returns the null

	 * @param type-id,name, Xpath, CSS,class,tag,linkText,partiallinkText

	 * @param value 

	 * @return valid web element

	 * @author LAXMI

	 */



	// Method to return the attribute of an element based on the type of locator and

	// attribute

	public String getElementAttribute(String type, String value, String attribute) {

		WebElement element = getElement(type, value);

		

		// Return the requested attribute from the element

		if (element != null) {

			return element.getAttribute(attribute);

		} 

		else {

			return null;

		}

	}
	public static void setDriver(EdgeDriver edgeDriver) {
		//System.out.println(" 1st line of code is using "static"");
		//System.out.println("create a public method last that one");
	}
}


