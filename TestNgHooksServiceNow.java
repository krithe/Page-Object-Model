package week6.assignment.hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgHooksServiceNow {
	
	public static ChromeDriver driver;
	
	@BeforeMethod
	public void init() {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://dev103117.service-now.com/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
    @AfterMethod
       public void tearDown() {
	   driver.close();
}
	

}
