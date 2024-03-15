package Locatr;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdrag {
         public static void main(String[] args) throws Throwable {
		
		System.setProperty("Webdriver.edge.driver", "C:\\Ameer\\workspace\\Org.Locat\\target\\driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		
		WebDriverManager.edgedriver().setup();
        
		 String url = "https://www.facebook.com/";
          driver.get(url);
          driver.navigate().to(url);
		
////		WebElement element  = driver.findElement(By.xpath("//*[text()='EN']"));
//	     
////		WebElement element = driver.findElement(By.id("email"));
////        element.sendKeys("entername");
//
////		
////          Actions as = new Actions(driver);
////          as.sendKeys(element, "Entername");
////          as.doubleClick(element).build().perform();
////          as.contextClick().perform();
////          
////          Robot jk = new Robot();
////          
////  		for(int i = 0; i<3; i++){
////  		jk.keyPress(KeyEvent.VK_DOWN);
////  		jk.keyRelease(KeyEvent.VK_DOWN);
////  		}
////  		jk.keyPress(KeyEvent.VK_ENTER);
////  		jk.keyRelease(KeyEvent.VK_ENTER);
////  		
////  		jk.keyPress(KeyEvent.VK_TAB);
////  		jk.keyRelease(KeyEvent.VK_TAB);
////  		
////  		jk.keyPress(KeyEvent.VK_CONTROL);
////  		jk.keyPress(KeyEvent.VK_V);
////  		
////  		jk.keyRelease(KeyEvent.VK_CONTROL);
////  		jk.keyRelease(KeyEvent.VK_V);
//  		
          
          
          
  
		
	}
	
		

			
	}

