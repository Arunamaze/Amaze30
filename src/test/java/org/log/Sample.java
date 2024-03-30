package org.log;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.Immutable;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Sample {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// To Automatically start the server 
		
		AppiumDriverLocalService server = new  AppiumServiceBuilder()
	  .withAppiumJS(new File("C:\\Users\\Ajji\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
	  .withIPAddress("127.0.0.1")
	  .usingPort(4723).build();
		server.start();
	  
		
		UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
		uiAutomator2Options.setCapability("deviceName", "Amaze");
		uiAutomator2Options.setCapability("app", "C:\\Users\\Ajji\\eclipse-workspace\\Feb_Appium_1\\src\\test\\resources\\General-Store.apk");
		AndroidDriver driver = new AndroidDriver(new URL (" http://127.0.0.1:4723/"),uiAutomator2Options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(2000);
		// to perform the swipe operation
		
		Thread.sleep(3000);
		driver.close();
		


		
		

}
}
