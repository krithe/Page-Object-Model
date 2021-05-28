package week6.assignmentpages.UpdateIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import week6.assignment.hooks.TestNgHooksServiceNow;
import week6.assignmentpages.IncidentLoginPage;
import week6.assignmentpages.ServiceNowHome;
import week6.day2.pages.Home;


	public class UpdateIncidentLoginPage extends TestNgHooksServiceNow {


		public UpdateIncidentLoginPage typeUserName() {
			driver.switchTo().frame("gsft_main");
			driver.findElement(By.id("user_name")).sendKeys("admin");
			return this;
		}

		public UpdateIncidentLoginPage typePassword() {
			driver.findElement(By.id("user_password")).sendKeys("India@123");
			return this;
		}
		
		public Home typePasswordAndEnter() {
			driver.findElement(By.id("user_password")).sendKeys("India@123",Keys.ENTER);
			 Home home = new Home(); 
			 return home;
		}
		public ServiceNowUpdateIncident clickLogin() {
			driver.findElement(By.id("sysverb_login")).click();
			return new ServiceNowUpdateIncident();
				
	}
		public UpdateIncidentLoginPage clickLoginForFailure() {
			driver.findElement(By.id("sysverb_login")).click();
			return this;
		}
		}

