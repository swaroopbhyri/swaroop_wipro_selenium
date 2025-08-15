package automation;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		 WebElement username= driver.findElement(By.id("user-name"));
		 username.sendKeys("standard_user");
		 username.sendKeys(Keys.ENTER);
		 
		 WebElement pass= driver.findElement(By.id("password"));
		 pass.sendKeys("secret_sauce");
		 pass.sendKeys(Keys.ENTER); 
		
		 driver.findElement(By.id("login-button")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.cssSelector("span[class=\"shopping_cart_badge\"]")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("checkout")).click();
		 Thread.sleep(3000);
		 WebElement first_name= driver.findElement(By.id("first-name"));
		 first_name.sendKeys("Swaroop");
		 first_name.sendKeys(Keys.ENTER);
		 
		 WebElement lastname = driver.findElement(By.cssSelector("input[id=\"last-name\"]"));
		 lastname.sendKeys("Bhyri");
		 lastname.sendKeys(Keys.ENTER);
		 
		 WebElement pin = driver.findElement(By.id("postal-code"));
		 pin.sendKeys("533101");
		 pin.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 
		 
		 JavascriptExecutor jse =  (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,400)");
		 
		 driver.findElement(By.id("finish")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("back-to-products")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("react-burger-menu-btn")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("logout_sidebar_link")).click();
		 
		 
		 
		 
	}

}
