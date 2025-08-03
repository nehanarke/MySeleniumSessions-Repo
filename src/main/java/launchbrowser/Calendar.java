package launchbrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\chromejars\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/date-picker");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		Thread.sleep(2000);

		String date="8-june-2021";
		String dateArr[]=date.split("-");
		
		String day=dateArr[0];
		String month=dateArr[1];
		String year=dateArr[2];
		
		Select s=new Select(driver.findElement(By.className("react-datepicker__month-select")));
		s.selectByValue("5");
		
		Select sdate=new Select(driver.findElement(By.className("react-datepicker__year-select")));
		sdate.selectByValue("2021");
		
		//driver.findElement(By.xpath("//input[@class='react-datepicker__day react-datepicker__day--019']")).click();
		driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[7]")).click();
	}

}
