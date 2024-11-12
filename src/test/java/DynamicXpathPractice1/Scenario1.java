package DynamicXpathPractice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
        
        driver.findElement(By.name("q")).sendKeys("iphone ");
        Thread.sleep(3000);
        driver.findElement(By.className("_2iLD__")).click();
        
        int sum=0;
        for(;;) {
        	Thread.sleep(3000);
        	List<WebElement> list = driver.findElements(By.className("KzDlHZ"));
        	sum=sum+list.size();
        	try {
        		driver.findElement(By.xpath("//span[text()='Next']")).click();
        		
        	}
        	catch(Exception e) {
        		break;
        	}
        	
        }
        String header=driver.findElement(By.className("BUOuZu")).getText();
        String[] str=header.split(" ");
        int actualNumber=Integer.parseInt(str[5]);
        
        if(sum==actualNumber)
        	System.out.println("Products matched");
        else
        	System.out.println("not matched");
        
        driver.quit();
	}

}
