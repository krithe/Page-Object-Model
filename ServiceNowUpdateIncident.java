package week6.assignmentpages.UpdateIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import week6.assignment.hooks.TestNgHooksServiceNow;

public class ServiceNowUpdateIncident extends TestNgHooksServiceNow{

	public ServiceNowUpdateIncident searchIncidentInFilterNavigator() {
		 driver.findElement(By.id("filter")).sendKeys("Incident",Keys.ENTER);
		return this;
	}
	
	public ServiceNowUpdateIncident ClickonOpen() {
		driver.findElement(By.xpath("//div[text()='Open']")).click();
		return this;
	}
	
    public ServiceNowUpdateIncident SearchExistingIncidentAndClick() throws InterruptedException {
    	driver.switchTo().frame("gsft_main");
	       Thread.sleep(3000);
	       
	      String incidentnum = driver.findElement(By.xpath("//input[@class='form-control']")).getText();
	       System.out.println(incidentnum);
	       driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
	       return this;
    }
    
    public ServiceNowUpdateIncident UpdateIncidentWithUrgencyAndState() {
    	WebElement incidentstate = driver.findElement(By.id("incident.state")); 
	       new Select(incidentstate).selectByValue("2"); 
	       
	      	       
	       WebElement incidenturgency = driver.findElement(By.id("incident.urgency")); 
	       new Select(incidenturgency).selectByValue("1"); 
	       return this;
    }  
	     public VerifyUpdatedIncident ClickUpdateTab() { 
	     driver.findElement(By.id("sysverb_update_bottom")).click();
	     return new VerifyUpdatedIncident();
    }

		}
    
    
    
    
    
    
    
    
    
    

