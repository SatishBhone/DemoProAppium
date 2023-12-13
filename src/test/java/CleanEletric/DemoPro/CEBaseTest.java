package CleanEletric.DemoPro;

import java.io.File;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class CEBaseTest {

	public AndroidDriver  driver;
	public AppiumDriverLocalService services;
	
	@BeforeClass()
	public void CEConfigureAppium() 
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
		options.setAppPackage("com.cleanelectric.ceassist");
		options.setAppActivity("com.cleanelectric.ceassist.MainActivity");
		//options.setAppPackage("io.appium.android.apis");
		//options.setAppActivity(".ApiDemos");
	 
	  driver = new AndroidDriver(options);
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
		
	}
	
	@AfterClass()
	public void tearDown() 
	{
		driver.quit();
		services.stop();
	}
}
