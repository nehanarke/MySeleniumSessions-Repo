package launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromejars\\chromedriver-win64\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.switchTo().frame("frame1Wrapper");
		//frame accept id as well as string value
		
		
	}

}
