package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	
	WebElement acceptalert= driver.findElement(By.id("alertButton"));
	acceptalert.click();
	Thread.sleep(4000);
	Alert alert1=driver.switchTo().alert();
	alert1.accept();
	
	WebElement timealert= driver.findElement(By.id("timerAlertButton"));
	timealert.click();
	Thread.sleep(7000);
	Alert alert2=driver.switchTo().alert();
	alert2.accept();
	
	WebElement conformalert= driver.findElement(By.id("confirmButton"));
	conformalert.click();
	Thread.sleep(4000);
	Alert alert3=driver.switchTo().alert();
	alert3.dismiss();
	
	WebElement promtButton= driver.findElement(By.id("promtButton"));
	promtButton.click();
	Thread.sleep(4000);
	Alert alert4=driver.switchTo().alert();
	alert4.sendKeys("Swaroop");
	alert4.accept();
	
}
}

