package week6.assignmentpages.caller;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import week6.assignment.hooks.TestNgHooksServiceNow;

public class UsersItilViewPage extends TestNgHooksServiceNow {

	public UsersItilViewPage VerifyCreatedNewCaller() {
		 WebElement FirstName = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']")); 
	       new Select(FirstName).selectByValue("first_name");
	       
	       driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Adithi",Keys.ENTER);
	       
	       String verificationName = driver.findElement(By.xpath("(//table[@id='sys_user_table']/tbody//td[@class='vt'])[2]")).getText();
			System.out.println(verificationName);
			if (verificationName.equalsIgnoreCase("Adithi")) {
				System.out.println("The caller is created successfully");
			}else {
				System.out.println("The caller is not created successfully");
			}
	       return this;
	}

	}


