package Locatr;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Taskex {
	
	public static void main(String[] args) throws Exception {
        WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
        String URL = "https://www.flipkart.com/";
        driver.navigate().to(URL);
        driver.manage().window().maximize();

     
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Redmi Mobiles", Keys.ENTER);

        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
        List<WebElement> elements2 = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
                

       
        Map<String, String> phoneDetails = new HashMap<>();

       
        for (int i = 0; i < elements.size(); i++) {
            WebElement webElement = elements.get(i);
            WebElement webElement1 = elements2.get(i);
            String text1 = webElement1.getText();
            String text = webElement.getText();
            phoneDetails.put(text, text1);
        }

        
        writeToExcel(phoneDetails);
       
    }

    public static void writeToExcel(Map<String, String> phoneDetails) throws Exception {
    	
        File file = new File( "C:\\Ameer\\workspace\\Org.Locat\\target\\driver\\Task.xlsx");
               
        FileOutputStream outputStream = new FileOutputStream(file);
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Phone Collection");

        int rowNum = 0;
        for (Map.Entry<String, String> entry : phoneDetails.entrySet()) {
            HSSFRow row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(entry.getKey());
            row.createCell(1).setCellValue(entry.getValue());
        }

        workbook.write(outputStream);
        workbook.close();
    }
}


