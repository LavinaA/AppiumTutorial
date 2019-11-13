import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomatorTest extends Base {

	public static void main(String[] args) throws MalformedURLException {
		

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//Click on views
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//Validate clickable feature for all options
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
	}

}

