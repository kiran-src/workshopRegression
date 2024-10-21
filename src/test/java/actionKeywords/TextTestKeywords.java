package actionKeywords;

import drivers.BaseTest;
import objects.TextTestObject;
import org.junit.Assert;
import variables.Constants;

public class TextTestKeywords extends BaseTest {
    TextTestObject textObj = new TextTestObject();
    public void headerCheck() throws InterruptedException {
        Assert.assertEquals(textObj.header().getText(), Constants.HEADER_TEXT);
    }
    public void companyCheck() throws InterruptedException {
        Assert.assertEquals(textObj.companyName().getText(), Constants.SUBHEADER_TEXT);
    }
}
