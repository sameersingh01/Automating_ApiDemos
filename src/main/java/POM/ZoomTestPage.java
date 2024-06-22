package POM;

import org.openqa.selenium.By;

import basepage.BaseFile;

public class ZoomTestPage extends BaseFile {
	
	// Zoom-In Feature Elements 
	
	//public static By app_tap= By.id("App");
	public static By app_tap= By.xpath("//android.widget.TextView[@content-desc=\"App\"]");
	public static By activity_tap= By.xpath("//android.widget.TextView[@content-desc='Activity']");
	public static By animation_tap= By.id("Animation");
	public static By zoomin_tap= By.id("Zoom in");
	
	
	
	// Zoom-In Feature methods
	public void click_on_App() {
		driver.findElement(app_tap).click();
	}
	
	public void click_on_Activity() {
		driver.findElement(activity_tap).click();
	}

	public void click_on_Animation() {
		driver.findElement(animation_tap).click();
	}
	
	public void click_on_zoomin() {
		driver.findElement(zoomin_tap).click();
	}
}
