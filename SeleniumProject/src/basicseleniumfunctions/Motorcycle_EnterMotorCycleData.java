package basicseleniumfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Motorcycle_EnterMotorCycleData {

	public static void main(String[] args) {
		
			//Set ChromeDriver Path
			System.setProperty("webdriver.chrome.driver","D:\\Java Programs\\Drivers\\chromedriver.exe");
			ChromeDriver dr=new ChromeDriver();
			dr.manage().window().maximize();
			dr.get("http://sampleapp.tricentis.com/");
			
			//Click and get text
			WebElement ele=dr.findElement(By.id("nav_motorcycle"));
			String data=ele.getText();
			System.out.println(data);
			ele.click();
			
			//Enter Text
			dr.findElement(By.id("cylindercapacity")).sendKeys("200");
			dr.findElement(By.id("engineperformance")).sendKeys("2000");
			//dr.findElement(By.id("List Price")).sendKeys("10000");
			dr.findElement(By.id("listprice")).sendKeys("150000");
			dr.findElement(By.id("annualmileage")).sendKeys("18");
						
						
			//dr.get		
			//dr.close();
			//dr.quit();
			System.out.println("Test Automation Script Passed");
		}

	}
