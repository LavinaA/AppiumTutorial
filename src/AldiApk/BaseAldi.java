package AldiApk;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseAldi {
	
public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		
		File f = new File("src");
		File fs = new File(f,"Aldi_QA.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"LavinaEmulator");//name of the emulator
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
		
		//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//we need to access uiautomator2 element of android
		//without above steps also script is running
		
		cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		
		return driver;

	}

}
