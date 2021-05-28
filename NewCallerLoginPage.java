package week6.assignmentpages.caller;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import week6.assignment.hooks.TestNgHooksServiceNow;
import week6.assignmentpages.IncidentLoginPage;
import week6.assignmentpages.ServiceNowHome;
import week6.assignmentpages.caller.LoginForCaller.NewCallerLoginPage;
import week6.day2.pages.Home;


	public class NewCallerLoginPage extends TestNgHooksServiceNow {


		public NewCallerLoginPage typeUserName() {
			driver.switchTo().frame("gsft_main");
			driver.findElement(By.id("user_name")).sendKeys("admin");
			return this;
		}

		public NewCallerLoginPage typePassword() {
			driver.findElement(By.id("user_password")).sendKeys("India@123");
			return this;
		}
		
		public Home typePasswordAndEnter() {
			driver.findElement(By.id("user_password")).sendKeys("India@123",Keys.ENTER);
			 Home home = new Home(); 
			 return home;
		}
		public CreateCaller clickLogin() {
			driver.findElement(By.id("sysverb_login")).click();
			return new CreateCaller();
				
	}
		public NewCallerLoginPage clickLoginForFailure() {
			driver.findElement(By.id("sysverb_login")).click();
			return this;
		}
		}

