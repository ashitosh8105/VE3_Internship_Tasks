package com.crm.VE3BaseClass;

import java.io.IOException;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.crm.FileUtility.ReadFromProperties;

public class VE3_Base 
{
	public static WebDriver driver;
	@BeforeClass
	public  void preCondition() throws IOException {
		String browser =ReadFromProperties.getData("browser");
		String url = ReadFromProperties.getData("url");
		if(browser.equalsIgnoreCase("chrome")) 
		{
		 	driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else 
		{
			driver=new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
	}
	@BeforeMethod
	public  void login() throws InterruptedException, IOException {
		String username = ReadFromProperties.getData("username");
		String password = ReadFromProperties.getData("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username );
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	@AfterClass
	public  void postCondition() {
		
		driver.quit();
	}

}
