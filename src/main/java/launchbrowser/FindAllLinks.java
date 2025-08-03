package launchbrowser;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Link;
public class FindAllLinks {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\chromejars\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		List<WebElement> lists=driver.findElements(By.tagName("img"));
		System.out.println(lists.size());
		
		for(int i=0;i<lists.size();i++)
		{
			String str=lists.get(i).getText();
			System.out.println(str);
		}
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\ADMIN\\Desktop\\QA\\googlw.png"));
		
	}

	}


