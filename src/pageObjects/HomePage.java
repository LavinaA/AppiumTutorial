package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage {
	//1. to call the driver objects from testcase to pageobject level
	//concatenate driver using pagefactory 



	public HomePage(AppiumDriver<AndroidElement> driver) {
		PageFactory.initElements(driver, this);
	}

	@AndroidFindBy(xpath="//android.widget.TextView[@text ='Preference']")
	public WebElement Preference;

}
