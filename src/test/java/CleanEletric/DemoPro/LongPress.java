package CleanEletric.DemoPro;


import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;



import io.appium.java_client.AppiumBy;

public class LongPress extends BaseTest{
	
	
	@Test
	public void longPressGesture() throws MalformedURLException, InterruptedException 
	{
		// hold and long press 
	    driver.findElement(AppiumBy.accessibilityId("Views")).click();
	    driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Expandable Lists']")).click();
	    driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
	    WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
	    longPressAction(ele);
	    String sampleText = driver.findElement(By.id("android:id/title")).getText();
		Assert.assertEquals(sampleText, "Sample menu");
		System.out.println(sampleText);
		System.out.println("test Run Successfully");
		
		// if  text is same than it will pass otherwise falls
	    Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
		 
     	Thread.sleep(2000);
	}

	
}
