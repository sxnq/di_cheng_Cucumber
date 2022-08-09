package mini;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MiniStepdefs extends MiniSuper {

    @Given("^Go to mini home$")
    public void goToMiniHome() {
        driver.get("http://mini.360.cn/test/win.html");
    }

    @When("^I find mini logo$")
    public void iFindMiniLogo() {
         waitUtil.wait(driver,10,miniPageElement.imgIcon_ico0);
    }

    @And("^Click the close$")
    public void clickTheClose() {
        miniPageElement.close.click();
    }

    @Then("^Wait the current result$")
    public void waitTheCurrentResult() {
    }
}
