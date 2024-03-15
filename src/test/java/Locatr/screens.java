package Locatr;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screens {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("Webdriver.edge.driver", "C:\\Ameer\\workspace\\Org.Locat\\target\\driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		
		 String url = "https://demo.guru99.com/test/drag_drop.html";
         driver.get(url);
         driver.navigate().to(url);
         
    WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
    WebElement element2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
     
    WebElement element3 = driver.findElement(By.xpath("//li[@id='fourth']"));
	WebElement element4 = driver.findElement(By.xpath("//ol[@id='amt7']"));

	WebElement element5 = driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
	WebElement element6 = driver.findElement(By.xpath("//ol[@id='loan']"));
	
	WebElement element7 = driver.findElement(By.xpath("//li[@id='fourth'][2]"));
	WebElement element8 = driver.findElement(By.xpath("//ol[@id='amt8']"));
    
       Actions as = new Actions(driver);
       as.dragAndDrop(element1, element2).perform();
       as.dragAndDrop(element3, element4).perform();
       as.dragAndDrop(element5, element6).perform();
       as.dragAndDrop(element7, element8).perform();
       
       TakesScreenshot ts = (TakesScreenshot)driver;
       File src = ts.getScreenshotAs(OutputType.FILE);
       File Desc = new File("C:\\Ameer\\workspace\\Org.Locat\\src\\test\\resources\\selenium.png");
       FileUtils.copyFile(src, Desc);
       
       

        

	
		
    }

}
