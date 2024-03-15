package Locatr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	
public static void main(String[] args)  throws Throwable{
		
		System.setProperty("Webdriver.edge.driver", "C:\\Ameer\\workspace\\Org.Locat\\target\\driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();

		
		 String url = "https://chercher.tech/practice/frames-example-selenium-webdriver";
         driver.get(url);
         driver.navigate().to(url);
         driver.switchTo().frame("frame1");
         driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("entername");
         driver.switchTo().frame("frame3");
        driver.findElement(By.xpath("//input[@id='a']")).click();
         driver.switchTo().parentFrame();
         String text = driver.findElement(By.xpath("//b[@id='topic']")).getText();
         System.out.println(text);
         
         driver.switchTo().defaultContent();
         String text1 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
         System.out.println(text1);
         
         

}
}