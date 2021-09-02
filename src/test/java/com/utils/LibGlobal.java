package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal {
	public static WebDriver driver;

	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\OnlineSel12PMAug\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void getUrl(String value) {
		driver.get(value);
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void quitBrowser() {
		driver.quit();
	}

	public static void insertType(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	public static void click(WebElement ele) {
		ele.click();
	}

	public static String getData(int row, int cell) throws IOException {
		// set the file loc
		File loc = new File("C:\\Users\\ADMIN\\eclipse-workspace\\OnlineAugFastTrack3PM\\Input\\TestData.xlsx");
		// Read the values from excel
		FileInputStream f = new FileInputStream(loc);
		// Set the Workbook
		Workbook w = new XSSFWorkbook(f);
		// SheetName
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		int cellType = c.getCellType();
		String value = null;
		// Celltype 1-->String,0-->Date or number
		if (cellType == 1) {
			value = c.getStringCellValue();
			System.out.println(value);
		} else if (cellType == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("mm/DD/YYYY");
				// convert date into String
				value = sim.format(dateCellValue);
				System.out.println(value);
			} else {
				double numericCellValue = c.getNumericCellValue();
				// type casting-->converting one data type into another data type
				long l = (long) numericCellValue;
				// convert long into String
				value = String.valueOf(l);
				System.out.println(value);
			}
		}
		return value;
	}
	
	public static boolean isDisplayed(WebElement ele) {
		boolean displayed = ele.isDisplayed();
		return displayed;
	}
}
