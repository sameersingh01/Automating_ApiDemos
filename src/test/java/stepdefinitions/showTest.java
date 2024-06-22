package stepdefinitions;

import org.apache.log4j.Logger;

import Logfile.Log4j;
import POM.ShowFeatureTest;
import basepage.BaseFile;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class showTest extends BaseFile{
	
	public ShowFeatureTest sft;
	Logger log=Log4j.getLogger(Log4j.class);
	
	
	@Given("^User is in Api Demos and clicks on Animation button$")
	public void user_is_in_Api_Demos_and_clicks_on_Animation_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sft.clickAnimation();
		log.info("Clicked on Animation");
	    throw new PendingException();
	}

	@When("^User clicks on Hide-Show Animation button$")
	public void user_clicks_on_Hide_Show_Animation_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sft.clickHideShowAnimation();
		log.info("Clicked on Hide - Show Animation");
	    throw new PendingException();
	}

	@Then("^User lands on page and it clicks on the number to hide$")
	public void user_lands_on_page_and_it_clicks_on_the_number_to_hide() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sft.clickOnThirdButton();
		log.info("clicked on 2");
	    throw new PendingException();
	}

	@Then("^User clicks on show button and number appears again$")
	public void user_clicks_on_show_button_and_number_appears_again() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sft.clickOnShow();
		log.info("cliked on show and number appered again");
	    throw new PendingException();
	}

}
