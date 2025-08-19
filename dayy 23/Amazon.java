package Testbg_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Amazon {
	WebDriver driver;
  @Test (priority = 1)
  public void login() throws InterruptedException {
	amazonpageclass pg= new amazonpageclass(driver);
	pg.account();
	
	  pg.email();
	  pg.pass();
  }
  

  @Test(priority=2)
  public void searchmultipleitems() throws InterruptedException {
	  amazonpageclass pg= new amazonpageclass(driver);
	  pg.multiplesearch();
		   
  }
  
  @Test (priority = 3)
  public void addtocart() throws InterruptedException {
	  amazonpageclass pg= new amazonpageclass(driver);
	  pg.singlesearch();
	 
	  pg.item();
	  
	  JavascriptExecutor  jse = (JavascriptExecutor)driver;
	  jse.executeScript("window.scrollBy(0,400)");
	  Thread.sleep(3000);
	  
	 pg.addtocartbtn();
 
	  
}
  
  
  @Test  (priority = 4)
  public void removecart() throws InterruptedException {
	  amazonpageclass pg= new amazonpageclass(driver);
	  pg.cartbtn();
//	  
	  JavascriptExecutor  jse = (JavascriptExecutor)driver;
	  jse.executeScript("window.scrollBy(0,400)");
	  
//	  
	  pg.delete();
//	  
  }
  
  @Test (priority = 5)
  public void changename() throws InterruptedException {
	  amazonpageclass pg= new amazonpageclass(driver);
	  pg.acticon();
	  
	pg.changename();
  }
  
  @Test (priority=6)
  public void changeaddress() {
	  amazonpageclass pg= new amazonpageclass(driver);
	  pg.changeadd();
	  
	  
  }
  @Test (priority = 7)
  public void searchBycat() {
	  amazonpageclass pg= new amazonpageclass(driver);
	  pg.searchByCat();
	 
  }
  
  @Test(priority=8)
  public void changecounter() {
	  amazonpageclass pg= new amazonpageclass(driver);
	  pg.ChangeCountry();
  }
  
  @Test(priority=9)
  public void TodayDeals() throws InterruptedException {
	 amazonpageclass pg = new amazonpageclass(driver);
	 pg.TodayDeals();
	  
  }
  
  
  
  @Test(priority = 10)
  public void language(){
	amazonpageclass pg= new amazonpageclass(driver);
	pg.ChangeLanguage();  
  }
  
 
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=13905050251723794525&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9147349&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	 // driver.close();
  }

}
