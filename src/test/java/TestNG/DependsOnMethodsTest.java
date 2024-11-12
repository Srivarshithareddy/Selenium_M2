package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsTest {

	@Test
	public void registrationTest() {
		Reporter.log("Register to app", true);
	//	Assert.fail();
		
	}
	@Test(dependsOnMethods="registrationTest")
	public void loginTest() {
		Reporter.log("Login to App", true);
		
	}
	@Test(dependsOnMethods="loginTest")
	public void updateProfileTest() {
		Reporter.log("update profile", true);
		
	}
}
