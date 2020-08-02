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
				//Click Radio Button
				WebElement radio=dr.findElementByXPath("//label[text()='Male']/span");
				boolean isSelected=radio.isSelected();
				System.out.println(isSelected);
				
				radio.click();
				isSelected=radio.isSelected();
				System.out.println(isSelected);
				
				Thread.sleep(3000);
				WebElement Country=dr.findElement(By.name("Country"));
				Select sel3=new Select(Country);
				sel3.selectByVisibleText("India");
				Thread.sleep(3000);
				dr.findElement(By.id("zipcode")).sendKeys("442305");
				WebElement Occupation=dr.findElement(By.name("Occupation"));
				Select sel4=new Select(Occupation);
				sel4.selectByVisibleText("Selfemployed");
				Thread.sleep(3000);	
				dr.findElementByXPath("//label[contains(.,'Bungee')]/span").click();
				//label[@class='ideal-radiocheck-label'][3]
				//Button Click
				dr.findElement(By.id("nextenterproductdata")).click();
				//Page 3
				dr.findElement(By.id("startdate")).sendKeys("09/03/2020");
				WebElement InsuranceSum=dr.findElement(By.name("Insurance Sum"));
				Select sel5=new Select(InsuranceSum);
				sel5.selectByVisibleText(" 3.000.000,00");
				WebElement MeritRating=dr.findElement(By.name("Merit Rating"));
				Select sel6=new Select(MeritRating);
				sel6.selectByVisibleText("Bonus 1");
				WebElement DamageInsurance=dr.findElement(By.name("Damage Insurance"));
				Select sel7=new Select(DamageInsurance);
				sel7.selectByVisibleText("No Coverage");
				Thread.sleep(2000);	
				dr.findElement(By.xpath("//label[@class=\"ideal-radiocheck-label\"]//input[@id=\"EuroProtection\"]")).click();
				WebElement CourtesyCar=dr.findElement(By.name("Courtesy Car"));
				Select sel8=new Select(CourtesyCar);
				sel8.selectByVisibleText("No");
				
				
				
				//Button Click
				dr.findElement(By.id("nextselectpriceoption")).click();
				//dr.get		
				//dr.close();
				//dr.quit();
				System.out.println("Test Automation Script Passed");
			}

		}

	