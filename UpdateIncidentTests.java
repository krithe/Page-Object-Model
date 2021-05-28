package week6.assignnment.tests;

import org.testng.annotations.Test;
import week6.assignment.hooks.TestNgHooksServiceNow;
import week6.assignmentpages.IncidentLoginPage;
import week6.assignmentpages.UpdateIncident.UpdateIncidentLoginPage;

public class UpdateIncidentTests extends TestNgHooksServiceNow {

	@Test
	public void login() throws InterruptedException {
		new UpdateIncidentLoginPage()
		.typeUserName()
		.typePassword()
		.clickLogin()
		.searchIncidentInFilterNavigator()
		.ClickonOpen()
		.SearchExistingIncidentAndClick()
		.UpdateIncidentWithUrgencyAndState()
		.ClickUpdateTab()
		.VerifyIncidentUpdatedWithStateAndUrgency();
		
		
		
	}

}
