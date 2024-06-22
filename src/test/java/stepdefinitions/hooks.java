package stepdefinitions;

import java.io.IOException;

import Utilities.BasicUtilities;
import Utilities.Screenshot;
import basepage.BaseFile;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends BaseFile{
	public Scenario scenario;

	@Before
	public void launchAndInstallApps(Scenario scenario) throws IOException {
		BasicUtilities obj = new BasicUtilities();

		obj.loadAndroidConfProp(loadPropertyFile);
		obj.setAndroidCapabilities();
		driver = obj.getAppiumDriver();
		this.scenario = scenario;
		System.out.println("Executing the scenario" + scenario.getName());
	}

	@After
	public void afterScenario(Scenario scenario) {
		if(scenario.isFailed()) {
			String screenshotname = scenario.getName().replaceAll(" ", "_");
			Screenshot.takeScreenShot(driver, screenshotname);
		}
		driver.removeApp(ApppackageName);
		driver.quit();
	}

}
