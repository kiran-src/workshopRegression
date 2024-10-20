package objects;

import drivers.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextTestObject extends BaseTest {
    public WebElement header(){
        return driver.findElement(By.xpath("/html/body/section[1]/div/h1"));
    }
    public WebElement companyName(){
        return driver.findElement(By.xpath("/html/body/section[1]/div/h2"));
    }}