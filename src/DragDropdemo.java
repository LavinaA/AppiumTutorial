import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class DragDropdemo extends Base{

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	     driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
	     WebElement source=driver.findElementsByClassName("android.view.View").get(0);
	     WebElement destination=driver.findElementsByClassName("android.view.View").get(1);
	     
	     
	     TouchAction t = new TouchAction(driver);
	     
	     t.longPress(longPressOptions().withElement(element(source)).withDuration(ofSeconds(2))).moveTo(element(destination)).release().perform();
	     
	     //working with without with/duration too
	     //t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
	     //you may use the foll statement also if you are not using options like withDuration(ofSeconds(2) etc
	     
	     //t.longPress(element(source)).moveTo(element(destination)).release().perform();
	     
		
		
		
	}

}
