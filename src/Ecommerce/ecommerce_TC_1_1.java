package Ecommerce;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

//Verify toast messages for error validations

public class ecommerce_TC_1_1 extends BaseEcommerce {

	public static void main(String[] args)throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=Capabilities();

	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      //driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");

	    // driver.hideKeyboard();

	     driver.findElement(By.xpath("//*[@text='Female']")).click();

	     driver.findElement(By.id("android:id/text1")).click();

	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
	  //   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));     

	     driver.findElement(By.xpath("//*[@text='Argentina']")).click();

	     driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	     
	     //The error message highlighted in red are called toast messages.
	     //They do not have webelement but are generally defined by developers with android.widget.Toast class

	String toastMessage=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
    System.out.println(toastMessage);
  //Assert.assertEquals("Please enter your name", toastMessage);//Actual validation

	//name attribute for toast messages will have content

	}

}
