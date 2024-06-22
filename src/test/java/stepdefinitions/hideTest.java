package stepdefinitions;

import org.apache.log4j.Logger;

import Logfile.Log4j;
import POM.HideFeatureTest;
import basepage.BaseFile;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class hideTest extends BaseFile{
	
	public HideFeatureTest hft;
	Logger log=Log4j.getLogger(Log4j.class);
	
	@Given("^User is in Interface and clicks on Animation button$")
	public void user_is_in_Interface_and_clicks_on_Animation_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hft.clickOnAnimation();
		log.info("Cliked Animation");
	   
	}

	@When("^User again clicks on Hide-Show Animation button$")
	public void user_again_clicks_on_Hide_Show_Animation_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hft.clickOnHideShow();
		log.info("Clicked on Hide-Show Animation");
	    
	}

	@Then("^User lands on Animation page and it clicks on to hide$")
	public void user_lands_on_Animation_page_and_it_clicks_on_to_hide() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hft.clickOnNumber();
		log.info("Clicked on 3");
	    
	}


}
