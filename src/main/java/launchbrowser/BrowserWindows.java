package launchbrowser;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindows {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromejars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(05,TimeUnit.SECONDS);
		driver.findElement(By.id("messageWindowButton")).click();
		
		Set<String> handler=driver.getWindowHandles();
        Iterator<String> it=handler.iterator();
        String parentid=it.next();
		System.out.println("parent id="+parentid);
		System.out.println(driver.getTitle());
		
		String childid=it.next();
		System.out.println("child window id-"+childid);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(childid);
		Thread.sleep(2000);
		driver.close();
		
		
		driver.switchTo().window(parentid);
	
		
        
        
	}

}
