package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Screenshot {
	public static String takeScreenShot(AppiumDriver<MobileElement> driver, String name) {

		String screenshotFileName = System.getProperty("user.dir") + "\\" + name + "TestFailed.jpg";
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			File destinationPath = new File(screenshotFileName);
			FileUtils.copyFile(scrFile, destinationPath);
			Reporter.addScreenCaptureFromPath(destinationPath.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return screenshotFileName;
	}

}