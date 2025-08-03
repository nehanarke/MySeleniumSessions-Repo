package launchbrowser;



import java.util.Iterator;
import java.util.Set;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleWindowPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromejars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//button[@onclick='newwindow()']")).click();
		//Alert a=driver.switchTo().alert();
		//Actions a=new Actions(driver);
		
		
//an Iterator is an interface that enables traversal through a collection of objects, 
		//such as lists,sets, one element at a time.
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
