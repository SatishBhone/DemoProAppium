package CleanEletric.DemoPro;

import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class CEAppiumBasic extends CEBaseTest {
	
	@Test()
	public void CEappiumTest() throws InterruptedException 
	{
		   driver.findElement(By.xpath("//android.widget.Button[@content-desc='Click to get devices']")).click();
	       Thread.sleep(5000);
	       driver.findElement(By.xpath("(//android.view.View)[1]")).click();
	       
	}

}
