package org.sap;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class App_Launch {
	
	

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// To Automatically start the server 
		
		AppiumDriverLocalService server = new  AppiumServiceBuilder()
	  .withAppiumJS(new File("C:\\Users\\Ajji\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
	  .withIPAddress("127.0.0.1")
	  .usingPort(4723).build();
		server.start();
	  
		
		UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
		uiAutomator2Options.setCapability("deviceName", "Amaze");
		uiAutomator2Options.setChromedriverExecutable("C:\\Users\\Ajji\\eclipse-workspace\\Feb_Appium_1\\src\\test\\resources\\chromedriver.exe");
		uiAutomator2Options.setCapability("browserName","chrome");
		//uiAutomator2Options.setCapability("app", "C:\\Users\\Ajji\\eclipse-workspace\\Feb_Appium_1\\src\\test\\resources\\ApiDemos-debug.apk");
		AndroidDriver driver = new AndroidDriver(new URL (" http://127.0.0.1:4723/"),uiAutomator2Options);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("s_arunkumaranu@yahoo.com");
		Thread.sleep(5000);
		driver.findElement(By.id("pass")).sendKeys("arunsankar");
		Thread.sleep(5000);
		driver.findElement(By.id("login")).click();
		
		
				
		//DeviceRotation deviceRotation = new DeviceRotation(0, 0, 90);
		//driver.rotate(deviceRotation);
		Thread.sleep(5000);
		driver.close();
		
		
		
	
	}

}
