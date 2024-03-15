package Locatr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tabe {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		String url= ("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.get(url);
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		List<WebElement> table = driver.findElements(By.tagName("table"));
		for(int i=0;i<table.size();i++) {
			WebElement ttable = table.get(i);
			WebElement tbody = ttable.findElement(By.tagName("tbody"));
			
			List<WebElement> trows = tbody.findElements(By.tagName("tr"));
			for(int j=0;j<trows.size();j++) {
				WebElement rows = trows.get(j);
				
//      			String text = rows.getText();
				List<WebElement> tdata = rows.findElements(By.tagName("td"));
				
				
			for(int k=0;k<tdata.size();k++) {
					WebElement td = tdata.get(k);
//					String text =td.getText();
//					if(text.equals("Saudi Arabia")) {
					System.out.println(td.getText());
//					System.out.println(j);
//				    System.out.println(k);
//					}
					
				}

		}
				
			}


	}
}




