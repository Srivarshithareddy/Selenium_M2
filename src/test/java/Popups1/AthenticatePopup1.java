package Popups1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AthenticatePopup1 {

	public static void main(String[] args) throws InterruptedException {

         WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//p")).getText());
        
	}

}
