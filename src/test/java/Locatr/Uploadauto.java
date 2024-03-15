package Locatr;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uploadauto {
	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.edge.driver", "C:\\Ameer\\workspace\\Org.Locat\\target\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		WebDriverManager.edgedriver().setup();
		
		String url ="https://www.flipkart.com/";
		driver.get(url);
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
        driver.findElement(By.name("q")).sendKeys("Redmi Mobiles",Keys.ENTER);
        
//        List<WebElement> name = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
//        
//        
//		for (int i = 0; i < name.size(); i++) {
//			WebElement webElement = name.get(i);
//			String names = webElement.getText();
//			System.out.println(names);
//			
//		}
//		
//		List<WebElement> price = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
//		for (int j = 0; j < price.size(); j++) {
//			WebElement webElement1 = price.get(j);
//			String names = webElement1.getText();
//			System.out.println(names);        
//        
//		}
//		
//		List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
//		List<WebElement> elements2 = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
//		for (int i = 0; i < elements.size(); i++) {
//			WebElement webElement = elements.get(i);
//			WebElement webElement1 = elements2.get(i);
//			String text1 = webElement1.getText();
//			String text = webElement.getText();
////			System.out.println(text+ "=" +text1); 
//		
//		HashMap<String,String> Map = new HashMap<String, String>();
//		Map.put(text1, text);
//		for (Map.Entry<String, String> entry : Map.entrySet()) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(value+ "=" +key);  
//        }
		
	
	
		
		}
	}
