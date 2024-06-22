package POM;

import org.openqa.selenium.By;

import basepage.BaseFile;

public class HideFeatureTest extends BaseFile  {

	
	// Hide Feature elements
	public static By ani_tap= By.id("Animation");
	public static By hide_show_tap= By.id("Hide-Show Animations");
	public static By forthButton_tap= By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[4]\r\n"
			+ "");
	
	// Hide features Methods
	public void clickOnAnimation() {
		driver.findElement(ani_tap).click();
	}
	
	public void clickOnHideShow() {
		 driver.findElement(hide_show_tap).click();
	 }
	
	public void clickOnNumber() {
		driver.findElement(forthButton_tap).click();
	}
	
	

}
