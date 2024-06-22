package POM;

import org.openqa.selenium.By;

import basepage.BaseFile;

public class StopAlarmServiceTest extends BaseFile{
	
	// Stop Alarm Elements
	
	public static By tap_app= By.id("App");
	public static By tap_alarm= By.id("Alarm");
	public static By tap_alarmservice= By.id("	Alarm Service");
	public static By tap_startalarmservice= By.id("Start Alarm Service");
	public static By tap_stopalarmservice= By.id("Stop Alarm Service");
	
	
	// Stop Alarm methods
	public void app() {
		driver.findElement(tap_app).click();
	}
	public void alarm() {
		driver.findElement(tap_alarm).click();
	}
	public void alarmservice() {
		driver.findElement(tap_alarmservice).click();
	}
	public void startalarmservice() {
		driver.findElement(tap_startalarmservice).click();
	}
	public void stopalarmservice() {
		driver.findElement(tap_stopalarmservice).click();
	}
	
	
}
