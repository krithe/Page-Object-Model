package week6.assignmentpages.caller;

import org.openqa.selenium.By;

import week6.assignment.hooks.TestNgHooksServiceNow;

public class UserNewRecordPage extends TestNgHooksServiceNow {

	public UserNewRecordPage TypeFirstNameInMandatoryField() {
		driver.findElement(By.id("sys_user.first_name")).sendKeys("Adithi");
		 return this;
	}
	
	public UserNewRecordPage TypeLastNameInMandatoryField() {
		driver.findElement(By.id("sys_user.last_name")).sendKeys("Bala");
		return this;
	}
    
	public UserNewRecordPage TypeEmailInMandatoryField() {
		driver.findElement(By.id("sys_user.email")).sendKeys("abc@gmail.com");
		return this;
	}
	
	public UserNewRecordPage TypePhoneNUmberInMandatoryField() {
		 driver.findElement(By.id("sys_user.phone")).sendKeys("9123546854");
		 return this;
	}
    public UserNewRecordPage TypeMobilePhoneNUmberInMandatoryField() {
    	driver.findElement(By.id("sys_user.mobile_phone")).sendKeys("9225468596");
         return this;
    }
    
    public UsersItilViewPage ClickSubmitTab() {
    	driver.findElement(By.id("sysverb_insert_bottom")).click();
    	return new UsersItilViewPage();
    }
}