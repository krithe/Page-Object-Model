package week6.assignmentpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import week6.assignment.hooks.TestNgHooksServiceNow;

public class ViewCreatedIncidentPage extends TestNgHooksServiceNow{

	public ViewCreatedIncidentPage VerifyCreatedIncidentNumber() {

		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("INC0011450",Keys.ENTER);
		
		boolean displayed = driver.findElement(By.xpath("//a[@class='linked formlink']")).isDisplayed();
		if (displayed) {
			System.out.println("The incident is created successfully");
		} else {
			System.out.println("The incident is not created successfully");
		}
		return this;
	}

}
