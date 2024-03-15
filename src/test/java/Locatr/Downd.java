package Locatr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Downd {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		
		 String url = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
		 driver.get(url);
         driver.navigate().to(url);
         driver.manage().window().maximize();

//        	 
//             }
         WebElement drop = driver.findElement(By.xpath("//Select [@class=\"col-lg-3\"]"));
         Select s = new Select(drop);
         s.selectByIndex(3);
         Thread.sleep(2000);
         s.selectByValue("Google");
         Thread.sleep(2000);
         s.selectByVisibleText("Bing");
         Thread.sleep(2000);
         
         List<WebElement> options =s.getOptions();
         for(int i=0; i<options.size(); i++) {
        	 WebElement actual = options.get(i);
        	 String text = actual.getText();
        	 System.out.println(text);
         }
//        	 List<WebElement> options =s.getOptions();
//             for(int  i=options.size()-1; i>=0; i--) {
//            	 WebElement actual = options.get(i);
//            	 String text = actual.getText();
//            	 System.out.println(text);
         
       WebElement drop1 = driver.findElement(By.xpath("//Select[@id=\"second\"]"));
         Select s1 = new Select(drop1);
         s1.selectByIndex(0);
         s1.selectByIndex(1);
         s1.selectByIndex(2);
         s1.selectByIndex(3);
//         s1.deselectAll();
         
         List<WebElement> allvalues = s1.getAllSelectedOptions();
         for (int i=0; i<allvalues.size();i++) {
        	 WebElement actual1 = allvalues.get(i);
        	 String text1= actual1.getText();
        	 System.out.println(text1);

         }

	}
         
	}



