package com.crm.VE3Tasks;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.VE3BaseClass.VE3_Base;
@Listeners(com.crm.Listeners.Attach_Report_Product_Filter.class)
public class Product_Filtering extends VE3_Base
 {
	@Test
	public void sort() throws InterruptedException {
		try 
		{
		 WebElement dropd_Down = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		
		Select sel=new Select( dropd_Down);
		sel.selectByValue("lohi");
		Thread.sleep(2000);
		System.out.println("Names o Product");
		
		List<WebElement> productNames = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
	    System.out.println("Products sorted by Price (Low to High)");
	    for (WebElement product:productNames) 
	    {           System.out.println("- " + product.getText());
        }
		}
	    catch (Exception e) 		{
           e.printStackTrace();
       }
		
	
	}
	
	
	
}
