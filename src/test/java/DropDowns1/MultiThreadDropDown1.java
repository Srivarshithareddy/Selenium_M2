package DropDowns1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiThreadDropDown1 {

	public static void main(String[] args) throws InterruptedException {

		
WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://demoapp.skillrary.com/");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement courses = driver.findElement(By.id("cars"));
        Select s=new Select(courses);
        s.selectByIndex(0);
        Thread.sleep(2000);
        
        s.selectByValue("99");
        Thread.sleep(2000);
        s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
        System.out.println("==============");
        List<WebElement> list = s.getOptions();
        
        for (WebElement e : list) {
        	
        	System.out.println(e.getText());
			
		}
        System.out.println("===========");
        if(s.isMultiple()) {
        	System.out.println("Multi select");
        System.out.println("Fisrt selected option"+s.getFirstSelectedOption().getText());
        
        List<WebElement> selectedOptions = s.getAllSelectedOptions();
        for (WebElement opt : selectedOptions) {
			System.out.println(opt.getText());
		}
        
        s.deselectAll();
        } else {
        	System.out.println("single select");
        	
        } 
        
        driver.quit();

	}

}
