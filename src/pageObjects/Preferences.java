package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Preferences extends Base {

	public Preferences(AppiumDriver<AndroidElement> driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text = '3. Preference dependencies']")
	public WebElement Dependencies;
	
	//android.widget.TextView[@text = '3. Preference dependencies']

	
	
	
}
