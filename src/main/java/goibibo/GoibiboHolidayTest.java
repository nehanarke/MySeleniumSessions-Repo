package goibibo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class GoibiboHolidayTest {

	WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Test
    public void testHolidayBooking() {
        driver.get("https://www.goibibo.com/");

        // Handle phone/email login popup
        try {
            WebElement skipButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Skip']")));
            skipButton.click();
        } catch (Exception e) {
            System.out.println("Login popup did not appear.");
        }

        // Click on Holidays
        WebElement holidayTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='sc-1f95z5i-5 bjZmrz',text()='Holidays']")));
        holidayTab.click();

        // Switch to new tab
        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }

        // From City
        WebElement fromCity = wait.until(ExpectedConditions.elementToBeClickable(By.id("gosuggest_inputSrc")));
        fromCity.sendKeys("Pune");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul/li[contains(.,'Pune')]"))).click();

        // To City
        WebElement toCity = wait.until(ExpectedConditions.elementToBeClickable(By.id("gosuggest_inputDest")));
        toCity.sendKeys("Jaipur");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul/li[contains(.,'Jaipur')]"))).click();

        // Departure date
        WebElement departureInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("departureCalendar")));
        departureInput.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='Mon Sep 15 2025']"))).click();

        // Travelers + Rooms
        WebElement travellerInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("pax_link_common")));
        travellerInput.click();

        // Add 3 Adults
        for (int i = 1; i < 3; i++) {
            driver.findElement(By.xpath("//button[@id='adultPaxPlus']")).click();
        }

        // Add 1 Child
        driver.findElement(By.xpath("//button[@id='childPaxPlus']")).click();

        // Set child age to 3
        WebElement childAgeDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.name("childAge1")));
        childAgeDropdown.sendKeys("3");

        // Click Apply
        driver.findElement(By.id("pax_link_common")).click();

        // Assert URL
        Assert.assertTrue(driver.getCurrentUrl().contains("holidays"), "Navigation to Holidays tab failed.");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}