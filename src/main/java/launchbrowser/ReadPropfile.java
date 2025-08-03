package launchbrowser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropfile {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	Properties prop=new Properties();// inbuilt class in java 
	FileInputStream file=new FileInputStream("D:\\Ecllipse\\MySeleniumSessions\\src\\main\\java\\launchbrowser\\config.properties");
	 prop.load(file);
	 String url=prop.getProperty("URL");
	 System.out.println(url);
	// System.out.println(prop.getProperty("name"));
	// System.out.println(prop.getProperty("radiobutton"));
	
	 System.setProperty("webdriver.chrome.driver","C:\\chromejars\\chromedriver-win64\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get(url);
	//Thread.sleep(2000);
	
	driver.findElement(By.id(prop.getProperty("idfortextarea"))).sendKeys(prop.getProperty("name"));
	//driver.close();
	}

}
