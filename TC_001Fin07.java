package pc_03fin02A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pc_01base.BaseClass;

public class TC_001Fin07 extends BaseClass{
	@Test(invocationCount=1)
	public  void Fin07page() throws InterruptedException {
		
		
		driver.findElementByXPath("//span[text()='Invoice Management ']").click();
		Thread.sleep(5000);
		
		
		driver.findElementByXPath("//a[@href='/transaction/fin-02a-invoice/fin-02a-list-page']").click();
		
		  Reporter.log("=====Click CreatePage====", true);
		  
		  
		
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		
		
		
		WebElement state = driver.findElementById("state"); 
		new Select(state).selectByValue("1"); 
		WebElement district = driver.findElementById("district"); 
		new Select(district).selectByValue("2"); 
		driver.findElementByXPath("//button[text()='Go']").click();
		Thread.sleep(5000);
		
		
		  driver.executeScript("window.scrollBy(0,250)", "");
		  Thread.sleep(5000);
		  
		
		  WebElement radio =
		  driver.findElementByXPath("//input[contains(@id,'customRadio')]");
		   Actions builder = new Actions(driver);
		  builder.moveToElement(radio).doubleClick().perform();
		 
		 
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//button[text()=' New']")).click();
		  
		  driver.executeScript("window.scrollBy(0,450)", "");
		  Thread.sleep(5000);
		  
		  
		  driver.findElement(By.xpath("//button[text()='Create Fin07']")).click();
		  

		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//button[@type='button']")).click();
		  

		  driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		  
		Thread.sleep(5000);
		  
             Reporter.log("=====Click InprogressPage====", true);
		  

		  driver.findElement(By.xpath("(//a[@href='/transaction/fin-02a-invoice/fin-02a-list-page'])[2]")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			
			WebElement state1 = driver.findElementById("state"); 
			new Select(state1).selectByValue("1"); 
			WebElement district1 = driver.findElementById("district"); 
			new Select(district1).selectByValue("2"); 
			driver.findElementByXPath("//button[text()='Go']").click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//button[@type='button']")).click();
			 Thread.sleep(5000);
			 
			 driver.executeScript("window.scrollBy(0,250)", "");
			  Thread.sleep(5000);
			  
			driver.findElement(By.xpath("//button[text()='Approve']")).click();
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//button[@type='button']")).click();
			  Thread.sleep(5000);
			  
			  driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			  
			Thread.sleep(5000);
			
			WebElement state11 = driver.findElementById("state"); 
			new Select(state11).selectByValue("1"); 
			WebElement district11 = driver.findElementById("district"); 
			new Select(district11).selectByValue("2"); 
			
			driver.findElementByXPath("//button[text()='Go']").click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//button[@type='button']")).click();
			 Thread.sleep(5000);
			 
			 driver.executeScript("window.scrollBy(0,450)", "");
			  Thread.sleep(5000);
			  
			driver.findElement(By.xpath("//button[text()='Approve']")).click();
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//button[@type='button']")).click();
			  Thread.sleep(5000);
			  
			  driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			  
			Thread.sleep(5000);
			
			  Reporter.log("=====Click ApprovePage====", true);
			  
			
			driver.findElement(By.xpath("(//a[@href='/transaction/fin-02a-invoice/fin-02a-list-page'])[2]")).click();
			Thread.sleep(5000);
			
			
			driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
			
			WebElement state111 = driver.findElementById("state"); 
			new Select(state111).selectByValue("1"); 
			WebElement district111 = driver.findElementById("district"); 
			new Select(district111).selectByValue("2"); 
			
			driver.findElementByXPath("//button[text()='Go']").click();
			Thread.sleep(5000);
			driver.executeScript("window.scrollBy(0,250)", "");
			  Thread.sleep(5000);
			  
			
			driver.findElement(By.xpath("//button[@type='button']")).click();
			 Thread.sleep(5000);
			 
			 
			
			
			
			
			

		  
		  
		  
		  
		 
}
}






