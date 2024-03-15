package Locatr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKartTask {
	
	public static void main(String[] args) throws Exception {
		 WebDriverManager.edgedriver().setup();
	        WebDriver driver = new EdgeDriver();
	        String URL = "https://www.flipkart.com/";
	        driver.navigate().to(URL);
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Redmi  Mobiles", Keys.ENTER);
	        
	        List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
	        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	        
	        int TotalPrice=0;
	        
	        
	        for (int i = 0; i < elements.size(); i++) {
	            String priceText = prices.get(i).getText().replaceAll("[^0-9]", ""); 
	            int price = Integer.parseInt(priceText); 
	            TotalPrice += price; 
	            System.out.println("Price of " + elements.get(i).getText() + " " + price);
	        }

	        System.out.println("Total Price of Redmi mobiles = " + TotalPrice);
	    
	        

	}

}