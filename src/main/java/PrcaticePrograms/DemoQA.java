package PrcaticePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQA {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\chromejars\\chromedriver-win64\\chromedriver.exe")	;
	driver=new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	
	driver.findElement(By.id("userName")).sendKeys("Kapil Sharma");
	driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("kapil@home.com");
	
	driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("N-89,mumbai");
	
	WebElement w;
	w=driver.findElement(By.cssSelector("#permanentAddress"));
	w.sendKeys(Keys.SHIFT,"India");
	
	w.sendKeys(Keys.ENTER);
	w.sendKeys("national");
	//Thread.sleep(2000);
	driver.findElement(By.id("submit")).click();
	driver.findElement(By.id("item-1")).click();
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[2]/span")).click();
	WebElement checkbox;
	checkbox=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/ol/li/span/label/input"));
	
	Actions a=new Actions(driver);
	a.click().contextClick().build().perform();
	
	WebElement Check;
	Check=driver.findElement(By.className("rct-icon rct-icon-uncheck"));
	if (!Check.isSelected()) {
		Check.click();
    }

    // Optional: Close the browser
    driver.quit();
	
	}
}
