package webelementMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice1Amazon {

	public static void main(String[] args) throws InterruptedException {

		  WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.in/");
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	       WebElement dropDown = driver.findElement(By.cssSelector("div#nav-search-dropdown-card"));
	       dropDown.click();
	       
	      List<WebElement> down = dropDown.findElements(By.tagName("option"));
	       
	       for (WebElement dropdown : down) {
				System.out.println(dropDown.getText());
			}
	       
	       driver.findElement(By.xpath("//option[text()='Watches']")).click();
	       
	       driver.findElement(By.id("nav-search-submit-button")).click();
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("(//input[@aria-labelledby='Prime Eligible']/following-sibling::i[@class='a-icon a-icon-checkbox'])")).click();
	       
	       driver.findElement(By.xpath("//li[@aria-label='Fossil']/descendant::div")).click();
	       
	      //driver.findElement(By.partialLinkText("/Fossil-Nate-Chronograph-Black-Watch")).click();
	       
	      WebElement fossil=driver.findElement(By.partialLinkText("Nate Chronograph Analog Black Dial Grey Band Men's Stainless Steel Watch - JR1401")); 
	    //  fossil.click();
	      Actions action=new Actions(driver);
	      action.scrollToElement(fossil).perform();
	      System.out.println(fossil.getText());
	      
	      driver.findElement(By.id("a-autoid-14-announce")).click();
	       
	      
	       
	       
	       //driver.quit();
	      
	        
	       
	       
	        
	}

}
