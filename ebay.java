package Testbg_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ebay {
	WebDriver driver;
  @Test (priority=1)
  public void login() throws InterruptedException {
	  WebElement login=driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a"));
	  login.click();
	  
	  WebElement username=driver.findElement(By.id("userid"));
	  username.sendKeys("swaroopbhyri1143@gmail.com");
	  username.sendKeys(Keys.ENTER);
	  driver.findElement(By.id("signin-continue-btn")).click();
	  Thread.sleep(4000);
	  
	  WebElement pass = driver.findElement(By.id("pass"));
	  pass.sendKeys("Swaroop@2706");
	  pass.sendKeys(Keys.ENTER);
	  driver.findElement(By.id("sgnBt")).click();
	  Thread.sleep(4000);
	  
  }
  
  @Test(priority=2)
  public void searchmultipleitems() throws InterruptedException {
	  WebElement search=driver.findElement(By.id("gh-ac"));
	  
	  String[] searches= {"watch","phone","laptop"};
	  for(String s:searches) {
		  search.sendKeys(s);
		  search.sendKeys(Keys.ENTER);
		  Thread.sleep(3000);
		  search=driver.findElement(By.id("gh-ac"));
		  search.clear();
		  Thread.sleep(3000);
		   
	  } 
  }
  
  @Test (priority=3)
  public void addtocart() throws InterruptedException {
	  WebElement search= driver.findElement(By.id("gh-ac"));
	  search.sendKeys("headset wireless");
	  search.sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  
	WebElement addtocart=  driver.findElement(By.xpath("//*[@id=\"item1d909ffc3d\"]/div/div[1]/div/a/div/img"));
	addtocart.click();

	
	ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));
	  
	  JavascriptExecutor jse= (JavascriptExecutor)driver;
	  jse.executeScript("window.scrollBy(0,400)");
	  
	
	driver.findElement(By.id("atcBtn_btn_1")).click();
	Thread.sleep(3000);
	 driver.switchTo().window(tabs.get(0));
	 
	 WebElement cart=driver.findElement(By.cssSelector("span[class=\"gh-cart__icon\"]"));
	  cart.click();
	  Thread.sleep(3000);
	  
	  
	  WebElement delete=driver.findElement(By.cssSelector("button[data-test-id=\"cart-remove-item\"]"));
	  delete.click();
  }


  
  
  @Test (priority = 4)
  public void  changename() throws InterruptedException {
	  driver.findElement(By.id("gh-logo")).click();
	  
	  WebElement cart=driver.findElement(By.cssSelector("div>button[class=\"gh-flyout__target gh-flyout__target--left\"]"));
	  Actions act=new Actions(driver);
	  act.moveToElement(cart).perform();

	 // WebElement accsetting= driver.findElement(By.cssSelector("class=\"gh-identity-signed-in__link\""));
	  //accsetting.click();
	  driver.get("https://accountsettings.ebay.com/uas");
	  
	  driver.findElement(By.id("account-settings-link-PI")).click();

	  
	  driver.findElement(By.id("individual_username_edit_button")).click();
	  WebElement username=driver.findElement(By.id("user_name"));
	  username.clear();
	  username.sendKeys("Swaroop1234");
	  username.sendKeys(Keys.ENTER);
	  
	  driver.findElement(By.id("username_submit_edit_btn")).click();
	  
  }
  
  @Test (priority = 5)
  public void changeaddress() throws InterruptedException {
	  driver.findElement(By.id("individual_personal_info_address_edit_button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("select>option[value=\"IN\"]")).click();
	  
	  WebElement line1=driver.findElement(By.id("addressLine1"));
	  line1.clear();
	  line1.sendKeys("Hyd");
	  line1.sendKeys(Keys.ENTER);
	  
	  WebElement line2=driver.findElement(By.id("city"));
	  line2.clear();
	  line2.sendKeys("Hyd");
	  line2.sendKeys(Keys.ENTER);
	  
	  driver.findElement(By.cssSelector("select>option[value=\"AP\"]")).click();
	  
	  WebElement pin=driver.findElement(By.id("postalCode"));
	  pin.clear();
	  pin.sendKeys("55151");
	  pin.sendKeys(Keys.ENTER);
	  
	  driver.findElement(By.id("address_edit_submit_button")).click();
	  
  }
  
  @Test (priority= 6)
   public void shopBycatagory() throws InterruptedException {
	  driver.findElement(By.cssSelector("button[aria-controls=\"s0-1-4-12-0-1-dialog\"]")).click();
	  Thread.sleep(3000); 
	  driver.findElement(By.cssSelector("a[_sp=\"m570.l3410\"]")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[2]/section/div/ul/li[3]/span/a")).click(); 
	  Thread.sleep(6000); 
	  driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[1]/div/nav/ul/li[1]/a")).click();
	  Thread.sleep(3000);
	  }
  
  @Test(priority = 7)
  public void shopbyall() throws InterruptedException {
	  driver.findElement(By.cssSelector("select>option[value=\"12576\"]")).click(); 
	  Thread.sleep(3000);
	  driver.findElement(By.id("gh-search-btn")).click(); 
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[1]/div/nav/ul/li[1]/a")).click(); 
	  Thread.sleep(3000);
  }
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
