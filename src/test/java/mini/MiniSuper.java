package mini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.MiniPageElement;
import util.WaitUtil;

import java.util.concurrent.TimeUnit;

public class MiniSuper {

    WebDriver driver =MiniSuper();
    MiniPageElement miniPageElement = new MiniPageElement(driver);
    WaitUtil waitUtil = new WaitUtil();

    public WebDriver MiniSuper(){

        System.setProperty("webdriver.chrome.driver", "D:\\GoogleDownload\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

}
