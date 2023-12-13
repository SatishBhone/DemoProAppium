package CleanEletric.DemoPro;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CEAppiumBasic extends CEBaseTest {
	
	@Test()
	public void CEappiumTest() 
	{
		   driver.findElement(By.xpath("//android.widget.Button[@content-desc='Click to get devices']")).click();
	}

}
