package testcases;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Calculatorapplication {

	static AppiumDriver<MobileElement> appiumdriv;
	
	public static void main(String[] args) {
		
		openCalc();
	}
	
	public static void openCalc(){
		try{
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(CapabilityType.BROWSER_NAME, "");
			cap.setCapability("deviceName", "POCO F1");
			cap.setCapability("udid", "192.168.0.100:5555");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "10");
			cap.setCapability("appPackage", "com.miui.calculator");
			cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorTabActivity");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			appiumdriv = new AppiumDriver<MobileElement>(url, cap);
			System.out.println("Application started....");
			
			appiumdriv.findElement(By.id("android:id/button1")).click();
			TimeUnit.SECONDS.sleep(10);
			appiumdriv.findElement(By.id("com.miui.calculator:id/btn_1_s")).click();
			appiumdriv.findElement(By.id("com.miui.calculator:id/btn_1_s")).click();
			appiumdriv.findElement(By.id("com.miui.calculator:id/btn_div_s")).click();
			appiumdriv.findElement(By.id("com.miui.calculator:id/btn_5_s")).click();
			appiumdriv.findElement(By.id("com.miui.calculator:id/btn_equal_s")).click();
			
			String result = appiumdriv.findElement(By.id("com.miui.calculator:id/result")).getText();
			
			System.out.println(result);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
