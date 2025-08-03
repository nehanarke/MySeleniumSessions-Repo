package goibibo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingTicket 
{
	WebDriver driver;
	@Test
	public void openpage()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromejars\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();  // Automatically matches Chrome version
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");

        // Launch browser
        WebDriver driver1 = new ChromeDriver(options);

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(10));

        // Open Goibibo
        driver1.get("https://www.goibibo.com/");

        // Close popup if it appears
        try {
            // Wait for and close login popup
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.logSprite.icClose"))).click();
        } catch (Exception e) {
            System.out.println("No login popup to close.");
        }

        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        String pid  = driver1.getWindowHandle();

		String childis = "";

	Set<String> allid = driver1.getWindowHandles();

		for(String id :allid)
		{
			if(!pid.equals(id))
				childis = id;
			driver1.switchTo().window(childis);
		}
	}
}