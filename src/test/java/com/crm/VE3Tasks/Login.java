package com.crm.VE3Tasks;
import static org.testng.Assert.assertEquals;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.crm.Listeners.AttachExtentReport_Login.class)
public class Login
{
		
		@DataProvider(name="login")
		public Object[][] sender() throws EncryptedDocumentException, IOException{
			
			Reporter.log("iam an Login dataProvider",true);
			FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\VE3_Login_Data.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("Login"); 
			int row = sheet.getPhysicalNumberOfRows();
			int colom = sheet.getRow(0).getPhysicalNumberOfCells();
			Object[][]obj=new Object[row][colom];
			for (int i = 0; i <row; i++) {
				for (int j = 0; j <colom; j++) 
				{
					
				  obj[i][j]=sheet.getRow(i).getCell(j).toString();
					
				}
			}
		
			return obj;
		}
		         
			@Test(dataProvider = "login")
			public void reciever(String username,String password) throws InterruptedException {
				String expected_url="https://www.saucedemo.com/v1/";
				
				Reporter.log("i am an reciever for Login",true);
				WebDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				driver.get("https://www.saucedemo.com/v1/");
				String actual_url=driver.getCurrentUrl();
				assertEquals(expected_url,actual_url,"Home Page is not displayed");
				Reporter.log("home page is displayed",true);
				Thread.sleep(2000);
				
			    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='login-button']")).click();
				Thread.sleep(2000);
				driver.quit();
				Thread.sleep(5000);
			  }
				
				
			}
	



