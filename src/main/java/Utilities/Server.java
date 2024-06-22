package Utilities;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Server {
	static AppiumDriverLocalService service;
	
	public static void startAppium() {
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
	}

	public static void stopAppium() {
		service.stop();
	}
}
