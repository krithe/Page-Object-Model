package week6.assignmentpages.UpdateIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import week6.assignment.hooks.TestNgHooksServiceNow;

public class VerifyUpdatedIncident extends TestNgHooksServiceNow {

	public VerifyUpdatedIncident VerifyIncidentUpdatedWithStateAndUrgency() throws InterruptedException {

		Thread.sleep(2000);
		
		WebElement firstName = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']")); 
		Select dd1 = new Select(firstName);
		dd1.selectByIndex(3);
		//WebElement firstName = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']")); 
		//new Select(firstName).selectByValue("first_name"); 

		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Krithi's New Incident",Keys.ENTER);
		
		boolean moderate = driver.findElement(By.xpath("//td[contains(text(),'Moderate')]")).isDisplayed();
		boolean progress = driver.findElement(By.xpath("//td[contains(text(),'Progress')]")).isDisplayed();

		// verification
		if (moderate && progress) {
			System.out.println("The incident is updated successfully");
		} else {
			System.out.println("The incident is not updated successfully");
		}
		return this;
	}

}
