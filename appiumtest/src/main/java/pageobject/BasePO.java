package pageobject;

import java.time.Duration;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePO {

	public RemoteWebDriver driver;
	
	public BasePO(RemoteWebDriver appdriver){
		this.driver = appdriver;
		initElements();
	}
	
	private void initElements(){
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(30)) ,this);
	}
}
