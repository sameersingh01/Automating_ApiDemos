package stepdefinitions;

import org.apache.log4j.Logger;

import Logfile.Log4j;
import POM.ZoomTestPage;
import basepage.BaseFile;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class zoomIn_Test extends BaseFile{
 
	public ZoomTestPage ztp;
	Logger log=Log4j.getLogger(Log4j.class);
//	ZoomTestPage ztp = new ZoomTestPage();
	
	@Given("^I am in the interface and clicking on App$")
	public void i_am_in_the_interface_and_clicking_on_App() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ztp.click_on_App();
		log.info("Clicks on App");
		
	   
	}

	@When("^I click on Activity$")
	public void i_click_on_Activity() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ztp.click_on_Activity();
		log.info("Clicked on Activity");
	    
	}

	@Then("^I click on Animation$")
	public void i_click_on_Animation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ztp.click_on_Animation();
		log.info("Clicked on Animation Button");
	    
	}

	@Then("^i Click on Zoom In$")
	public void i_Click_on_Zoom_In() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ztp.click_on_zoomin();
		log.info("Clicked on ZoomIn");
	   
	}
}
