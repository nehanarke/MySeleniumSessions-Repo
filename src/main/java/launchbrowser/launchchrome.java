package launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class launchchrome 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromejars\\chromedriver-win64\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	System.out.println(driver.getTitle());
	//driver.manage().window().maximize();
	//
	
	driver.findElement(By.cssSelector("#firstName")).sendKeys("neha"); 
	driver.findElement(By.id("lastName")).sendKeys("narke");
	//for Csselector use id and put #. #username.
	driver.findElement(By.cssSelector("#userEmail")).sendKeys("neha@gmail.com");
	
	driver.findElement(By.xpath(" //*[@id=\"userNumber\"]")).sendKeys("75822");
	//driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div")).sendKeys("abc");
	Select s=new Select(driver.findElement(By.id("city")));
	
	
	}

}
