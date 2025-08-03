package launchbrowser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromejars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");	
		
		Actions act=new Actions(driver);//actions is a class
		act.moveToElement(driver.findElement(By.id("menu-item-97"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("menu-item-1000")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.manage().window().maximize();
		
		act.clickAndHold(driver.findElement(By.id("myImage"))).
		moveToElement(driver.findElement(By.id("targetDiv")))
		.release()
		.build()
		.perform();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\ADMIN\\Desktop\\QA\\oo.jpg"));
		
		//driver.close();
		
	}

}
