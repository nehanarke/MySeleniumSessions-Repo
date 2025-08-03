package launchbrowser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileupload 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromejars\\chromedriver-win64\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.findElement(By.xpath("//*[@id=\"uploadFile\"]")).sendKeys("C:\\Users\\ADMIN\\Desktop\\QA\\flower.jfif");
	
		Set<String> handler=driver.getWindowHandles();
		Iterator<String>it=handler.iterator();
		
		String parentid=it.next();
		System.out.println(parentid);
		System.out.println(driver.getTitle());
		
		String childid=it.next();
		System.out.println(childid);
		System.out.println(driver.getTitle());
	
	driver.switchTo().window(childid);
	
	
	}

}
