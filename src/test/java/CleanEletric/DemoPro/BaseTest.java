package CleanEletric.DemoPro;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {

	public AndroidDriver  driver;
	public AppiumDriverLocalService services;
	
	@BeforeClass()
	public void ConfigureAppium() 
	{

		//Code to Start the Server
	      services = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\ADMIN\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		services.start();
		// Appium Code -->Appium Server--> Mobile
		
		
		UiAutomator2Options options = new UiAutomator2Options();
		
	    options.setDeviceName("SatishEmulator");
	    options.setPlatformName("Android");
		options.setPlatformVersion("9");
		options.setAutomationName("UiAutomator2");
		options.setDeviceName("emulator-5554");
		//options.setAppPackage("com.android.settings");
		//options.setAppActivity("com.android.settings.applications.InstalledAppDetails");
		options.setAppPackage("io.appium.android.apis");
		options.setAppActivity(".ApiDemos");
	 
	  driver = new AndroidDriver(options);
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
		
	}
	   public void longPressAction(WebElement ele) 
	   {
		   driver.executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),"duration",2000));
		    
	   }
	   public void ScrollToEndAction() 
	   {
		//  If we don't know where to Scroll Exactly Used this
		    boolean canScrollMore;
		    do
		    { canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		        "left", 100, "top", 100, "width", 200, "height", 200,
		        "direction", "down",
		        "percent", 3.0
		    ));
		    } while(canScrollMore);
	   }
	   public void swipeAction(WebElement ele,String direction) 
	   {
		   // Java
		    ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
		      "elementId",((RemoteWebElement)ele).getId(),
		        "direction", direction,
		        "percent", 0.75
		    ));
	   }
	   
	@AfterClass()
	public void tearDown() 
	{
		driver.quit();
		services.stop();
	}
}
