package CleanEletric.DemoPro;


import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumBasic extends BaseTest{
	
	@Test
	public void appiumTest() throws MalformedURLException, InterruptedException 
	{
		
    // Xpath, id, accesibilityId, Classname, AndroidUIAutomator
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("\r\n"+ "//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		// Verify the Title is Wifi settings
    	String wifttitle =	driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(wifttitle, "WiFi settings");
	
		driver.findElement(By.id("android:id/edit")).sendKeys("Satish Bhone");
		driver.findElement(AppiumBy.className("android.widget.Button")).click();
		
		//driver.navigate().back();
		
		
		//driver.navigate().back();
		
	//	tearDown() ;
		
	}

	
}
