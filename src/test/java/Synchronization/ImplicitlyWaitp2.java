package Synchronization;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors; 
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitp2 {

	public static void main(String[] args) {
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         driver.get("https://www.swiggy.com/");
         
         List<WebElement> topRestaurants = driver.findElements(By.xpath("//h2[text()='Top restaurant chains in Hyderabad']//ancestor::div[@class='sc-fzQBhs jExwBk']//descendant::div[@class='sc-aXZVg kVQudY']\r\n"));
         List<String> res = topRestaurants.stream().map(s->s.getText()).collect(Collectors.toList());
         for (WebElement restaurants: topRestaurants) { 
        	 
        	List<String> sorted;

        		sorted=	res.stream().sorted().collect(Collectors.toList());
        		System.out.println(sorted);
		
			
 		}
         
         driver.quit();
	}

	

}
