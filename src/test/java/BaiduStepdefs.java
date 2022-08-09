
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaiduStepdefs {
    private WebDriver driver;

    @Given("^Go to baidu home$")
    public void go_to_baidu_home() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\GoogleDownload\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("执行了1  @Given(\"^Go to baidu home$\")");
        driver.get("http://www.baidu.com/");
    }

    @When("^I find baidu logo")
    public WebElement i_find_baidu_logo() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOf
                (driver.findElement(By.xpath("//div[@id='lg']/img"))));
        System.out.println("执行了2  @Given(\"^Go to baidu home$\")");
        return element;
    }


    @And("^Type the search text \"([^\"]*)\"$")
    public void type_the_search_text(String searchText) throws Throwable {
        driver.findElement(By.id("kw")).clear();
        driver.findElement(By.id("kw")).sendKeys(searchText);
        System.out.println("执行了3 @Given(\"^Go to baidu home$\")");
    }

    @And("^Click the submit$")
    public void click_the_submit() {
        driver.findElement(By.id("su")).click();
        System.out.println("执行了4  @Given(\"^Go to baidu home$\")");
    }

    @Then("^Wait the query result")
    public void wait_the_query_result() throws InterruptedException {
        Thread.sleep(10000);
        Assert.assertEquals("selenium_百度搜索", driver.getTitle());
        driver.close();
        driver.quit();
        System.out.println("执行了5  @Given(\"^Go to baidu home$\")");
    }
}
