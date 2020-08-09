package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	
	WebDriver dr;
	
	public Homepage(WebDriver dr) {
		this.dr=dr;
	}

	By automobile=By.id("");
	By truck=By.id("");
	By motorcycle=By.id("");
	By camper=By.id("");
		
}
