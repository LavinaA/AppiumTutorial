package Ecommerce;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

//4.Validate the total amount displayed in the checkout page matches with sum of product amounts selected for shopping.	

public class ecommerce_TC_4 extends BaseEcommerce{

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

		/*These 2 commands are not working.The element is not being clicked by below 2 commands
		 * driver.findElements(By.xpath("//*[text='ADD TO CART']")).get(0).click();
		 * driver.findElements(By.xpath("//*[text='ADD TO CART']")).get(0).click();
		 */

		driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(0).click();
		driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(1).click();

		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		int count=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
		
		double sum=0;
		for(int i=0;i<count;i++) {
			String amount = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(i).getText();
			double amount1value=getAmount(amount);
			sum=sum+amount1value;
		}

		System.out.println("The sum of Products :"+sum);

		Thread.sleep(7000);

		String totalvalue = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		double totalvalueofProducts=getAmount(totalvalue);
		System.out.println("The total value of Products :"+totalvalueofProducts);

		Assert.assertEquals(sum, totalvalueofProducts);

	}

public static double getAmount(String value) {
	
	value= value.substring(1);
	double amountvalue=Double.parseDouble(value);
	return amountvalue;
	
		
}
}

