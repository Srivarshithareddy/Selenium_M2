package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.instagram.com/");
            
            driver.findElement(By.linkText("Forgotten password")).click();
            driver.findElement(By.id("identify_email")).sendKeys("njwiefniwnef");
            driver.findElement(By.name("did_submit")).click();
            
            Thread.sleep(2000);
            driver.quit();
	}

}
