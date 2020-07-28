package basicseleniumfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Truck_EnterTruckData {

	public static void main(String[] args) throws InterruptedException {
		//Set ChromeDriver Path
		System.setProperty("webdriver.chrome.driver","D:\\Java Programs\\Drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/");
		
		//Click and get text
		WebElement ele=dr.findElement(By.id("nav_truck"));
		String data=ele.getText();
		System.out.println(data);
		ele.click();
		
		WebElement makeDropDown=dr.findElement(By.name("Make"));
		Select sel=new Select(makeDropDown);
		sel.selectByIndex(4);
		Thread.sleep(3000);
		sel.selectByValue("Ford");
		Thread.sleep(3000);
		sel.selectByVisibleText("Mercedes Benz");
		
		
		//Enter Text
		dr.findElement(By.id("engineperformance")).sendKeys("2000");
		dr.findElement(By.id("payload")).sendKeys("1000");
		dr.findElement(By.id("totalweight")).sendKeys("10000");
		dr.findElement(By.id("listprice")).sendKeys("100000");
		dr.findElement(By.id("licenseplatenumber")).sendKeys("AWS123WER");
		dr.findElement(By.id("annualmileage")).sendKeys("200");
			
					
		//dr.get		
		//dr.close();
		//dr.quit();
		System.out.println("Test Automation Script Passed");
	}

}
