package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.BaseClass;
import Pages.SampleForms;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinations extends BaseClass {

	// cucumber hooks
	WebDriver driver;
	SampleForms objSampleForms;

	@Before
	public void beforescenario() {

		driver = initializeDriver("chrome");
		objSampleForms = new SampleForms(driver);

	}

	@Given("^Launch simpleformspage$")
	public void launch_simpleformspage() throws Throwable {
		objSampleForms.launchsimpleformpage();
	}

	@When("^Enter \"([^\"]*)\" and click show messagebutton$")
	public void enter_and_click_show_messagebutton(String TestData) throws Throwable {

		objSampleForms.entermessageandclickshowbutton(TestData);
	}

	@Then("^I validate the Message is same as \"([^\"]*)\"$")
	public void i_validate_the_Message_is_same_as(String pExpectedmessage) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String ActualMessage = objSampleForms.getOutputmessage();
		Assert.assertEquals(pExpectedmessage, ActualMessage);
	}

	@After
	public void afterscenario() {

		driver.close();

	}

}
