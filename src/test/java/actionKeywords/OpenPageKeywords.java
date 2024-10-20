package actionKeywords;

import drivers.BaseTest;
import variables.Constants;

public class OpenPageKeywords extends BaseTest {

    public void openPage(){
        driver.get(Constants.USER_BASE_URL);
    }
}
