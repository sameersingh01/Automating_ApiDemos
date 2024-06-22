package POM;

import org.openqa.selenium.By;

import basepage.BaseFile;

public class StartAlarmServiceTest extends BaseFile{

	
	// Start Alarm Elements
	public static By app= By.id("App");
	public static By alarm= By.id("Alarm");
	public static By alarmservice= By.id("	Alarm Service");
	public static By startalarmservice= By.id("Start Alarm Service");
	
	
	
	// Start Alarm methods
	public void clickApp() {
		driver.findElement(app).click();
	}
	
	public void clickalarm() {
		driver.findElement(alarm).click();
	}
	
	public void clickalarmservice() {
		driver.findElement(alarmservice).click();
	}
	
	public void clickstartalarm() {
		driver.findElement(startalarmservice).click();
	}
}
