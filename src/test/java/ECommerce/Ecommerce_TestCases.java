package ECommerce;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Ecommerce_TestCases extends BaseTest{
	
	@Test()
   public void Test1() throws InterruptedException 
	{
		
		//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Satish Bhone");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	    String toastMessage = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
	    Assert.assertEquals(toastMessage, "Please enter your name");
	    
	    System.out.println("Test Run Succesuflly");
		
		
	}
}
