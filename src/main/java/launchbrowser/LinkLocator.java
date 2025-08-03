package launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LinkLocator
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromejars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.findElement(By.id("fname")).sendKeys("ABC");
		driver.findElement(By.linkText("This is a link")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"female\"]")).click();
		driver.findElement(By.className("Automation")).click();
		//dropdownlist
		Select s=new Select(driver.findElement(By.id("testingDropdown")));
		s.selectByValue("Manual");
		driver.findElement(By.cssSelector("#AlertBox > button")).click();
		Thread.sleep(5000);
		Alert a=driver.switchTo().alert();
		a.getText();
		a.accept();
		//to cancel = a.dismiss();
		
		
}
}
