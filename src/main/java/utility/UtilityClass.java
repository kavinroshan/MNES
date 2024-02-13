package utility;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityClass {

	public WebDriver driver;
	public String excelfile;
	
	public void launchBrowser(String browser, String url) {
		
		if(browser.equalsIgnoreCase("chrome")) {            //browserOptions
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
	
	driver.manage().window().maximize();        //maximizingWindow
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	
	public void close() {        //closeMethod
		driver.close();
	}
	
	
	public static String[][] readExcel(String excelfile) throws IOException{        
	
		XSSFWorkbook book = new XSSFWorkbook("./data/" +excelfile+ ".xlsx");      //open work book
		XSSFSheet sheet = book.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		short columnCount = sheet.getRow(0).getLastCellNum();
		
		DataFormatter formatter = new DataFormatter();
		String [][] data= new String[rowcount][columnCount]; 
		for (int i = 1; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i-1][j]=(cell==null) ? "" : formatter.formatCellValue(cell);    
			}
		}
		book.close();
		return data;
	}
	
	
	public void click(WebElement element) {         //click method                             //click method
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(16));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	
	
	public void sendKeys(WebElement ele, String value) {        //send keys method
		
		ele.sendKeys(value);
	}

	
	
	
}