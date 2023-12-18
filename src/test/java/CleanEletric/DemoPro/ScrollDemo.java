package CleanEletric.DemoPro;


import java.net.MalformedURLException;

import org.testng.annotations.Test;



import io.appium.java_client.AppiumBy;

public class ScrollDemo extends BaseTest{
	
	
	@Test
	public void ScroleDemoTest() throws MalformedURLException, InterruptedException 
	{
		// Scrolling Action
	    driver.findElement(AppiumBy.accessibilityId("Views")).click();
	    // If Know Where to Scroll used this.
	  //  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));
	    Thread.sleep(3000); 
	    ScrollToEndAction();
	}

	
}
