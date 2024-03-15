package Locatr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		
		String url = ("https://www.facebook.com/");
		driver.get(url);
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.id("mail")).sendKeys("ameer");
		
		WebDriverWait text = new WebDriverWait (driver,Duration.ofSeconds(20));
		WebElement until = text.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
        until.sendKeys("ameer");
	}

}
