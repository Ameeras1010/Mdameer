package Locatr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("Webdriver.edge.driver", "C:\\Ameer\\workspace\\Org.Locat\\target\\driver\\msedgedriver.exe");
       
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		 String url = "https://www.facebook.com//";
         driver.get(url);
         driver.navigate().to(url);
         boolean displayed = driver.findElement(By.xpath("//input[@id=\"email\"]")).isDisplayed();
 		System.out.println(displayed);
 		boolean enabled = driver.findElement(By.xpath("//input[@name=\"pass\"]")).isEnabled();
 		System.out.println(enabled);
 		boolean selected = driver.findElement(By.xpath("//button[text()= 'Log in']")).isSelected();
 		System.out.println(selected);

         
         
      WebElement element = driver.findElement(By.id("email"));
         element.sendKeys("entername");

         WebElement element2 = driver .findElement(By.name("pass"));
       element2.sendKeys("123456567");

////         WebElement element3 = driver.findElement(By.linkText("Forgotten password?"));
////         element3.click();
//         
//         WebElement element3 = driver.findElement(By.partialLinkText("Forgotten"));
//         element3.click();
         
//         List<WebElement> link = driver.findElements(By.tagName("a"));
//          for(int i=0; i<link.size(); i++) {
//        	 WebElement linktext =  link.get(i);
//        	 String text = linktext.getText();
//        	 System.out.println("text");
//          }
//           driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("entername");
//	        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123456567");
//	        WebElement element = driver.findElement(By.xpath("//button[text()= 'Log in']"));
//	        element.click();
       
       
	        
	}

}
