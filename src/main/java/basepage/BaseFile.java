package basepage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class BaseFile {
	public static AppiumDriver<MobileElement> driver=null;
//	public static AppiumDriverLocalService service;
	public static String loadPropertyFile="config.properties";
	public static final String ApppackageName="io.appium.android.apis";
	
	public static void waitforthescreentoopen() throws InterruptedException {
		Thread.sleep(3000);
	}

}
