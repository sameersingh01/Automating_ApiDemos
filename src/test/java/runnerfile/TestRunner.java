
package runnerfile;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import Utilities.ExtentManager;
//import utilities.ExtentManager;
//
import Utilities.Server;

@CucumberOptions(tags = { "@zoom,@hide,@show,@startAlarm,@stopAlarm" }, features = "src/test/java/featurefiles", glue = { "stepdefinitions" }, format = {
		"pretty", "html:target/cucumber-reports/cucumber-pretty",
		"json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/rerun.txt" }, plugin = "json:target/cucumber-reports/CucumberTestReport.json")


@Test
public class TestRunner extends AbstractTestNGCucumberTests {

	public static ExtentReports extent;
	  public static ExtentTest test;

	@BeforeSuite
	public static void setup() {
		Server.startAppium();
		extent=ExtentManager.getInstance("reports/ExtentReports.html");

	}

	@BeforeMethod
    public void startTest(Method method) {
        test = extent.startTest(method.getName());
    }

    @AfterMethod
    public void reportFlush(ITestResult result) {

        System.out.println(result.getMethod().getMethodName());
        if (result.getStatus() == ITestResult.FAILURE)
            test.log(LogStatus.FAIL, result.getThrowable());
        else if (result.getStatus() == ITestResult.SKIP)
            test.log(LogStatus.SKIP, result.getThrowable());
        else
            test.log(LogStatus.PASS, "Test Passed");
        extent.flush();
    }


	@AfterSuite
	public void stop() {
		Server.stopAppium();
	}

}