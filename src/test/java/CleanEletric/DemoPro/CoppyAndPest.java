package CleanEletric.DemoPro;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class CoppyAndPest extends BaseTest {

	@Test
	public void appiumTest() throws MalformedURLException, InterruptedException 
	{
		
    // Xpath, id, accesibilityId, Classname, AndroidUIAutomator
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("\r\n"+ "//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		// Rotation Code
		DeviceRotation LandScape = new DeviceRotation(0, 0, 90);
		driver.rotate(LandScape);
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		// Verify the Title is Wifi settings
    	String wifttitle =	driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(wifttitle, "WiFi settings");
	    //Copy
		// Copy to Clipboard ---> Pest In Clipboard
		driver.setClipboardText("Satish Bhone");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		driver.findElement(AppiumBy.className("android.widget.Button")).click();
		
		//driver.navigate().back();
		
		
		//driver.navigate().back();
		
	//	tearDown() ;
		
	}

}
