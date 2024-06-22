package stepdefinitions;

import org.apache.log4j.Logger;

import Logfile.Log4j;
import POM.StopAlarmServiceTest;
import basepage.BaseFile;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stopAlarmTest extends BaseFile{
	
	public StopAlarmServiceTest sast; 
	Logger log=Log4j.getLogger(Log4j.class);
	
	@Given("^User clicks on App$")
	public void user_clicks_on_App() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sast.app();
		log.info("Clicked App");
		
	    throw new PendingException();
	}

	@When("^User clicks on Alarm button$")
	public void user_clicks_on_Alarm_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sast.alarm();
		log.info("Clicked on Alarm button");
	    throw new PendingException();
	}

	@Then("^User clicks on Alarm Service button$")
	public void user_clicks_on_Alarm_Service_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sast.alarmservice();
		log.info("Clicked on Alarm Service Button");
	    throw new PendingException();
	}

	@Then("^User clicks on Star Alarm service button$")
	public void user_clicks_on_Star_Alarm_service_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sast.startalarmservice();
		log.info("Clicked on Start Alarm button");
	    throw new PendingException();
	}

	@Then("^User clicks on Stop Alarm service button$")
	public void user_clicks_on_Stop_Alarm_service_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sast.stopalarmservice();
		log.info("Clicked on Stop Alarm service button");
	    throw new PendingException();
	}


}
