package stepdefinitions;

import org.apache.log4j.Logger;

import Logfile.Log4j;
import POM.StartAlarmServiceTest;
import basepage.BaseFile;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class startAlarmTest extends BaseFile {
	
	public StartAlarmServiceTest sast;
	Logger log=Log4j.getLogger(Log4j.class);
	@Given("^User is in ApiDemos and clicks on App$")
	public void user_is_in_ApiDemos_and_clicks_on_App() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sast.clickApp();
		log.info("Clicked on App");
	    throw new PendingException();
	}

	@When("^User clicks on Alarm$")
	public void user_clicks_on_Alarm() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sast.clickalarm();
		log.info("Clicked on Alarm");
	    throw new PendingException();
	}

	@Then("^User clicks on Alarm Service$")
	public void user_clicks_on_Alarm_Service() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sast.clickalarmservice();
		log.info("Clicked on Alarm service");
	    throw new PendingException();
	}

	@Then("^User clicks on Star Alarm service$")
	public void user_clicks_on_Star_Alarm_service() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sast.clickstartalarm();
		log.info("Clicked on Start Alarm Service");
	    throw new PendingException();
	}


}
