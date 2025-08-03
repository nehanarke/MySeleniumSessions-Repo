package PrcaticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDowload {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromejars\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demoqa.com/upload-download");
	WebElement w=driver.findElement(By.id("downloadButton"));
	w.click();
	
	WebElement w1;
	w1=driver.findElement(By.id("uploadFile"));
	w1.sendKeys("C:\\Users\\ADMIN\\Pictures\\Screenshots");
	}

}
