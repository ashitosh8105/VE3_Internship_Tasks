package com.crm.VE3Tasks;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.VE3BaseClass.VE3_Base;

@Listeners(com.crm.Listeners.Attach_Failed_Reprt.class)

public class Check_Out_Process extends VE3_Base {
	
	@Test
	public void purchace() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		  WebElement drop_Down = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		  
			Select sel=new Select(drop_Down);
			   
			sel.selectByValue("lohi");
			   
			  
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
	          
	           Actions act=new Actions(driver);
	      		Thread.sleep(1000);
	      		act.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).perform(); 
	      		act.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).perform();
	      		
	      		driver.findElement(By.linkText("CHECKOUT")).click();
	      		  
	      		driver.findElement(By.id("first-name")).sendKeys("Ashitosh");
	              
	      		driver.findElement(By.id("last-name")).sendKeys("Jagtap");
	      	     
        		driver.findElement(By.id("postal-code")).sendKeys("416211");
        		
        		driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
	      		
	      		driver.findElement(By.xpath("//input[@type='submit']")).click();

//		      		
	}

}
