package assertionsch3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssetTest {

	@Test
	public void Demo() {
		String s1="Hello";
		String s2="Hi";
		
		Assert.assertEquals(s1, s2);

		System.out.println(s1);
		System.out.println(s2);
	}
}
