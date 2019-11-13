package Ecommerce;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommerce_TC_1 extends BaseEcommerce{

		public static void main(String[] args) throws MalformedURLException {
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
			
		}
	}


