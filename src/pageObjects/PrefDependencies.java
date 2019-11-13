package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PrefDependencies {
	
	public PrefDependencies(AppiumDriver<AndroidElement> driver) {

		PageFactory.initElements(driver, this);
		
		}
	
	@AndroidFindBy(id="android:id/checkbox")
	public AndroidElement Wifi;
	
	@AndroidFindBy(xpath="(//android.widget.RelativeLayout)[2]")
	public AndroidElement WifiSettings;
	
	
	@AndroidFindBy(className="android.widget.EditText")
	public AndroidElement WifiSettingstext;
	
	
	@AndroidFindBy(className="android.widget.Button")
	public List<AndroidElement> button;
	

}
