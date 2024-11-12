package Popups1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup1 {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.name("q")).sendKeys("iphone" +Keys.ENTER);
        driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']")).click();
        String parenthandle=driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String id: windowHandles) {
        	driver.switchTo().window(id);
        	if(driver.getTitle().contains("Apple iphone"))
        		break;
			
		}
        driver.findElement(By.xpath("//button[text()='Add to cart']"));
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(parenthandle);
        driver.navigate().refresh();
        String count=driver.findElement(By.className("_75nlfW")).getText();
        System.out.println(count);
        driver.quit();
        
        
	}

}
