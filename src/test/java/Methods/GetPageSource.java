package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.ajio.com/");
		String pageSource=driver.getPageSource();
	   System.out.println(pageSource);
	   
	   driver.close();
	}

}
