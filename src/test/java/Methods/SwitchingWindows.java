package Methods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

	public static void main(String[] args) throws InterruptedException {
             WebDriver driver=new ChromeDriver();
             driver.manage().window().maximize();
             driver.get("https://www.google.com/");
             Thread.sleep(3000);
             driver.manage().window().maximize();
             driver.get("https://www.amazon.in/");
             Thread.sleep(3000);
             driver.manage().window().maximize();
             driver.get("https://www.myntra.com/");
             
             Set<String> addresses = driver.getWindowHandles();
             for (String address:addresses)
             {
            	 driver.switchTo().window(address);
            	 if(driver.getCurrentUrl().contains("amazon"));
            	 {
            		 driver.close();
            		 break;
            	 }
             }
      Thread.sleep(2000);
      driver.quit();
             
             
	}

}
