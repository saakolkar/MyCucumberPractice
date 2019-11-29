package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleForms {

	WebDriver driver;
	// PAge Factory

	@FindBy(linkText = "Input Forms")
	WebElement InputFormoption;

	@FindBy(linkText = "Simple Form Demo")
	WebElement SimformDemoOption;

	@FindBy(xpath = "//input[@id='user-message']")
	WebElement usermessagetesxtboxfield;

	@FindBy(xpath = "//button[text()='Show Message']")
	WebElement showmessagebutton;

	@FindBy(xpath = "//label[text()='Your Message: ']/following-sibling::span[1]")
	WebElement outputmessagetext;

	public SampleForms(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Operations
	public void launchsimpleformpage() {

		InputFormoption.click();

		SimformDemoOption.click();
	}

	public void entermessageandclickshowbutton(String pMessage) {
		usermessagetesxtboxfield.sendKeys(pMessage);
		showmessagebutton.click();
	}

	public String getOutputmessage() {

		return outputmessagetext.getText();

	}
}
