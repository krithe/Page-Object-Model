package week6.assignnment.tests;

import org.testng.annotations.Test;

import week6.assignment.hooks.TestNgHooksServiceNow;
import week6.assignmentpages.IncidentLoginPage;


public class CreateIncidentTests extends TestNgHooksServiceNow {

	@Test
	public void login() throws InterruptedException {
		new IncidentLoginPage()
		.typeUserName()
		.typePassword()
		.clickLogin()
		.ClickIncident()
		.ClickCreateNew()
		.GetIncidentNumber()
		.SelectCallerValue()
		.TypeShortDescription()
		.ClickSubmitButton()
		.VerifyCreatedIncidentNumber();
		


}
}