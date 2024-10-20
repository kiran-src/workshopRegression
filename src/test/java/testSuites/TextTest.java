package testSuites;

import actionKeywords.OpenPageKeywords;
import actionKeywords.TextTestKeywords;
import drivers.BaseTest;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class TextTest extends BaseTest {

    OpenPageKeywords openPage = new OpenPageKeywords();
    TextTestKeywords textTest = new TextTestKeywords();

    @Test()
//    @Description("Verify the correct text in a h1 header")
    public void headerCheck() throws InterruptedException {
        openPage.openPage();
        textTest.headerCheck();
    }

    @Test()
//    @Description("Verify that the company name is present in the h2 header")
    public void companyCheck() throws InterruptedException {
        openPage.openPage();
        textTest.companyCheck();
    }
}
