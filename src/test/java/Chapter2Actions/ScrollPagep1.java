package Chapter2Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollPagep1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        
       WebElement blockbusterdeals = driver.findElement(By.xpath("//span[text()='Blockbuster deals']/ancestor::div[@class='dcl-container-inner']"));
        
        Actions action =new Actions(driver);
        action.scrollToElement(blockbusterdeals).perform();
        
        Thread.sleep(5000);
        
        
	}

}
