package Ecommerce;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;

//5.Validate mobile gestures working for links (long Press) and navigate to Webview.

public class ecommerce_TC_5 extends BaseEcommerce{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");

		driver.hideKeyboard();

		driver.findElement(By.xpath("//*[@text='Female']")).click();

		driver.findElement(By.id("android:id/text1")).click();

		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");

		//to scroll you can either use above command or this one.If above one does not work then use below cmd
		//   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));     

		driver.findElement(By.xpath("//*[@text='Argentina']")).click();

		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(0).click();
		driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(1).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		
		WebElement checkbox=driver.findElement(By.className("android.widget.CheckBox"));
		TouchAction t = new TouchAction(driver);
		t.tap(tapOptions().withElement(element(checkbox))).perform();
		
		WebElement tc=driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
		t.longPress(longPressOptions().withElement(element(tc)).withDuration(ofSeconds(2))).release().perform();
		driver.findElement(By.xpath("//*[@text='CLOSE']")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		
		
		

	}
}