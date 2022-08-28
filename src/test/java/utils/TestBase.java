package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

WebDriver driver;	

	public WebDriver WebDriverManager() throws IOException {
	
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Global.properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String URL=prop.getProperty("url");
		String browserName=prop.getProperty("browser");
		
		if(driver==null) {
			
			if(browserName.equalsIgnoreCase("chrome")) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
			}
			else if(browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			
			driver.get(URL);
			}
		
return driver;
		
	}
	
	
}
