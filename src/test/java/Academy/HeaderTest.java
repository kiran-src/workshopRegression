package Academy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import variables.Constants;


public class HeaderTest {

	
	@Test
	public void getData() throws InterruptedException {
		String text =Constants.HEADER_TEXT;
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase(Constants.HEADER_TEXT));
		System.out.println("Test 2 Complete");
	}
}
