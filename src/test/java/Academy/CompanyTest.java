package Academy;

import org.junit.Assert;
import org.junit.Test;
import variables.Constants;


public class CompanyTest {

	
	@Test
	public void getData() throws InterruptedException {
		String text =Constants.SUBHEADER_TEXT;
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase(Constants.SUBHEADER_TEXT));
		System.out.println("Test 1 Complete");
	}
}
