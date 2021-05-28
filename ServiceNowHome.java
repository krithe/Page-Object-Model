package week6.assignmentpages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import week6.assignment.hooks.TestNgHooksServiceNow;

public class ServiceNowHome extends TestNgHooksServiceNow{
	//searchIncidentInFilterNavigator

	public ServiceNowHome ClickIncident() {
		 driver.findElement(By.id("filter")).sendKeys("Incident",Keys.ENTER);
		return this;

}
	public ServiceNowHome ClickCreateNew() {
	driver.findElement(By.xpath("//div[text()='Create New']")).click();
   	   return this;
}
	 public ServiceNowHome GetIncidentNumber() {
		 driver.switchTo().frame("gsft_main");
	       String incidentNo  = driver.findElement(By.xpath("//input[@class='form-control']")).getAttribute("value");
			System.out.println(incidentNo);
			
			driver.findElement(By.xpath("//input[@id='incident.number']")).sendKeys(Keys.TAB);
			return this;
	   }
	 public ServiceNowHome SelectCallerValue() {
		 driver.findElement(By.xpath("//button[@id='lookup.incident.caller_id']/span")).click();
		   
		   Set<String> allWindowHandles = driver.getWindowHandles();
		   List<String> lstWindows = new ArrayList<String>(allWindowHandles);
		   
		   String secondWindowHandles = lstWindows.get(1);
	       driver.switchTo().window(secondWindowHandles);
	       
	       driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Guest",Keys.ENTER);
	       driver.findElement(By.linkText("Guest")).click();
	       
	       driver.switchTo().window(lstWindows.get(0));
	       driver.switchTo().frame("gsft_main");

	       
	       return this;
	   }
	      
	        public ServiceNowHome TypeShortDescription() throws InterruptedException {
	        	 	       
	 	   driver.findElement(By.id("incident.short_description")).sendKeys("krithi's new incident");
	        	Thread.sleep(2000);
				
				return this;
	        }
	   
	        public ViewCreatedIncidentPage ClickSubmitButton() {
	        	driver.findElement(By.id("sysverb_insert_bottom")).click();
	        	return new ViewCreatedIncidentPage();
	        }
	   
}