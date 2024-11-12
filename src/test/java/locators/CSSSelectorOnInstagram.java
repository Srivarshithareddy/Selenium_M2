package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorOnInstagram {

	public static void main(String[] args) throws InterruptedException {
          WebDriver driver=new ChromeDriver();
          
          driver.manage().window().maximize();
          driver.get("https://www.instagram.com/");
          
          driver.findElement(By.className("input[name='username']")).sendKeys("Abcdef@123");
          driver.findElement(By.className("input[name='password']")).sendKeys("abcdef@1234");
          driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
          
          Thread.sleep(5000);
          driver.quit();
          
          
	}

}
