package Locatr;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jvascrpt {
	
public static void main(String[] args)  throws Throwable{
		
		System.setProperty("Webdriver.edge.driver", "C:\\Ameer\\workspace\\Org.Locat\\target\\driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		
		 String url = "https://www.facebook.com/";
         driver.get(url);
         driver.navigate().to(url);
         
         WebElement element = driver.findElement(By.xpath("//input[@type=\"text\"]"));
         WebElement element1 = driver.findElement(By.id("pass"));
         WebElement element2 = driver.findElement(By.xpath("//button[@type='submit']"));
   
         JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeScript("arguments[0].setAttribute('value','selenium')", element);
         js.executeScript("arguments[1].setAttribute('value', '453564366')", element,element1,element2);
        js.executeScript("arguments[0].setAttribute('style', 'background:Yellow')", element,element1,element2);
//        js.executeScript("arguments[0].setAttribute('style', 'background:Yellow,Border 2px solid red')", element,element1,element2);

        
          
         js.executeScript("arguments[0].scrollIntoView(true)", element);

}
}