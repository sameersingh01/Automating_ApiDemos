package POM;

import org.openqa.selenium.By;

import basepage.BaseFile;

public class ShowFeatureTest extends BaseFile {
	
	
	// Show Feature Elements
	public static By animation_click= By.id("Animation");
	public static By hideShow_tap= By.id("Hide-Show Animations");
	public static By thirdButton_tap= By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]\r\n"
			+ "");
	public static By showbutton_tap= By.id("Show Buttons");
	
	
	// Show feature methods
	public void clickAnimation() {
		driver.findElement(animation_click).click();
	}
	
	public void clickHideShowAnimation() {
		driver.findElement(hideShow_tap).click();
	}
	
	public void clickOnThirdButton() {
		driver.findElement(thirdButton_tap).click();
	}
	
	public void clickOnShow() {
		driver.findElement(showbutton_tap).click();
	}
		
}
