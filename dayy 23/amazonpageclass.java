package Testbg_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonpageclass {
WebDriver driver;

public amazonpageclass(WebDriver driver) {
	this.driver=driver;
}

public void account() {
	 driver.findElement(By.id("nav-link-accountList")).click();
	 
}
public void email() {
	 WebElement login = driver.findElement(By.id("ap_email_login"));
	  login.sendKeys("swaroopbhyri1143@gmail.com");
	  login.sendKeys(Keys.ENTER);
	  
}
public void pass() {
	WebElement password = driver.findElement(By.id("ap_password"));
	  password.sendKeys("Swaroop@2706");
	  password.sendKeys(Keys.ENTER);
	  
}
public void multiplesearch() {
	 WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	  
	  String[] searches= {"watch","phone","laptop"};
	  for(String s:searches) {
		  search.sendKeys(s);
		  search.sendKeys(Keys.ENTER);
		  search=driver.findElement(By.id("twotabsearchtextbox"));
		  search.clear();
}
}
public void singlesearch() {
	  WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	  search.sendKeys("Sony ZX Series MDR-ZX310AP Wired Headband Stereo On Ear Headset -Black");
	  search.sendKeys(Keys.ENTER);
	  
}
public void item() throws InterruptedException {
	 driver.findElement(By.cssSelector("h2[aria-label='Sony ZX Series MDR-ZX310AP Wired Headband Stereo On Ear Headset -Black']")).click();
	 Thread.sleep(3000);
}

public void addtocartbtn() throws InterruptedException {
	 driver.findElement(By.id("add-to-cart-button")).click();
	 Thread.sleep(3000);
driver.findElement(By.cssSelector("a[class=\"a-link-normal attach-close-button\"]")).click();
}
public void cartbtn() throws InterruptedException {
	  WebElement cart = driver.findElement(By.cssSelector("a[id=\"nav-cart\"]"));
	  cart.click();
	  Thread.sleep(3000);
}
public void acticon() {
	driver.findElement(By.id("nav-link-accountList")).click();
	
}
public void delete() {
	WebElement delete = driver.findElement(By.cssSelector("input[name=\"submit.delete-active.bd3369b8-154b-4291-a636-cef05f7bb4d7\"]"));
	  delete.click();
}
public void changename() {
	driver.findElement(By.cssSelector("div[data-card-identifier=\"SignInAndSecurity\"]")).click();
	
	driver.findElement(By.cssSelector("a[aria-label=\"Edit name\"]")).click();
  
	WebElement name= driver.findElement(By.id("ap_customer_name"));
	name.clear();
	name.sendKeys("Swaroop");
	name.sendKeys(Keys.ENTER);
  
	driver.findElement(By.id("a-autoid-0")).click();
}
public void changeadd() {
	driver.findElement(By.id("glow-ingress-line2")).click();
	  driver.findElement(By.id("GLUXManageAddressLink")).click();
	  driver.findElement(By.id("ya-myab-plus-address-icon")).click();
	  
	  WebElement fname= driver.findElement(By.id("address-ui-widgets-enterAddressFullName"));
	  fname.sendKeys("Swaroop");
	  fname.sendKeys(Keys.ENTER);
	  
	  WebElement phn = driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber"));
	  phn.sendKeys("9391107616");
	  phn.sendKeys(Keys.ENTER);
	  
	  WebElement pin = driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode"));
	  pin.sendKeys("533101");
	  pin.sendKeys(Keys.ENTER);
	  
	  WebElement house= driver.findElement(By.id("address-ui-widgets-enterAddressLine1"));
	  house.sendKeys("rjy");
	  house.sendKeys(Keys.ENTER);
	  
	  WebElement house1= driver.findElement(By.id("address-ui-widgets-enterAddressLine2"));
	  house1.sendKeys("rjy");
	  house1.sendKeys(Keys.ENTER);
	 
	  
	  WebElement city= driver.findElement(By.id("address-ui-widgets-enterAddressCity"));
	  city.sendKeys("rjy");
	  city.sendKeys(Keys.ENTER);
	  
	  //driver.findElement(By.cssSelector("span[data-csa-c-id=\"ibvfii-gw3hsr-q15tx5-qvrcar\"]")).click();
	  driver.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_1")).click();
	  
	  driver.findElement(By.cssSelector("input[aria-labelledby=\"address-ui-widgets-form-submit-button-announce\"]")).click();
	  
	  
}

public void searchByCat() {
	 driver.findElement(By.id("searchDropdownBox")).click();
	  driver.findElement(By.cssSelector("select>option[value=\"search-alias=stripbooks\"]")).click();
	  WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
	  search.sendKeys("Harry Potter");
	  search.sendKeys(Keys.ENTER);
}
public void ChangeLanguage() {
  driver.findElement(By.cssSelector("a[class=\"nav-a nav-a-2 icp-link-style-2\"]")).click();
	  
	  driver.findElement(By.id("icp-language-translation-hint")).click();
	  
	  driver.findElement(By.id("icp-save-button")).click();;
}

public void ChangeCountry() {
  driver.findElement(By.id("nav-logo-sprites")).click();
	  
	  driver.findElement(By.id("icp-touch-link-country")).click();
	  
	  driver.findElement(By.cssSelector("span[class=\"a-button-text a-declarative\"]")).click();
	  driver.findElement(By.id("icp-dropdown_6")).click();
}

public void TodayDeals() throws InterruptedException {
	 driver.findElement(By.id("nav-logo-sprites")).click();
	  
	  driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_cs_gb\"]")).click();
	  
	  Thread.sleep(3000);
}
}
