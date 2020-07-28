package basicseleniumfunctions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automobile_EnterVehicleData {

	public static void main(String[] args) throws InterruptedException {
		
		//Set ChromeDriver Path
				System.setProperty("webdriver.chrome.driver","D:\\Java Programs\\Drivers\\chromedriver.exe");
				ChromeDriver dr=new ChromeDriver();
				dr.manage().window().maximize();
				dr.get("http://sampleapp.tricentis.com/");
				
				//Click and get text
				WebElement ele=dr.findElement(By.id("nav_automobile"));
				String data=ele.getText();
				System.out.println(data);
				ele.click();
				// Select Dropdown
				WebElement makeDropDown=dr.findElement(By.name("Make"));
				Select sel=new Select(makeDropDown);
				sel.selectByIndex(4);
				//Thread.sleep(3000);
				//sel.selectByValue("Ford");
				//Thread.sleep(3000);
				//sel.selectByVisibleText("Mercedes Benz");
				dr.findElement(By.id("dateofmanufacture")).sendKeys("12/31/2015");
				WebElement NumberofSeats=dr.findElement(By.name("Number of Seats"));
				Select sel1=new Select(NumberofSeats);
				sel1.selectByValue("5");
				Thread.sleep(3000);
				WebElement FuelType=dr.findElement(By.name("Fuel Type"));
				Select sel2=new Select(FuelType);
				sel2.selectByVisibleText("Diesel");
				Thread.sleep(3000);
								
				//Enter Text
				dr.findElement(By.id("engineperformance")).sendKeys("2000");
				dr.findElement(By.id("listprice")).sendKeys("600");
				dr.findElement(By.id("licenseplatenumber")).sendKeys("QWE12345A");
				dr.findElement(By.id("annualmileage")).sendKeys("2500");
				
				//Button Click
				dr.findElement(By.id("nextenterinsurantdata")).click();
				
				//Page 2
				dr.findElement(By.id("firstname")).sendKeys("Ajinkya");
				dr.findElement(By.id("lastname")).sendKeys("Isankar");
				dr.findElement(By.id("birthdate")).sendKeys("05/12/2000");
				Thread.sleep(3000);
				//WebElement gender=dr.findElementByXPath("//label[text()='Gender']/following::input[@id='gendermale']");
				//gender.click();
				dr.findElementByXPath("//label[@class=\"ideal-radiocheck-label\"]").click();
				
				Thread.sleep(3000);
				WebElement Country=dr.findElement(By.name("Country"));
				Select sel3=new Select(Country);
				sel3.selectByVisibleText("India");
				Thread.sleep(3000);
				dr.findElement(By.id("zipcode")).sendKeys("442305");
				WebElement Occupation=dr.findElement(By.name("Occupation"));
				Select sel4=new Select(Occupation);
				sel4.selectByValue("4");
				Thread.sleep(3000);
				dr.findElement(By.id("other")).click();
				
				
				//dr.get		
				//dr.close();
				//dr.quit();
				System.out.println("Test Automation Script Passed");
			}

		}

	