package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDAndNameLocatorsPractice1 {

	public static void main(String[] args) throws InterruptedException {
              WebDriver driver=new ChromeDriver();
              driver.manage().window().maximize();
              driver.get("https://www.facebook.com/");
              
              WebElement usernameTF = driver.findElement(By.id("email"));
              usernameTF.sendKeys("varshithareddy499");
              
              WebElement passwordTF = driver.findElement(By.id("pass"));
              passwordTF.sendKeys("jdisoid");
              
              WebElement loginBTN = driver.findElement(By.name("login"));
              loginBTN.click();
              
              Thread.sleep(3000);
              driver.quit();
              
	}

}
