package PrcaticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromejars\\chromedriver-win64\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		try
		{
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		WebElement w;
		w=driver.findElement(By.id("doubleClickBtn"));
		
		Actions a=new Actions(driver);
		a.doubleClick(w).perform();
		
		WebElement message;
		message=driver.findElement(By.id("doubleClickBtn"));
		System.out.println("text="+message.getText());
		
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		finally
		{
			
		}
		
		Thread.sleep(2000);
		WebElement right;
		right=driver.findElement(By.id("rightClickBtn"));
		Actions a1=new Actions(driver);
		a1.contextClick(right).build().perform();
		Thread.sleep(2000);
		
		WebElement left;
		left=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]/button"));
		//left=driver.findElement(By.cssSelector("button.btn btn-primary"));
		left.click();
		
		WebElement e;
		e=driver.findElement(By.tagName("body"));
		e.sendKeys(Keys.PAGE_DOWN);
		
	}

}
