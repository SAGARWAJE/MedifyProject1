package appiumtest;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class SampleTest {
	
	 static AppiumDriver driver;
	
	
	
	public static void main(String[] args) {
		
	try {
		openApp();
	}catch (Exception e) {
		e.getClass();
		e.printStackTrace();
		}
		
	}

	
	public static void openApp() {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("", "");
		cap.setCapability("", "");
		cap.setCapability("", "");
		cap.setCapability("", "");
		cap.setCapability("", "");
		cap.setCapability("", "");
		cap.setCapability("", "");	
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub")
				
		driver = new AppiumDriver<MobileElement>(url, cap)
		
		
	}
}
