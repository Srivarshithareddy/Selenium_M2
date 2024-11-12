package webelementMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2Amazon {

	public static void main(String[] args) {

		 WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.in/");
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	       driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
	        
	        driver.findElement(By.xpath("(//div[text()='Audible Audiobooks'])[1]")).click();
	       
	      driver.findElement(By.xpath("(//div[text()='Audible Audiobooks'])[2]")).click();
	      
	      
	        
	       
	}

}
