package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/buttons");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	
	WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
	Actions act=new Actions(driver);
	act.doubleClick(doubleclick).perform();
	System.out.println("Double click");
	
	WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
	act.contextClick(rightclick).perform();
	System.out.println("RIGHT click");
	
	WebElement click=driver.findElement(By.id("ClickBtn"));
	act.contextClick(click).perform();
	System.out.println(" click");	
	
	//perform Mouse Actions
	driver.get("https://www.ebay.com/");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	
	Actions act1=new Actions(driver);
	WebElement motors=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
	act1.moveToElement(motors).perform();
	
	WebElement fashion=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/a"));
	act1.moveToElement(fashion).perform();
	
	driver.get("https://demoqa.com/droppable");
	driver.manage().window().maximize();
	Actions act2=new Actions(driver);
	WebElement Source=driver.findElement(By.id("draggable"));
	WebElement target=driver.findElement(By.id("droppable"));
	act2.dragAndDrop(Source, target).perform();
	
}
}
