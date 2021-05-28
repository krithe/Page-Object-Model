package week6.assignmentpages.caller;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import week6.assignment.hooks.TestNgHooksServiceNow;

public class CreateCaller extends TestNgHooksServiceNow {

	public CreateCaller TypeCallerFilterNavigator() throws InterruptedException{
		driver.findElement(By.id("filter")).sendKeys("Callers",Keys.ENTER);
	       driver.findElement(By.xpath("//div[text()='Callers']")).click();
	       
	       driver.switchTo().frame(0);
	       Thread.sleep(3000);
	       
	       return this;
       	}
	public UserNewRecordPage ClickCallersUnderServiceDesk() {
		 driver.findElement(By.id("sysverb_new")).click();
		 return new UserNewRecordPage();
	}
	
}
	
	
	
	
	

