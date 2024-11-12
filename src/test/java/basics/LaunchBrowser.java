package basics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter browser name");
		String browser=sc.next();
		WebDriver driver=null;
	switch (browser) {
	case "chrome": 
		driver=new ChromeDriver();
		break;
		case "Edge":
			driver=new EdgeDriver();
			break;		
	default:
		System.out.println("Invalid browser name");
	}

	}

}
