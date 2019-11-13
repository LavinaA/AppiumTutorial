package ChromeBrowser;

import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Cricbuzz extends baseChrome {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.get("http://cricbuzz.com");
		driver.findElementByXPath("//a[@href='#menu']").click();
		driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();
		System.out.println(driver.getCurrentUrl());
		/*
		 * JavascriptExecutor jse = (JavascriptExecutor) driver;
		 * jse.executeScript("window.scrollBy(0,480)", "");
		 * Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Top Stories']")).
		 * getAttribute("class").contains("header"));
		 */
		

	}

}
