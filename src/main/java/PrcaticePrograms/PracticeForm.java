package PrcaticePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromejars\\chromedriver-win64\\chromedriver.exe")	;
	
		WebDriver driver;
		driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		WebElement w;
		w=driver.findElement(By.id("firstName"));
		w.sendKeys("neha");
		
		WebElement w1;
		w1=driver.findElement(By.id("lastName"));
		w1.sendKeys("narke");
		
		WebElement w3;
		w3=driver.findElement(By.id("userEmail"));
		w3.sendKeys("neha@gmail.com");
		
	/*	WebElement w4;
		w4=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[3]/div[2]/div[2]/input"));
		w4.click();
		*/
		
		WebElement w5;
		w5=driver.findElement(By.id("userNumber"));
		w5.sendKeys("78550218489");
		
		/*WebElement w6;
		w6=driver.findElement(By.id("dateOfBirthInput"));
		w6.click();
		Thread.sleep(2000);
		
		String date="18-july-1994";
		String dateArray[]=date.split("-");
		
		String day=dateArray[0];
		String month=dateArray[1];
		String year=dateArray[2];
		
		WebElement w7;
		w7=driver.findElement(By.className("react-datepicker__month-select"));
		Select s=new Select(w7);
		s.selectByVisibleText("July");
		
		WebElement w8;
		w8=driver.findElement(By.className("react-datepicker__year-select"));
		Select yearpick=new Select(w8);
		yearpick.selectByValue("1944");
		
	driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[3]")).click();
	Thread.sleep(2000);
	*/
	WebElement w9;
	w9=driver.findElement(By.id("subjectsInput"));
	w9.sendKeys("DKFCS");
	
	//driver.findElement(By.id("hobbies-checkbox-2")).isSelected();
	
	
	WebElement checkbox = driver.findElement(By.id("hobbies-checkbox-2"));
	System.out.println("Is checkbox selected? " + checkbox.isSelected());
	//driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).isSelected();
	
		}

}
