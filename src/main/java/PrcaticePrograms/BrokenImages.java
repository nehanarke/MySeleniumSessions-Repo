package PrcaticePrograms;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImages 
	{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromejars\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver;
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demoqa.com/broken");
//List interface in Java,managing ordered collections of elements, allowing duplicates and providing positional access.
	List<WebElement>images=driver.findElements(By.tagName("img"));
	//WebElement =interface
	System.out.println("total images"+images.size());
	
	int brokenImageCount = 0;
	
	for(WebElement img:images)
	{
		try
		{
			String imgURL=img.getAttribute("src");
			if(imgURL==null||imgURL.isEmpty())
			{
				System.out.println("Image src is empty");
				continue;
				
			}
//HttpURLConnection is a Java class that facilitates communication with HTTP servers.It is part of the java.net package
			HttpURLConnection connection=(HttpURLConnection)(new URL(imgURL).openConnection());
			connection.setRequestMethod("GET");
			connection.connect();
			int responsecode=connection.getResponseCode();
			  if(responsecode != 200)
			  {
				  System.out.println("Broken image: " + imgURL + " | Status code: " + responsecode);
                  brokenImageCount++;  
			  }
		}
		catch(Exception e)
		{
			 System.out.println("Exception checking image: " + img.getAttribute("src"));
             brokenImageCount++;	
		}
	}
	System.out.println("Total broken images: " + brokenImageCount);
    driver.quit();
	}
}
