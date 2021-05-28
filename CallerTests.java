package week6.assignnment.tests;

import org.testng.annotations.Test;

import week6.assignment.hooks.TestNgHooksServiceNow;

import week6.assignmentpages.caller.NewCallerLoginPage;

public class CallerTests extends TestNgHooksServiceNow {

	@Test
	public void CreateCaller() throws InterruptedException {
		 new NewCallerLoginPage()
      .typeUserName()
      .typePassword()
      .clickLogin()
      .TypeCallerFilterNavigator()
      .ClickCallersUnderServiceDesk()
      .TypeFirstNameInMandatoryField()
      .TypeLastNameInMandatoryField()
      .TypeEmailInMandatoryField()
      .TypePhoneNUmberInMandatoryField()
      .TypeMobilePhoneNUmberInMandatoryField()
      .ClickSubmitTab()
      .VerifyCreatedNewCaller();
      
	}

}
