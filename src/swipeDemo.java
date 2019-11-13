import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class swipeDemo extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	     driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
	     driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
	driver.findElementByXPath("//*[@content-desc='9']").click();
	
	
	TouchAction t = new TouchAction(driver);
	//long press //on element// 2 sec// move to another element and you release
	WebElement first = driver.findElementByXPath("//*[@content-desc='15']");
	WebElement second = driver.findElementByXPath("//*[@content-desc='45']");
	
	t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
	
	
	
	
	
	

	}

}
