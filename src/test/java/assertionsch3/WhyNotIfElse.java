package assertionsch3;

import org.testng.annotations.Test;

public class WhyNotIfElse {

	@Test
	public void Demo() {
		String s1="Hello";
		String s2="Hi";
		 if(s1.equals(s2))
			 System.out.println("pass");
		 else
			 System.out.println("fail");
	}
}
