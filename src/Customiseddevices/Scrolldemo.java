package Customiseddevices;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scrolldemo extends HybridBase {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));").click();
		
		
		
		

	}
}
