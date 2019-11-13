package Ecommerce;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;


//test case to check if a product(Jordan 6 Rings) is present or not 
//If yes then go to the product "Jordan 6 Rings" and add to the cart.
//Shop the items in the app by scrolling to specific Product and add to cart.

public class ecommerce_TC_2 extends BaseEcommerce{

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
		     
		     //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));");
             //driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
		     
		     //Some challenges are there in immediate above mentioned 2 lines of code.The product may be hidden and the elements might not be visible for add to cart
		     //Hence we go with below lines code
		     
		     //to find below mentioned line of code search appium java client on google->open github link->src->test->java_client->android->androidSearchingTest
		     
		     driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));

		     int count=    driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		     for(int i=0;i<count;i++)
		     {
		    	 String text=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
		    	 if(text.equalsIgnoreCase("Jordan 6 Rings"))
		    	 {
		    		 driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
		    		 break;		
		    	 }
		     }
		     
		     driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		     
		     //Test case no 3 ,Validate if the items selected in page 2 are matching with items displayed in check out page.
		     String lastPageText = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
		     Assert.assertEquals("Jordan 6 Rings", lastPageText);
		     
		}
}
		         
		         


