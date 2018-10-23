package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import helpers.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import step_definitions.BaseClass;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class cabiStepDefs extends BaseClass {
    Wait wait = new Wait();

//    WebDriver driver;

    @Given("^Open chrome and start application$")
    public void Open_chrome_and_start_application() throws Throwable {

//        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("https://www.cabionline.com/");
        System.out.println(driver.getTitle());

    }
    @When("^I click on confirm region$")

    public void I_Click_Confirm_Region() throws Throwable {

        driver.findElement(By.xpath(".//*[@id='modal']/locale-selector/div/a")).click();

        Thread.sleep(4000);

    }

    @Then("^user should be able to Click on Shop BY item link$")
    public void user_should_be_able_to_click_shopBy_Item() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='mm-0']/div/section[1]/div/div[1]/div/div/div/div[2]/div/div[2]/a[1]")).click();
        Thread.sleep(4000);
    }


    @Then("^user click on quick view$")
    public void user_click_on_quick_view() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='collection-archive-item-grid']/ul/li[4]/collection-item/article/div/div[1]/div[2]/a/div[1]/div/div")).click();
        Thread.sleep(4000);
    }


    @Then("^user able to select size cloth$")
    public void user_able_to_select_size_cloth() throws Throwable {
        WebElement SelectClothSize = driver.findElement(By.xpath(".//*[@id='attribute-size']/div/select"));
        Select dropdown= new Select(SelectClothSize);
        dropdown.selectByVisibleText("M");
        Thread.sleep(4000);
    }

    @Then("^user clicks on Add to cart button$")
    public void user_clicks_on_add_cart_button() throws Throwable {
        driver.findElement(By.id("quick-look-get-this-item")).click();
        Thread.sleep(4000);
    }

    @Then("^check cart$")
    public void check_cart() throws Throwable {
        driver.findElement(By.id("bag-icon")).click();
        Thread.sleep(4000);
    }
    @Then("^checkout from cart$")
    public void checkout_from_cart() throws Throwable {
        driver.findElement(By.xpath("//div[@class='inline-block checkout']")).click();
        Thread.sleep(2000);
    }

    @Then("^quit browser$")
    public void quit_browser() throws Throwable {
        Thread.sleep(4000);
        driver.quit();

    }

    @And("^I click on login user icon$")
    public void iClickOnLoginUserIcon() throws Throwable {
       Thread.sleep(5000);
       wait.waitUntilClickable(driver.findElement(By.xpath("//*[@id='page-']/div[2]/div[3]/div/div/div[5]/div[2]/a"))).click();
    }

    @And("^I enter email in Email address field$")
    public void iEnterEmailInEmailAddressField() throws Throwable {
        Thread.sleep(5000);
        wait.waitAndSendKeysByElement(driver.findElement((By.xpath("//*[@id='page-']/div[7]/div/div/div/account/div/login-gateway/div/form/div[1]/custom-input/div/input"))),"user@neosofttech.com");
    }

    @And("^I click on Continue button for login$")
    public void iClickOnContinueButtonForLogin() throws Throwable {
       wait.waitAndClick(driver.findElement(By.className("btn-continue")));
       Thread.sleep(5000);
    }

    @And("^I see the signup page instead of an error message when the email adderess doesnt exist$")
    public void iSeeTheSignupPageInsteadOfAnErrorMessageWhenTheEmailAdderessDoesntExist() throws Throwable {
        assertEquals(driver.findElement(By.className("title")).getText(),"New to cabi?");
    }

    @And("^I click on flag to change region to US$")
    public void iClickOnFlagToChangeRegionToUS() throws Throwable {
        Thread.sleep(5000);
        wait.waitAndClick(driver.findElement(By.xpath("//*[@id='page-']/div[2]/div[3]/div/div/div[5]/locale-indicator")));
        wait.waitAndClick(driver.findElement(By.xpath("//*[@id='modal']/locale-selector/ul/li[2]")));
        driver.findElement(By.xpath(".//*[@id='modal']/locale-selector/div/a")).click();
        Thread.sleep(4000);
    }

    @When("^I click on confirm region for US$")
    public void iClickOnConfirmRegionForUS() throws Throwable {
        wait.waitAndClick(driver.findElement(By.xpath("//*[@id='modal']/locale-selector/ul/li[1]")));
        driver.findElement(By.xpath(".//*[@id='modal']/locale-selector/div/a")).click();
        Thread.sleep(4000);
    }

    @And("^I click on a product$")
    public void iClickOnAProduct() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='mm-0']/div/section[3]/div/div/div/a[3]/div/div[2]")).click();
        Thread.sleep(2000);
    }

    @And("^I click on flag icon to change region to Canada$")
    public void iClickOnFlagIconToChangeRegionToCanada() throws Throwable {
        Thread.sleep(5000);
        wait.waitAndClick(driver.findElement(By.xpath("//*[@id='page-collection-clothes-cloak-cardigan']/div[2]/div[3]/div/div/div[5]/locale-indicator/locale-flag")));
        wait.waitAndClick(driver.findElement(By.xpath("//*[@id='modal']/locale-selector/ul/li[2]")));
        driver.findElement(By.xpath(".//*[@id='modal']/locale-selector/div/a")).click();
        Thread.sleep(4000);
    }

    @And("^I verify the price of the product is in dollars$")
    public void iVerifyThePriceOfTheProductIsInDollars() throws Throwable {
        assertTrue(driver.findElement(By.xpath("//*[@id='item-meta-data']/ul/li[5]/div")).getText().contains("$"));
    }

    @And("^I verify the price of the product is in pounds$")
    public void iVerifyThePriceOfTheProductIsInPounds() throws Throwable {
        assertTrue(driver.findElement(By.xpath("//*[@id='item-meta-data']/ul/li[5]/div")).getText().contains("£"));
    }


    @And("^I click on flag icon to change region to UK$")
    public void iClickOnFlagIconToChangeRegionToUK() throws Throwable {
        Thread.sleep(5000);
        wait.waitAndClick(driver.findElement(By.xpath("//*[@id='page-collection-clothes-cloak-cardigan']/div[2]/div[3]/div/div/div[5]/locale-indicator/locale-flag")));
        wait.waitAndClick(driver.findElement(By.xpath("//*[@id='modal']/locale-selector/ul/li[3]")));
        driver.findElement(By.xpath(".//*[@id='modal']/locale-selector/div/a")).click();
        Thread.sleep(4000);
    }
}
	
	