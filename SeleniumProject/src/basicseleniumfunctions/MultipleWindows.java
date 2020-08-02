package basicseleniumfunctions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/");

		String parent = dr.getWindowHandle();
		System.out.println(parent);

		dr.findElement(By.id("search_form")).sendKeys("BMW");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		dr.findElement(By.id("search_form")).sendKeys("BMW");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		dr.findElement(By.id("search_form")).sendKeys("BMW");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		dr.findElement(By.id("search_form")).sendKeys("BMW");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		dr.findElement(By.id("search_form")).sendKeys("BMW");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		// dr.findElement(By.xpath("//a[text()='Login/Register']")).click();

		/*
		 * Set<String> wins = dr.getWindowHandles(); for (String w : wins) { if
		 * (!w.equals(parent)) { dr.switchTo().window(w); } }
		 */
		/*
		 * for (String w : wins) { dr.switchTo().window(w);
		 * 
		 * //Fetch title String title=dr.getTitle(); if(title.equals("Search Results"))
		 * { break; } }
		 * 
		 * }
		 */
		for(String w:wins)		
		{			
			dr.switchTo().window(w);		
			List<WebElement> elements=dr.findElements(By.xpath(xpathExpression));
			//Fetch title			
			//String title=dr.getTitle();						
			//if(title.equals("Search Results"))			
			{				
				break;			
			}		
			}
		
		dr.findElement(By.xpath("//a[text()='Login/Register']")).click();

		dr.findElement(By.xpath("//input[@id='user_name']")).sendKeys("QWERTY@gmail.com");
		dr.close();
		dr.switchTo().window(parent);
		dr.findElement(By.id("nav_automobile")).click();

	}

}
