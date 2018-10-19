package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokTest {

	WebDriver driver;
	
	@Given("^Open firfox and start application$")
	public void Open_firfox_and_start_application() throws Throwable {
	   
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cabionline.com/");
		
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
	
}
	
	