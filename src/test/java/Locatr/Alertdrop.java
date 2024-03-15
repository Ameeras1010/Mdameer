package Locatr;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertdrop {
	
public static void main(String[] args)  throws Throwable{
		
		System.setProperty("Webdriver.edge.driver", "C:\\Ameer\\workspace\\Org.Locat\\target\\driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();

		
		 String url = "https://demo.automationtesting.in/Alerts.html";
         driver.get(url);
         driver.navigate().to(url);
         
         driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
         Alert a = driver.switchTo().alert();
         a.accept();
       
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[2]")).click();
         driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
         String text =a.getText();
         System.out.println(text);
        a.accept();
         
         driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
         driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
//         String text1 =a.getText();
//         System.out.println(text1);
         a.accept();
        
        
        
  
         
          
         
         

}
}