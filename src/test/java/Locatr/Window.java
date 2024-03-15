package Locatr;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {
	
public static void main(String[] args)  throws Throwable{
		
		System.setProperty("Webdriver.edge.driver", "C:\\Ameer\\workspace\\Org.Locat\\target\\driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();

		
		 String url = "https://www.flipkart.com/";
         driver.get(url);
         driver.navigate().to(url);
         driver.manage().window().maximize();
         
         
         driver.findElement(By.name("q")).sendKeys("Vivo Mobiles",Keys.ENTER);
         driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
         driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
         driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
        
         
         String currentWindow = driver.getWindowHandle();
         Set<String> allWindow = driver.getWindowHandles();
         
         for(String all: allWindow) {
        	 if(!currentWindow.equals(all)) {
        		 driver.switchTo().window(all);
        		 String text = driver.findElement(By.xpath("//span [class='_2FVHGh'>plus]")).getText();
        		 System.out.println(text);
        		 
        	 }
         }
         
      

}
}