package CleanEletric.DemoPro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class DragDropDemo extends BaseTest {
	
	@Test()
	public void dragDropTest() throws InterruptedException {
		
	 driver.findElement(AppiumBy.accessibilityId("Views")).click();
	 driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	 
	 WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
	 
	 ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
	     "elementId", ((RemoteWebElement)source ).getId(),
	     "endX", 831,
	     "endY", 733
	 ));
	 Thread.sleep(3000);
	String Result = driver.findElement(By.id("io.appium.android.apis:id/drag_text")).getText();
	
	Assert.assertEquals(Result, "Dot : io.appium.android.apis.view.DraggableDot{28b3fdf VFED..CL. ...P..I. 0,180-554,734 #7f09007b app:id/drag_dot_1}");

	System.out.println("DropElememt Successfully");
	
	}
}
