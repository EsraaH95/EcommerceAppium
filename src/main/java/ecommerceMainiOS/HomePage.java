package ecommerceMainiOS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utilities.IOSActions;

public class HomePage extends IOSActions{

	
	IOSDriver driver;

	
	public HomePage(IOSDriver driver)
	{
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); 
		
	}
	
	@iOSXCUITFindBy(accessibility="Alert Views")
	private WebElement alertViews;
	
	public AlertViews selectAlertViews()
	{
		alertViews.click();
		return new AlertViews(driver);
	}
	
	
	
}
