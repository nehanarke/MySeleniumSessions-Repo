package launchbrowser;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LinksonWebPage {

	public static void main(String[] args)  throws InterruptedException
	{
	//System.setProperty("webdriver.chrome.driver","C:\chromejars\chromedriver-win64\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	
	List<WebElement> links=(List<WebElement>) driver.findElement(By.tagName("a"));
	
	for(WebElement link:links)
	{
		try 
		{
		if(link.isDisplayed() && link.isEnabled())
		{
			System.out.println("Clickable: " + link.getText());
        } else {
            System.out.println("NOT clickable (disabled or hidden): " + link.getText());
        }
    } catch (Exception e) {
        System.out.println("NOT clickable (exception): " + link.getText() + " - " + e.getClass().getSimpleName());
    }
}

driver.quit();
		}
}
	
