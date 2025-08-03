package launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromejars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");		
		
		Actions act=new Actions(driver);
		act.clickAndHold(driver.findElement(By.id("myImage"))).
		moveToElement(driver.findElement(By.id("targetDiv"))).release().build().perform();

		
		
	}

}
