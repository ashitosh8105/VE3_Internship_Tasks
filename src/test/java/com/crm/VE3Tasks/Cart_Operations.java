package com.crm.VE3Tasks;

import java.time.Duration;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.VE3BaseClass.VE3_Base;
@Listeners(com.crm.Listeners.Attach_Report_Cart_Operation.class)

public class Cart_Operations extends VE3_Base
{
	
  @Test
  public void Add_Product() throws InterruptedException 
  {
	          
	    WebElement drop_Down = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		  
		Select sel=new Select(drop_Down);
		   
		sel.selectByValue("lohi");
		   
		Thread.sleep(4000);
		    
		Thread.sleep(4000);
		  
		List<WebElement>cart=driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']"));
          
		for (WebElement ele : cart){
			
			ele.click();
			Thread.sleep(2000);
		
		}
        
		driver.findElement(By.xpath("//div[@id='header_container']/..//following-sibling::div//a")).click();
		  
		  String pageText = driver.getPageSource();
          if (pageText.contains("Sauce Labs Onesie")) 
          {
              System.out.println("Product added successfully to cart.");
              
          } else 
          {
        	  
              System.out.println("Product not found in cart.");
          }
  }
}
