package pc_01base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public ChromeDriver driver;

	
	@BeforeMethod
	
	public  void precondition() throws IOException {
		
		  Reporter.log("=====Started BrowserPage====", true);
		  
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 
	  Reporter.log("=====Click UrlPage====", true);
	  
	 driver.get("http://cimsapp.et.r.appspot.com/");
	
	
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	  Reporter.log("=====LoginPage====", true);
	  
	 driver.findElementByXPath("//input[@placeholder='Email address']").sendKeys("test@gmail.com");
	driver.findElementByXPath("//input[@placeholder='Password']").sendKeys("qubics");
	driver.findElementByXPath("//button[text()=' Sign In']").click();
	
	 
		File filescrc= driver.getScreenshotAs(OutputType.FILE);
		File desc=new File("./snaps/Loginpage.png");
		FileHandler.copy(filescrc, desc);
		
	
	  Reporter.log("=====LoginPage Completed====", true);
	  
	}

	@AfterMethod
	public  void postCondition() {
		  Reporter.log("=====Logout Scenario ====", true);
		   
		driver.close();
		  Reporter.log("=====Browser Session Completed====", true);
		  
		
		
	}
	
	
	

}


