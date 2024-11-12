package Chap3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Declaration
	@FindBy(name="email")
	private WebElement emailTF;
	
	@FindBy(id="password")
	private WebElement passwordTF;
	
	@FindBy(css="[type='checkbox']")
	private WebElement keepMeLoggedInCheckBox;
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	private WebElement forgotPWDLink;
	
	@FindBy (className="login_Btn")
	private WebElement loginBTN;
	
	//Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void setEmail(String email)
	{
		emailTF.sendKeys(email);
		
	}
	public void setPassword(String pwd)
	{
		passwordTF.sendKeys(pwd);
	}
	public void clickKeepMeLoggedIn() {
		keepMeLoggedInCheckBox.click();
	}
	
	public void forgetPassword() {
		forgotPWDLink.click();
	}
	public void clickLogin() {
		loginBTN.click();
	}
}
