package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BasicUtilities {
	public static int IMPLICIT_WAIT_TIME;
	public static int EXPLICIT_WAIT_TIME;
	public static String BASE_PACKAGE;
	public static String APP_ACTIVITY;
	public static String APP_WAIT_ACTIVITY;
	public static String BROWSER_NAME;
	public static String PLATFORM_NAME;
	public static String PLATFORM_VERSION;
	public static String DEVICE_NAME;
	public static String APPIUM_PORT;
	public static String APP_PATH;
	public static String EXTENT_REPORT_CONFIG_PATH;
	public static URL serverURL;

	public static Properties prop = new Properties();
	private static DesiredCapabilities capabilities = new DesiredCapabilities();

	private static AppiumDriver<MobileElement> driver;

	public void loadAndroidConfProp(String propertyFileName) throws IOException {

		FileInputStream fis = new FileInputStream(
		System.getProperty("user.dir") + "/src/test/java/propertiesfile/" + propertyFileName);
		prop.load(fis);
		APP_PATH = prop.getProperty("application.path");
		APPIUM_PORT = prop.getProperty("appium.server.port");
		DEVICE_NAME = prop.getProperty("device.name");
		PLATFORM_VERSION = prop.getProperty("platform.version");
		PLATFORM_NAME = prop.getProperty("platform.name");
		APP_ACTIVITY = prop.getProperty("application.activity");
		APP_WAIT_ACTIVITY = prop.getProperty("application.WaitActivity");
		BASE_PACKAGE = prop.getProperty("base.package");
	}

	public void setAndroidCapabilities() {
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
		capabilities.setCapability(CapabilityType.PLATFORM_NAME, PLATFORM_NAME);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
		capabilities.setCapability(MobileCapabilityType.APP, APP_PATH);
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, BASE_PACKAGE);
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY);
		capabilities.setCapability("autoGrantPermissions", true);
		capabilities.setCapability("unicodeKeyboard", true);
		capabilities.setCapability("resetKeyBoard", true);
	}

	public AppiumDriver<MobileElement> getAppiumDriver() throws MalformedURLException    {
		serverURL = new URL("http://0.0.0.0:" + APPIUM_PORT + "/wd/hub");
		return driver = new AndroidDriver<>(serverURL, capabilities);
	}


}