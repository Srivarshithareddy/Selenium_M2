package GroupExecutions;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
	
	@Test(groups="sanity")
	public void demo1() {
		Reporter.log("Test3-demo1-sanity", true);
		
	}
	
	@Test(groups="regression")
	public void demo2() {
		Reporter.log("Test3-demo2-regression", true);
		
	}
	@Test(groups={"smoke", "sanity"})
	public void demo3() {
		Reporter.log("Test3-demo3-sanity and regression", true);
	}
	

}
