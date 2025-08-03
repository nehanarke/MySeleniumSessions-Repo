package launchbrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args)
	{
		System.setProperty("wendriver.chrome.driver","C:\\chromejars\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		//dynamic xpath= always start with // for writing xpath ,[@ and then add the vale in ' ' ].
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("neha n");
		
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("roseicon");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("pune");
		
	driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("abc@fmai.com");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		/*driver.findElement(By.xpath("//input[contains(@id,'test_12')]")).sendKeys("");
		
		//when ids or names are continously changing- we use following paths 
		
		driver.findElement(By.xpath("//input[starts-with(@id,'test_1')]")).sendKeys("ddd");
		driver.findElement(By.xpath("//input[ends-with(@id,'_121_')]")).sendKeys("a");
		*/
		
		//for links =use customize xpath. -
		//all the links are represented by <a> html tag-
		
		//driver.findElement(By.xpath("//a[contains(text().'My Account']")).click();
		
	}

}
