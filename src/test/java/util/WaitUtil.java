package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {

    //判断等待时间内元素是否出现
    public  WebElement wait(WebDriver driver,long time,WebElement xpath) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
        return element;
    }
}
