package basicseleniumfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {

	public static void main(String[] args) {
		
		//Set ChromeDriver Path
		System.setProperty("webdriver.chrome.driver","D:\\Java Programs\\Drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/");
		
		//Click and get text
		WebElement ele=dr.findElement(By.id("nav_automobile"));
		String data=ele.getText();
		System.out.println(data);
		//ele.click();
		
		//Enter Text
		dr.findElement(By.id("search_form")).sendKeys("Auto");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		
		
		//dr.get		
		//dr.close();
		//dr.quit();
		System.out.println("Test Automation Script Passed");
	}

}
